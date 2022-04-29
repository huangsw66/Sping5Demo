package com.audit.spring5;

public class Student {
    private String name;

    public Student() {
        System.out.println("第一步，构造器创建实例");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("第二步，set方法设置属性值");
    }
    public void initMethod(){
        System.out.println("第三步初始化方法");
    }

    public void destoryMethod(){
        System.out.println("第五步初始化方法");
    }
}
