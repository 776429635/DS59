/**
 * Project Name:dt59homework
 * File Name:Vehicle.java
 * Package Name:hw20171229
 * Date:2017年12月29日下午2:44:09
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171229;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午2:44:09 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */

/*
 * 1)在hw20171228类包中，编写一个车的抽象类，先定义车的简介方法summary()，输出车的概要信息，
 * 再自由定义两个属性、两个方法；定义一个小汽车的类和大卡车的类， 要求：a）继承车的抽象类,b）分别定义一个以上的属性和方法
 */

public abstract class Vehicle {

    private int wheel;
    
    private String colour;
    
    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


    public void summary() {
        System.out.println("这是一辆车");
    }
    void a(){
        System.out.println("这辆车可以动");
    }
    void b(){
        System.out.println("这辆车可以停下来");
    }

}
