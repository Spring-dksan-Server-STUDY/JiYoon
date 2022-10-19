package com.dksanServer.jiyun.assignment1;

public class KBBank implements Bank{

    @Override
    public void withdrawal(int price) {
        System.out.println("KB 인출");
        if(price > Bank.maxMoney) {
            System.out.println(price + "원 인출 실패");
        }else{
            System.out.println(price + "원 인출 성공");
        }
    }

    @Override
    public void deposit(int price) {
        System.out.println("KB 입금 성공");
    }

    @Override
    public void findAccount(String accountId) {
        Bank.super.findAccount(accountId);
    }

    public void requestAuth(){
        Bank.auth("KBBank");
    }
}
