/**
 * Project Name:dt59homework
 * File Name:Cat.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午3:07:06
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午3:07:06 <br/>
 * @author   DuSen
 * @version
 * @see
 * 10.3编写一个类，定义几个属性，再定义一个带参构造方法，（参数包括所有属性）；
 * 再定义一个类，定义main方法，构造前一个类的实例对象，输出其属性值；
 */
public class Cat {
    String name ;
    String colour;
    char gender;
    int age;

    public Cat(String name ,String colour ,char gender ,int age) {
        this.name=name;
        this.colour=colour;
        this.gender=gender;
        this.age=age;
        System.out.println(this.name+"\n"+this.colour+"\n"+this.gender+"\n"+this.age);
    }

}

