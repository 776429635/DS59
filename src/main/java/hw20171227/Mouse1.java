/**
 * Project Name:dt59homework
 * File Name:Mouse1.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午5:24:21
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午5:24:21 <br/>
 * @author   DuSen
 * @version
 * @see
 * 10.6.编写一个类，定义两个属性，其中一个属性前添加static关键字；再定义两个方法，其中一个方法
 * 前添加static关键字；再编写一个类，定义main方法，在main方法中，分别输出前一个类的两个属性，
 * 以及调用两个方法；注意观察不同处，并写上注释
 */
public class Mouse1 {

    public static void main(String[] args) {

        Mouse mouse = new Mouse();
        Mouse.name = "小白";
        //mouse.name=" ";
        Mouse.cry(); // 可以直接从类中直接调用  也  可以  从  对象中调用

        System.out.println("---------------");
        mouse.name1 = "小黑";
        //错误的写法 Mouse.name1=" "; 没加 static不能直接从类中调用·
        mouse.cry1();

    }

}
