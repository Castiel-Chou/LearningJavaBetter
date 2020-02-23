package com.jokey.switch_case;

import java.util.Scanner;

/**
 * @author Jokey Zhou
 * @version 1.0
 * @date 2020/2/23 16:33
 * @description:
 * 编写程序：从键盘上输入2019年的“month”和“day”，要求通过程序输出输入的日期为2019年的第几天
 *
 * 赛博世界并不是辽阔的荒野，数据也不全是冰冷的记录，它是亲人的笑靥，它是我们的记忆。
 */
public class DateTest1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入2019年的一个月份：");
        int month = scanner.nextInt();
        System.out.println("请输入2019年的一天：");
        int day = scanner.nextInt();

        // 由于该程序正写非常冗余，且前面的结果都可以继续使用，因此可以倒着写
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
                sumDays += 28;
            case 2:
                sumDays += 31; // 这里表示的意思是在1月份31天的基础上加上输入进来的这个日期 得到天数总和
            case 1:
                sumDays += day;
        }
        System.out.println(month+"月"+day+"日，是2019年的第"+sumDays+"天");

    }
}
