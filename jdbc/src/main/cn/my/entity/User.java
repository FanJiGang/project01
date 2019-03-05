package cn.my.entity;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

    private static final long serialVersionUID = 7992142070633325437L;

    private String cn_user_id;
    private String cn_user_name;
    private String cn_user_password;
    private String cn_user_token;
    private String cn_user_nick;

    public User() {
    }

    public User(String cn_user_id, String cn_user_name, String cn_user_password, String cn_user_token, String cn_user_nick) {
        this.cn_user_id = cn_user_id;
        this.cn_user_name = cn_user_name;
        this.cn_user_password = cn_user_password;
        this.cn_user_token = cn_user_token;
        this.cn_user_nick = cn_user_nick;
    }

    public String getCn_user_id() {
        return cn_user_id;
    }
    public void setCn_user_id(String cn_user_id) {
        this.cn_user_id = cn_user_id;
    }
    public String getCn_user_name() {
        return cn_user_name;
    }
    public void setCn_user_name(String cn_user_name) {
        this.cn_user_name = cn_user_name;
    }
    public String getCn_user_password() {
        return cn_user_password;
    }
    public void setCn_user_password(String cn_user_password) {
        this.cn_user_password = cn_user_password;
    }
    public String getCn_user_token() {
        return cn_user_token;
    }
    public void setCn_user_token(String cn_user_token) {
        this.cn_user_token = cn_user_token;
    }
    public String getCn_user_nick() {
        return cn_user_nick;
    }
    public void setCn_user_nick(String cn_user_nick) {
        this.cn_user_nick = cn_user_nick;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(cn_user_id, user.cn_user_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cn_user_id);
    }

    @Override
    public String toString() {
        return "User{" +
                "cn_user_id='" + cn_user_id + '\'' +
                ", cn_user_name='" + cn_user_name + '\'' +
                ", cn_user_password='" + cn_user_password + '\'' +
                ", cn_user_token='" + cn_user_token + '\'' +
                ", cn_user_nick='" + cn_user_nick + '\'' +
                '}';
    }
}
