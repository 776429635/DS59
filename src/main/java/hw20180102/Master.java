/**
 * Project Name:dt59homework
 * File Name:Master.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午8:00:28
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午8:00:28 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
public class Master {
    private String name = " ";

    public Master(String name) {
        this.name = name;

    }
    public void feed(Pet pet){
        pet.eat();
    }

}
