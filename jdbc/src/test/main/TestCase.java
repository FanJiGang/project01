package main;

import cn.my.util.MySqlUtil;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestCase {
    private Connection conn;
    private Statement sm;

    @Before
    public void init() throws SQLException {
        conn = MySqlUtil.getConn();
        sm = conn.createStatement();
    }

    //测试查询
    @Test
    public void testConn(){
        String dql="select * from cn_user";
        try {
            ResultSet rs = sm.executeQuery(dql);
            while(rs.next()){
                String id = rs.getString(1);
                System.out.println("id = " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            MySqlUtil.close(conn);
        }

    }

    //测试更新/删除/修改数据
    @Test
    public void testUpdate(){

        String dml="insert into cn_user values('200','老王','123456',null,'隔壁的')";
        String dml_del="delete from cn_user where cn_user_id='200'";
        String dml_change="update cn_user set cn_user_password='234156' where cn_user_id='100'";
        try {
            System.out.println("---------增加------------");
            conn.setAutoCommit(false);
//            int i = sm.executeUpdate(dml);
//            System.out.println("i = " + i);
            System.out.println("-----------修改----------");
            int i2 = sm.executeUpdate(dml_change);
            System.out.println("i2 = "+i2);
            System.out.println("-----------删除--------------");
            int i3 = sm.executeUpdate(dml_del);
            System.out.println("i3 = " + i3);
            conn.commit();
        } catch (SQLException e) {
            MySqlUtil.back(conn);
            e.printStackTrace();
        } finally {
            MySqlUtil.close(conn);
        }
    }

}
