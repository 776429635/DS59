/**
 * Project Name:dt59homework
 * File Name:Luxury.java
 * Package Name:hw20171229.huxury
 * Date:2017年12月29日下午6:46:10
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171229.huxury;

import hw20171229.Vehicle;

/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午6:46:10 <br/>
 * @author   DuSen
 * @version
 * @see
 */
/*3)在hw20171228.huxury类包中，编写一个豪华汽车的类，要求继承第1题中车的抽象类，
 * 重写车的简介方法summary()，输出信息中，包括“我是豪车。。。”形式的内容，
 * 并添加相应属性方法。
*/
public class Luxury extends Vehicle {
    private int money;
    
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void summary(){
        System.out.println("我是豪车。。。价值"+this.getMoney());
    }


}

