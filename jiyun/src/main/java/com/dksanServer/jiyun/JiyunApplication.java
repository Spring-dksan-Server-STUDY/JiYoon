package com.dksanServer.jiyun;

import com.dksanServer.jiyun.week1.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JiyunApplication {

	public static void main(String[] args) {
		SpringApplication.run(JiyunApplication.class, args);

		//클래스 실습
		User user = new User(1, "지윤", "Server");
		user.introduce();

		user.setName("소현");
		user.setPart("아요");

		String name = user.getName();
		System.out.println(name);
		user.introduce();

		//인터페이스 실습
		UserServiceImpl userService = new UserServiceImpl();
		String club = userService.CLUB; //접근 가능
		System.out.println(club);
		userService.getInfo(30, "서버");
		userService.getSOPT();

		//상속 실습
		Server server = new Server("남지윤", "spring");
		String name2 = server.getName();
		String language = server.getStudy();
		System.out.println(name2);
		System.out.println(language);

		server.test();

		//제네릭 실습
		Generic<String> generic1 = new Generic<>("jiyun");
		Generic<Integer> generic2 = new Generic<>(23);
		generic1.printData();
		generic2.printData();
	}

}
