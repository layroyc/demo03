package com.hp.entity;
/*
* 在内存中只有一份
* spring框架默认是单例模式
* */
public class Person {
    //2、在对象本身new自己，而且是一个静态修饰的
    private static Person ourInstance = new Person();

    //3、写出返回自身对象的方法的返回值
    public static Person getInstance() {

        return ourInstance;
    }

    //1、无参构造方法私有化
    private Person() {
    }
}
