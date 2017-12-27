/**
 * Project Name:dt59homework
 * File Name:Mouse.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午4:46:12
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午4:46:12 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 * 10.6.编写一个类，定义两个属性，其中一个属性前添加static关键字；再定义两个方法，其中一个方法
 * 前添加static关键字；再编写一个类，定义main方法，在main方法中，分别输出前一个类的两个属性，
 * 以及调用两个方法；注意观察不同处，并写上注释
 */
public class Mouse {
    static String name;

    String name1;
    

    public static void cry() {
        System.out.println(name + "吱吱叫");
        // System.out.println(name+"吱吱叫"+name1);
        // 没加static 属性 不能进入 加了 static 的方法中 ，
    }
//
    public void cry1() {
        System.out.println(name1 + "吱吱叫" + name);
        // 加了 static 属性可以进入 没加 static的方法中
    }

}
