package cn.tedu.demo03;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo01 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.put("JSD001","Tom");
        prop.put("JSD002","Jerry");
        prop.put("JSD003","Jim");
        Set<Object> objects = prop.keySet();
        for (Object o : objects) {
            System.out.println("key = " + o);
            System.out.println("value = " + prop.get(o));
        }
        Set<Map.Entry<Object, Object>> entries = prop.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println("key:"+entry.getKey());
            System.out.println("value:"+entry.getValue());
        }
    }
}
