package com.dksanServer.jiyun.week1;

public class User {
    private int id;
    private String name;
    private String part;

    public void introduce(){
        System.out.println("이름: " + name +", 파트: " + part);
    }

    public User(int id, String name, String part) {
        this.id = id;
        this.name = name;
        this.part = part;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }
}
