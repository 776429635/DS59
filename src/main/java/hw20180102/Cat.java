/**
 * Project Name:dt59homework
 * File Name:Cat.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午7:07:40
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午7:07:40 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
//第二题  子类
public class Cat extends Pet {
    public Cat(String name, String colour) {

        super(name, colour);

    }

    void eat() {
        System.out.println("猫叫" + super.getName() + "它是" + super.getColour() + "爱吃鱼和老鼠");
    }

}
