package com.audit.spring5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest2 {
    public static void main(String[] args) {
        ApplicationContext a = new ClassPathXmlApplicationContext("bean2.xml");
        Student S = a.getBean("Student",Student.class);
        System.out.println("第四步，获取对象");
        System.out.println(S);
        //手动销毁
        ((ClassPathXmlApplicationContext)a).close();
    }
}
