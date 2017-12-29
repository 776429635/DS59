/**
 * Project Name:dt59homework
 * File Name:Dolly.java
 * Package Name:hw20171229
 * Date:2017年12月29日下午5:58:34
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171229;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午5:58:34 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
// 在hw20171228类包中，编写一个车的抽象类，先定义车的简介方法summary()，输出车的概要信息，
// 再自由定义两个属性、两个方法；定义一个小汽车的类和大卡车的类， 要求：a）继承车的抽象类,
// b）分别定义一个以上的属性和方法
// 小车
public class Dolly extends Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;

    }

    void r() {
        summary();
        a();
        b();
        System.out.println("这辆叫" + this.getName() + "可以倒车"+"\n"
              +"颜色是"+this.getColour()+"他有"+this.getWheel()+"个轮子");
    }

}
