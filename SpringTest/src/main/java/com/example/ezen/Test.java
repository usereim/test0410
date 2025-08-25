package com.example.ezen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// �����ڰ� ���� ����
		Car c = new Car();
		
		
		// ������ ������ ���� spring�� �����ϴ� bean��ü ������
		ApplicationContext context = 
				new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/spring/root-context.xml");
		Car car = context.getBean(Car.class);
		
		System.out.println(c);
		System.out.println(car);
		
		System.out.println(c.getName());
		System.out.println(car.getName());
		
	}

}
