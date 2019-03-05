package main;

import cn.my.dao.UserDao;
import cn.my.dao.UserDaoImpl;
import cn.my.entity.User;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class TestUser {

    private UserDao dao;

    @Before
    public void init(){
        dao=new UserDaoImpl();
    }

    @Test
    public void testAdd(){
        User user = new User("300", "老李", "098765", null, "另一边隔壁");
        dao.addUser(user);
    }

    @Test
    public void testDel(){
        dao.deleteUser("300");
    }

    @Test
    public void testChange(){
        dao.changeUser(new User("300","老王","123456","改名了","隔壁的"));
    }

    @Test
    public void testFindAll(){
        List<User> list = dao.findAll();
        int i=1;
        for (User user : list) {
            System.out.println(i++ +".user = " + user);
        }
    }

    @Test
    public void testFindById(){
        User user=dao.findById("300");
        System.out.println(user);
    }
}
