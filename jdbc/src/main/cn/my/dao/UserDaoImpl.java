package cn.my.dao;

import cn.my.entity.User;
import cn.my.util.MySqlUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private static Connection conn;

    static{
        try {
            conn=MySqlUtil.getConn();
            conn.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addUser(User user) {
        String cn_user_id=user.getCn_user_id();
        String cn_user_name = user.getCn_user_name();
        String cn_user_password = user.getCn_user_password();
        String cn_user_token = user.getCn_user_token();
        String cn_user_nick = user.getCn_user_nick();
        String dml="insert into cn_user values(?,?,?,?,?)";
        try {
            PreparedStatement ps=conn.prepareStatement(dml);
            ps.setString(1,cn_user_id);
            ps.setString(2,cn_user_name);
            ps.setString(3,cn_user_password);
            ps.setString(4,cn_user_token);
            ps.setString(5,cn_user_nick);
            int index = ps.executeUpdate();
            if(index==1){
                conn.commit();
            }else{
                conn.rollback();
            }
        } catch (SQLException e) {
            MySqlUtil.back(conn);
            e.printStackTrace();
        } finally {
            MySqlUtil.close(conn);
        }
    }

    @Override
    public void deleteUser(String id) {
        String dml="delete from cn_user where cn_user_id=?";
        try {
            PreparedStatement ps=conn.prepareStatement(dml);
            ps.setString(1,id);
            int index = ps.executeUpdate();
            if (index==1){
                conn.commit();
            }else{
                conn.rollback();
            }
        } catch (SQLException e) {
            MySqlUtil.back(conn);
            e.printStackTrace();
        } finally {
            MySqlUtil.close(conn);
        }
    }

    @Override
    public void changeUser(User user) {
        String cn_user_id = user.getCn_user_id();
        String cn_user_name = user.getCn_user_name();
        String cn_user_password = user.getCn_user_password();
        String cn_user_token = user.getCn_user_token();
        String cn_user_nick = user.getCn_user_nick();
        String dml="update cn_user set cn_user_name=?,cn_user_password=?,cn_user_token=?,cn_user_nick=? where cn_user_id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(dml);
            ps.setString(1,cn_user_name);
            ps.setString(2,cn_user_password);
            ps.setString(3,cn_user_token);
            ps.setString(4,cn_user_nick);
            ps.setString(5,cn_user_id);
            int i = ps.executeUpdate();
            if (i == 1) {
                conn.commit();
            }else {
                conn.rollback();
            }
        } catch (SQLException e) {
            MySqlUtil.back(conn);
            e.printStackTrace();
        } finally {
            MySqlUtil.close(conn);
        }
    }

    @Override
    public List<User> findAll() {
        String dql="select * from cn_user";
        List<User> list=new ArrayList<User>();
        try {
            Statement sm = conn.createStatement();
            ResultSet rs = sm.executeQuery(dql);
            User user;
            while (rs.next()){
                String id = rs.getString(1);
                String name=rs.getString(2);
                String password = rs.getString(3);
                String token = rs.getString(4);
                String nick=rs.getString(5);
                user=new User(id,name,password,token,nick);
                list.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public User findById(String id) {
        String dql="select * from cn_user where cn_user_id=?";
        User user=null;
        try {
            PreparedStatement ps = conn.prepareStatement(dql);
            ps.setString(1,id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                String name = rs.getString(2);
                String password = rs.getString(3);
                String token = rs.getString(4);
                String nick = rs.getString(5);
                user=new User(id,name,password,token,nick);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
