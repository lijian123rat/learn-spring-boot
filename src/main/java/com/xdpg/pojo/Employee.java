package com.xdpg.pojo;

import java.util.Date;

public class Employee {
    private Integer id;
    private String userName;
    private String passWord;
    private Integer sex;
    private Date brith;
    private Deptment deptment;

    public Employee(Integer id, String userName, String passWord, Integer sex,Deptment deptment) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.sex = sex;
        this.brith = new Date();
        this.deptment = deptment;
    }

    public Date getBrith() {
        return brith;
    }

    public void setBrith(Date brith) {
        this.brith = brith;
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

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }


    public Deptment getDeptment() {
        return deptment;
    }

    public void setDeptment(Deptment deptment) {
        this.deptment = deptment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", sex=" + sex +
                ", brith='" + brith + '\'' +
                ", deptment=" + deptment +
                '}';
    }
}
