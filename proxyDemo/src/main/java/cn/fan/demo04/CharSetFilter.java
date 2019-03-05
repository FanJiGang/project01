package cn.fan.demo04;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 使用动态代理方式解决中文乱码问题
 */
public class CharSetFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        final HttpServletRequest httpReq=(HttpServletRequest) req;
        HttpServletRequest myReq=(HttpServletRequest) Proxy.newProxyInstance(CharSetFilter.class.getClassLoader(), httpReq.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object obj=null;
                if ("getParameter".equals(method.getName())) {
                    if ("get".equalsIgnoreCase(httpReq.getMethod())) {
                        String str = (String)method.invoke(httpReq,args);
                        System.out.println("str = " + str);
                        /*
                         * str.getBytes("xxx");
                         * 因修改过了tomcat配置文件(server.xml),现在使用utf-8方式解码数据
                         * 若未修改,tomcat默认使用iso-8859-1来解码:
                         *      则先将数据按照iso-8859-1方式还原为字节,再使用utf-8方式编码成字符串
                         *      str.getBytes("iso-8859-1");
                         */
                        return new String(str.getBytes("utf-8"),"utf-8");
                    } else if("post".equalsIgnoreCase(httpReq.getMethod())) {
                        httpReq.setCharacterEncoding("utf-8");
                        obj = method.invoke(httpReq,args);
                        System.out.println("obj = " + obj);
                    }
                } else {
                    obj = method.invoke(httpReq,args);
                }
                return obj;
            }
        });
        System.out.println("myReq.hashCode() = " + myReq.hashCode());
        chain.doFilter(myReq,resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
