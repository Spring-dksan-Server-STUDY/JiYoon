package com.dksanServer.jiyun;

import com.dksanServer.jiyun.assignment1.Bank;
import com.dksanServer.jiyun.assignment1.KBBank;
import com.dksanServer.jiyun.assignment1.impl.KakaoAuthService;
import com.dksanServer.jiyun.week1.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JiyunApplication {

	public static void main(String[] args) {
		SpringApplication.run(JiyunApplication.class, args);

//		//클래스 실습
//		User user = new User(1, "지윤", "Server");
//		user.introduce();
//
//		user.setName("소현");
//		user.setPart("아요");
//
//		String name = user.getName();
//		System.out.println(name);
//		user.introduce();
//
//		//인터페이스 실습
//		UserServiceImpl userService = new UserServiceImpl();
//		String club = userService.CLUB; //접근 가능
//		System.out.println(club);
//		userService.getInfo(30, "서버");
//		userService.getSOPT();
//
//		//상속 실습
//		Server server = new Server("남지윤", "spring");
//		String name2 = server.getName();
//		String language = server.getStudy();
//		System.out.println(name2);
//		System.out.println(language);
//
//		server.test();
//
//		//제네릭 실습
//		Generic<String> generic1 = new Generic<>("jiyun");
//		Generic<Integer> generic2 = new Generic<>(23);
//		generic1.printData();
//		generic2.printData();


		//assignment1
		KBBank bank = new KBBank();
		System.out.println("인출 가능 최대 금액 : " + KBBank.maxMoney);
		bank.requestAuth();
		bank.withdrawal(1000000000);
		bank.withdrawal(1000);
		bank.deposit(1000);
		bank.findAccount("3333-0808-42722");

		KakaoAuthService kakaoAuthService = new KakaoAuthService();
		kakaoAuthService.signUp("남지윤");
		kakaoAuthService.login(1);
	}

}
