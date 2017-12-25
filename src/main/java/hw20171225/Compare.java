/**
 * Project Name:dt59homework
 * File Name:Compare.java
 * Package Name:hw20171225
 * Date:2017年12月25日下午5:19:53
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171225;

import java.util.Scanner;

/**
 * Description:   <br/>
 * Date:     2017年12月25日 下午5:19:53 <br/>
 * @author   DuSen
 * @version
 * @see
 */
public class Compare {

    int a(int b, int c) {
        if (b > c) {
            System.out.println("较大值为");
            return b;
        } else if (b < c) {
            System.out.println("较大值为");
            return c;
        } else {
            System.out.println("两个值相等");
            return b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        Compare com = new Compare();
        System.out.println("请输入第一个值：");
        int b = sca.nextInt();
        System.out.println("请输入第二个值：");
        int c = sca.nextInt();
        int d = com.a(b, c);
        System.out.println(d);

    }

}
