package com.yiibai.tutorial.spring;

import com.yiibai.tutorial.spring.helloworld.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloProgram {
	public static void main(String[] args){
		//通过读取beans.xml文件来创建一个应用程序上下文对象。
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		/*
		  IoC容器中，其作用是作为第三种角色，它的任务是创建 beans.xml 文件中声明的 Java Bean 对象。并通过setter方法注入依赖
		在这个例子中，HelloWorldService 是一个 java bean 注入依赖。
		 */
		HelloWorldService service = 
				(HelloWorldService)context.getBean("helloWorldService");
		
		HelloWorld hw = service.getHelloWorld();
		
		hw.sayHello();
	}
}
