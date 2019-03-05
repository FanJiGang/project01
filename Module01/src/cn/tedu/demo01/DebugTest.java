package cn.tedu.demo01;

import java.util.HashMap;

public class DebugTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        HashMap<String, String> map = new HashMap<>();
        map.put("name","Tom");
        map.put("age","28");
        map.put("school","Tashan");
        map.put("major","IT");

        String age=map.get("age");
        System.out.println("age= " + age);

        map.remove("major");
        System.out.println(map);

    }
}
