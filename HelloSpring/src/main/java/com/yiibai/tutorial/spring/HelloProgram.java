package com.yiibai.tutorial.spring;

import com.yiibai.tutorial.spring.helloworld.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloProgram {
	public static void main(String[] args){
		//ͨ����ȡbeans.xml�ļ�������һ��Ӧ�ó��������Ķ���
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		/*
		  IoC�����У�����������Ϊ�����ֽ�ɫ�����������Ǵ��� beans.xml �ļ��������� Java Bean ���󡣲�ͨ��setter����ע������
		����������У�HelloWorldService ��һ�� java bean ע��������
		 */
		HelloWorldService service = 
				(HelloWorldService)context.getBean("helloWorldService");
		
		HelloWorld hw = service.getHelloWorld();
		
		hw.sayHello();
	}
}
