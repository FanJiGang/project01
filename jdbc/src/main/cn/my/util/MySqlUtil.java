package cn.my.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public abstract class MySqlUtil {
    private static String driver;
    private static String url;
    private static String username;
    private static String password;

    static{
        Properties p = new Properties();
        InputStream in = MySqlUtil.class.getClassLoader().getResourceAsStream("mysql.properties");
        try {
            p.load(in);
            p.load(in);
            driver=p.getProperty("driver");
            url=p.getProperty("url");
            username=p.getProperty("username");
            password=p.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static Connection getConn(){
        Connection conn=null;
        try {
            Class.forName(driver);
            conn=DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(Connection conn){
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void back(Connection conn){
        if (conn != null) {
            try {
                conn.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
