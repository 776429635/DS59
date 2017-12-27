/**
 * Project Name:dt59homework
 * File Name:Dog.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午2:37:19
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:37:19 <br/>
 * 
 * @author DuSen
 * @version
 * @see 编写一个类，定义几个属性，同时给属性赋值；再定义一个无参数构造方法，在构造方法中， 首先输出各属性值到控制台，再给属性赋值；观察输出值内容。
 */
public class Dog {
    String name = "旺财";

    String colour = "黄色";

    char gender = '公';

    int age = 2;

    public Dog() {
//        name="小花";
//        colour="黑色";
//        gender='母';
//        age=3;
        System.out.println(name+"\n"+colour+"\n"+gender+"\n"+age);
    } //当无参构造中如果属性没有申明  输出结果是使用初始属性的赋值  
      //当无参构造中属性有赋值  输出结果是使用无参构造中的属性赋值

    public static void main(String[] args) {
        new Dog();

    }

}
