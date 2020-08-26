package com.xdpg.pojo;

public class Deptment {

    private Integer id;
    private String deptmentName;

    public Deptment() {
    }

    public Deptment(Integer id, String deptmentName) {
        this.id = id;
        this.deptmentName = deptmentName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptmentName() {
        return deptmentName;
    }

    public void setDeptmentName(String deptmentName) {
        this.deptmentName = deptmentName;
    }

    @Override
    public String toString() {
        return "Deptment{" +
                "id=" + id +
                ", deptmentName='" + deptmentName + '\'' +
                '}';
    }
}
