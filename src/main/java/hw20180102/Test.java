/**
 * Project Name:dt59homework
 * File Name:TestPet.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午7:19:20
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午7:19:20 <br/>
 * @author   DuSen
 * @version
 * @see
 */
//第二题 测试
public class Test {

    public static void main(String[] args) {
        Pet pet=new Cat("小叮当","白色");
        Pet pet1=new Dog("旺财","黄色");
        Master m=new Master("张三");
        m.feed(pet); // 这一步 过程不是很能理解
        m.feed(pet1);//这一步 过程不是很能理解

    }

}

