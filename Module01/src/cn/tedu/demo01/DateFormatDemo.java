package cn.tedu.demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
    public static void main(String[] args) {
        String input="2018年11月20号 18:24:00";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd号 HH:mm:ss");
        Date date= null;
        try {
            date = sdf.parse(input);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
    }
}
