package com.haeun.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		Student stu1 = ctx.getBean("student1", Student.class);
		Student stu2 = ctx.getBean("student2", Student.class);
		Student stu3 = ctx.getBean("student3", Student.class);
		
		System.out.println(stu1.getName());
		System.out.println(stu2.getName());
		System.out.println(stu3.getName());
		
		ctx.close();
	}

}
