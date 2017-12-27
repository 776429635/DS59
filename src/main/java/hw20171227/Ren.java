/**
 * Project Name:dt59homework
 * File Name:Ren.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午4:03:26
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午4:03:26 <br/>
 * @author   DuSen
 * @version
 * @see
 * 10.5.编写一个类，定义几个属性，每个属性前添加private修饰符；为每个属性，添加get/set方法
 * ，方法前添加public修饰符；再编写一个类，定义main方法，
 * 在main方法中，构造前一个类的实例对象，并调用实例对象的set方法
 * ，设置对应数据值；最后调用get方法，输出对应属性值到控制台。
 */
public class Ren {
    private String name;
    private String profession;
    private char sex;
    private int age;
    public String getName() {
        return name;
    }
    public String getProfession() {
        return profession;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    

}

