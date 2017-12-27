/**
 * Project Name:dt59homework
 * File Name:Pig.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午3:19:20
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午3:19:20 <br/>
 * @author   DuSen
 * @version
 * @see
 * 10.4.编写一个类，定义三个以上属性，并定义三个构造方法；再编写一个类，定义main方法，
 * 用三种方式构造前一个类的实例对象；
 */
public class Pig {
    String name;
    String colour;
    char sex;
    int age;

    public Pig(String name) {
        this.name=name;
        System.out.println("a:"+this.name+" "+this.colour+" "+this.sex+" "+this.age);
    }
    public Pig(String name , String colour){
        this(name);
        this.colour=colour;
        System.out.println("b:"+this.name+" "+this.colour+" "+this.sex+"  "+this.age);
    }
    public Pig(String name,String colour ,char sex){
        this(name,colour);
        this.sex=sex;
        System.out.println("c:"+this.name+" "+this.colour+" "+this.sex+"  "+this.age);
    }
    public Pig(String name ,String colour, char sex,int age ){
        this(name,colour,sex);
        this.age=age;
        System.out.println("d:"+this.name+" "+this.colour+" "+this.sex+"  "+this.age);
            
    }

}

