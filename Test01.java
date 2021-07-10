package com.hp.entity;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {//main方法的快捷键    psvm
        System.out.println("we will rock you");//输出     sout
        String name = "王源";
        System.out.println("name = " + name);//显示出变量    soutv
        System.out.println("Test01.main");//输出方法的名称     soutm
        System.out.println("args = [" + args + "]");//输出方法的参数   soutp
        int age = 20;
        if (age <18) {//if的快捷键  ifn
            System.out.println("未成年");
        }else{
            System.out.println("已经是成年人了");
        }

        ArrayList<String> list = new ArrayList<>();//万能快捷键 alt + enter
        list.add("roy");//快速复制一行    Ctrl + d
        list.add("roy");//快速删除一行    Ctrl + y

        list.add("王源");//一步撤销  Ctrl + z
        list.add("lay");//多步撤销  Ctrl + shift + z
        list.add("lay");//多行编辑  alt + 鼠标
        list.add("lay");

        for (String s : list) {//遍历循环   iter
            System.out.println("s = " + s);
        }

       User u =  new User();//能new 构造方法是公开的
        u.setId(1);
        u.setName("张三");
        u.setAge(19);
        System.out.println(u);

        //每次new 都会创建一个新对象
        User u2 =  new User();
        u2.setId(1);
        u2.setName("张三");
        u2.setAge(19);
        System.out.println("=======" + u2);

        //判断u u2 是否相等
        System.out.println(u==u2);//false


        //单例模式测试
        Person p1 = Person.getInstance();//不能new 无参构造私有化
        Person p2 = Person.getInstance();

        System.out.println(p1==p2);//true

    }
}
