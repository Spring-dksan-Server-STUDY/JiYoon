package com.dksanServer.jiyun.assignment1;

public interface Bank {
    //상수필드
    int maxMoney = 100000;

    //추상메소드
    void withdrawal(int price);
    void deposit(int price);

    //디폴트메소드
    default void findAccount(String accountId){
        System.out.println("금융개정원에서 제공하는 로직");
        System.out.println(accountId + " 계정 찾기");
    }

    //정적메소드
    static void auth(String backName){
        System.out.println(backName + "에서 인증요청. 인증은 무조건 해야 해.");
    }

}
