/**
 * Project Name:dt59homework
 * File Name:TestTypeDefaultValue.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午2:25:55
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午2:25:55 <br/>
 * @author   DuSen
 * @version
 * @see
 * 10.1.编写一个类TypeDefaultValue，并定义十个属性，前八个属性分别定义为8种基本数据类型；
 * 最后两属性类型分别定义为String和int[];编写另一个类TestTypeDefaultValue，定义main方法，
 * 在main方法，输出TypeDefaultValue类对象的每一个属性值；观察每种类型属性，默认值是什么， 
 * 并以注释的形式在属性前说明。
 */
public class TestTypeDefaultValue {

    public static void main(String[] args) {
        TypeDefaultValue data=new TypeDefaultValue();
        System.out.println("byte:"+data.a);
        System.out.println("short:"+data.b);
        System.out.println("int:"+data.c);
        System.out.println("long:"+data.d);
        System.out.println("float:"+data.e);
        System.out.println("double:"+data.f);
        System.out.println("char:"+data.g);
        System.out.println("boolean:"+data.h);
        System.out.println("String:"+data.i);
        System.out.println("int[]:"+data.j);

    }

}

