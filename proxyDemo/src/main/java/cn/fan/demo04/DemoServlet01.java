package cn.fan.demo04;

import java.io.IOException;

public class DemoServlet01 extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("post");
        String username = request.getParameter("username");
        System.out.println("post:request = " + request.hashCode());
        System.out.println("username = " + username);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("get");
        String username = request.getParameter("username");
        System.out.println("get:request = " + request.hashCode());
        System.out.println("username = " + username);
    }
}
