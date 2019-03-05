package cn.my.dao;

import cn.my.entity.User;

import java.util.List;

public interface UserDao {
    //增
    void addUser(User user);
    //删
    void deleteUser(String id);
    //改
    void changeUser(User user);
    //查
    List<User> findAll();
    User findById(String id);

}
