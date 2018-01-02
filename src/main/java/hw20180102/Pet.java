/**
 * Project Name:dt59homework
 * File Name:Pet.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午7:07:48
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午7:07:48 <br/>
 * @author   DuSen
 * @version
 * @see
 */
/*第二题父类
 * 场景一 父类：宠物类 Pet 
 * 子类：狗类 Dog，猫类Cat；
 *  多态的方法（eat）：各子类的不同实现 ,狗吃骨头，猫吃鱼
 */
public abstract class Pet {
    private String name;
    private String colour;
    public Pet(String name ,String colour){
         this.setName(name);
         this.setColour(colour);
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    abstract void eat();


}

