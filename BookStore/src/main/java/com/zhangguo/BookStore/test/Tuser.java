package com.zhangguo.BookStore.test;

public class Tuser {
    private Integer id;
    private String userName,password,nickName;
 
    @Override
    public String toString() {
        return "Tuser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
 
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getUserName() {
        return userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
    public String getNickName() {
        return nickName;
    }
 
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}