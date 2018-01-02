/**
 * Project Name:dt59homework
 * File Name:Dog.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午7:07:33
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午7:07:33 <br/>
 * @author   DuSen
 * @version
 * @see
 */
public class Dog extends Pet {
   public Dog (String name,String colour){
        super(name,colour);
    }
 void eat(){
        System.out.println("狗叫" + super.getName() + "它是" + super.getColour() + "爱吃骨头");
 }

}

