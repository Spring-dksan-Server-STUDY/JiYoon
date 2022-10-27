package com.dksanServer.jiyun.week1;

public class Server extends Part {
    private String language;

    @Override
    public void test() {
        super.test();
        System.out.println("자식 클래스");
    }

    public String getStudy() {
        return language;
    }

    public void setStudy(String language) {
        this.language = language;
    }

    public Server(String name, String language) {
        super(name);
        this.language = language;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
