/**
 * Project Name:dt59homework
 * File Name:Student1.java
 * Package Name:Work201712234
 * Date:2017年12月24日下午3:38:43
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package Work201712234;
/**
 * Description:   <br/>
 * Date:     2017年12月24日 下午3:38:43 <br/>
 * @author   lenovopc
 * @version
 * @see
 */
public class Student1 {

    public static void main(String[] args) {
        Student student1;
        student1=new Student();
        student1.name="张三";
        student1.gender="男";
        student1.age=23;
        student1.height=175;
        student1.weight=60;
        System.out.println("姓名："+student1.name);
        System.out.println("性别："+student1.gender);
        System.out.println("年龄："+student1.age+"岁");
        System.out.println("身高："+student1.height);
        System.out.println("体重："+student1.weight);
        student1.play();
        student1.study();
        int a=student1.time();
        System.out.println("学了多久："+a+"天 ");

    }

}

