/**
 * Project Name:dt59homework
 * File Name:Vip.java
 * Package Name:hw20171225
 * Date:2017年12月25日下午6:30:06
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171225;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午6:30:06 <br/>
 * 
 * @author DuSen
 * @version
 * @see
 */
public class Vip {
    String vip1 = "白银级";

    String vip2 = "黄金级";

    String vip3 = "铂金级";

    String vip4 = "钻石级";

    String vip5 = "至尊级";

    double a(double grade, double money) {
        if (grade == 1) {
            money = money * 0.95;
        } else if (grade == 2) {
            money = money * 0.90;
        } else if (grade == 3) {
            money = money * 0.85;
        } else if (grade == 4) {
            money = money * 0.80;
        } else if (grade == 5) {
            money = money * 0.75;
        }
        return money;
    }

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        Vip vvip = new Vip();
        System.out.println("vip等级" + "\n1、白银级" + "\n2、黄金级" + "\n3、铂金级" + "\n4、钻石级" + "\n5、至尊级");
        double grade = sca.nextDouble();
        System.out.println("已收金额：");
        double money = sca.nextDouble();
        double c = vvip.a(grade, money);
        System.out.println("实际消费：" + c+"元");
    }
}
