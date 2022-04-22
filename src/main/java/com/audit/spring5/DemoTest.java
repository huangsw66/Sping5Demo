package com.audit.spring5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class DemoTest {
//            1、https://blog.csdn.net/weixin_45496190/article/details/107059038
//            2、https://blog.csdn.net/weixin_45496190/article/details/107067200
//            3、https://blog.csdn.net/weixin_45496190/article/details/107071204
//            4、https://blog.csdn.net/weixin_45496190/article/details/107082732
//            5、https://blog.csdn.net/weixin_45496190/article/details/107092107

/*    一、IOC容器
        1、什么是IOC（控制反转）
            a）把对象创建和对象之间的调用过程，交给Spring进行管理
            b）使用IOC目的：为了降低耦合度
        2、IOC底层
            a）xml解析、工厂模式、反射
        3、Spring提供的IOC容器实现的两种方式（两个接口）
            a）BeanFactory接口：IOC容器基本实现是Spring内部接口的使用接口，不提供给开发人员进行使用（加载配置文件时候不会创建对象，在获取对象时才会创建对象。）
            b）ApplicationContext接口：BeanFactory接口的子接口，提供更多更强大的功能，提供给开发人员使用（加载配置文件时候就会把在配置文件对象进行创建）推荐使用！
        4、ApplicationContext接口的实现类（具体根据API文档查看☺）*/

    public static void main(String[] args) {
        ApplicationContext a = new  ClassPathXmlApplicationContext("bean.xml");//获取spring xml配置文件
        User u = a.getBean("user",User.class);//获取xml中的bean
        u.add();
        Book book = a.getBean("book1",Book.class);
        System.out.println(book.getName()+book.getAuthor());
    }
}
