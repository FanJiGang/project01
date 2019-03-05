package cn.tedu.demo01;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name","Tom");
        map.put("age","25");
        map.put("class","tashan");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key = " + key);
            System.out.println("value = " + value);
        }
    }
}
