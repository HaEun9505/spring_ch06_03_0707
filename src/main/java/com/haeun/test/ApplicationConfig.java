package com.haeun.test;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//DI 설정해주는 Container클래스 - 스프링 설정에 사용되는 클래스
@Configuration
public class ApplicationConfig {
	
	@Bean
	public Student student1() {	//반환되는 자료타입이 Student클래스, student1:bean의 이름(id)
		
		ArrayList<String> hobbys = new ArrayList<String>();	//배열 객체
		hobbys.add("운동");
		hobbys.add("노래");
		
		//생성자에 설정(constructor)
		Student student = new Student("홍길동", 25, hobbys);
		
		//생성자 없으므로, setter(property에 설정)
		student.setWeight(80);
		student.setHeight(180);
		return student;
	}
	@Bean
	public Student student2() {	//반환되는 자료타입이 Student클래스, student2:bean의 이름(id)
		
		ArrayList<String> hobbys = new ArrayList<String>();	//배열 객체
		hobbys.add("달리기");
		hobbys.add("자전거");
		
		//생성자에 설정(constructor)
		Student student = new Student("김유신", 25, hobbys);
		
		//생성자 없으므로, setter(property에 설정)
		student.setWeight(60);
		student.setHeight(150);
		return student;
	}
	
}