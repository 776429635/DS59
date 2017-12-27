/**
 * Project Name:dt59homework
 * File Name:Ren1.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午4:28:19
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午4:28:19 <br/>
 * @author   DuSen
 * @version
 * @see
 *10.5.编写一个类，定义几个属性，每个属性前添加private修饰符；为每个属性，添加get/set方法
 * ，方法前添加public修饰符；再编写一个类，定义main方法，
 * 在main方法中，构造前一个类的实例对象，并调用实例对象的set方法
 * ，设置对应数据值；最后调用get方法，输出对应属性值到控制台。
 */
public class Ren1 {

    public static void main(String[] args) {
        Ren ren=new Ren();
        ren.setName("张三");
        ren.setProfession("学生");
        ren.setSex('男');
        ren.setAge(18);
        System.out.println("姓名："+ren.getName()+
                "\n职业："+ren.getProfession()+
                "\n性别："+ren.getSex()+
                "\n年龄："+ren.getAge());
    }

}

