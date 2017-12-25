/**
 * Project Name:dt59homework
 * File Name:Dog1.java
 * Package Name:Work201712234
 * Date:2017年12月24日下午2:22:27
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package Work20171224;
/**
 * Description:   <br/>
 * Date:     2017年12月24日 下午2:22:27 <br/>
 * @author   lenovopc
 * @version
 * @see
 */
public class Dog1 {

    public static void main(String[] args) {
        Dog dog1;
        dog1=new Dog();
        dog1.name="旺财";
        dog1.tinct="黑白";
        dog1.age=1;
        dog1.gender="雄";
        System.out.println("----------------------------");
        System.out.println("狗名："+dog1.name);
        System.out.println("年龄："+dog1.age+"岁");
        System.out.println("性别："+dog1.gender);
        System.out.println("颜色："+dog1.tinct);
        dog1.eat();
        dog1.play();
        dog1.voice();
        System.out.println("----------------------------");
        System.out.print("狗名："+dog1.name+"\n"+"年龄："+dog1.age+"岁\n"
                +"性别："+dog1.gender+"\n"+"颜色："+dog1.tinct+"\n");
        }

}

