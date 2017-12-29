/**
 * Project Name:dt59homework
 * File Name:Truck.java
 * Package Name:hw20171229
 * Date:2017年12月29日下午6:27:55
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171229;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午6:27:55 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
// 在hw20171228类包中，编写一个车的抽象类，先定义车的简介方法summary()，输出车的概要信息，
// 再自由定义两个属性、两个方法；定义一个小汽车的类和大卡车的类，
// 要求：a）继承车的抽象类,b）分别定义一个以上的属性和方法

public class Truck extends Vehicle {
    private String container;

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    void money() {
        summary();
        a();
        b();
        System.out.println(this.getColour() + "\n" + this.getWheel() + "个轮子" + "\n" + "可以装" + this.getContainer());
    }

}
