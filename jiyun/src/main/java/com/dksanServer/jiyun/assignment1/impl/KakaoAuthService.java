package com.dksanServer.jiyun.assignment1.impl;

import com.dksanServer.jiyun.assignment1.AuthService;

public class KakaoAuthService implements AuthService {

    @Override
    public void signUp(String name) {
        System.out.println(name + " 유저 회원가입 완료");
    }

    @Override
    public void login(int userId) {
        System.out.println("로그인 완료");
    }
}
