package com.jokey.switch_case;

import java.util.Scanner;

/**
 * @author Jokey Zhou
 * @version 1.0
 * @date 2020/2/23 16:55
 * @description:
 * 从键盘分别输入年、月、日，判断这一天是当年的第几天
 * 注：判断一年是否是闰年的标准：
 * 1）可以被4整除，但不可被100整除
 * 或
 * 2）可以被400整除
 *
 * 赛博世界并不是辽阔的荒野，数据也不全是冰冷的记录，它是亲人的笑靥，它是我们的记忆。
 */
public class DateTest2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年：");
        int year = scanner.nextInt();
        System.out.println("请输入月：");
        int month = scanner.nextInt();
        System.out.println("请输入日：");
        int day = scanner.nextInt();

        int sumDays = 0;
        switch (month) {
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                // 判断闰年的方法
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    sumDays += 29;
                } else {
                    sumDays += 28;
                }
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;
        }
        System.out.printf("%d月%d日是%d年的第%d天",month,day,year,sumDays);
    }
}
