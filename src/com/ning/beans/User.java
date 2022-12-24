package com.ning.beans;

/**
 * ClassName: User
 * Package: com.ning.beans
 * Description:
 *
 * @Author: Ning
 * @Create: 2022/12/6 - 20:37
 */
public class User {
    private String id;
    private String name;
    private String password;
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(){

    }

    /**
     * 登录类使用
     * @param password
     * @param email
     */
    public User(String password, String email) {
        this.password = password;
        this.email = email;
    }

    /**
     * 注册类使用
     * @param name
     * @param password
     * @param email
     */
    public User(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    /**
     * 测试类使用
     * @param id
     * @param name
     * @param password
     * @param email
     */
    public User(String id, String name, String password, String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;

    }
}
