/**
 * Project Name:dt59homework
 * File Name:Dolly1.java
 * Package Name:hw20171229
 * Date:2017年12月29日下午6:39:31
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171229;
/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午6:39:31 <br/>
 * @author   DuSen
 * @version
 * @see
 */
//2)接第1题，在小汽车类中，添加输出小洗车整体介绍信息方法，方法中，除输出小洗车本类中的属性外，
//还要输出父类中的属性信息。
public class Dolly1 extends Vehicle {
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

