package com.jokey.loop.while_loop;

import java.util.Scanner;

/**
 * @author Jokey Zhou
 * @version 1.0
 * @date 2020/2/24 16:46
 * @description:
 * 从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序
 *
 * 赛博世界并不是辽阔的荒野，数据也不全是冰冷的记录，它是亲人的笑靥，它是我们的记忆。
 */
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数(输入0时退出)： ");
        int positiveNum = 0;  // 初始化正数的个数
        int negativeNum = 0;  // 初始化负数的个数

        while (true) {
            int number = scanner.nextInt();
            if (number > 0) {
                positiveNum ++;
            } else if (number < 0){
                negativeNum ++;
            } else {
                break;
            }
        }

        System.out.printf("正数的个数为%d，负数的个数为%d", positiveNum, negativeNum);
    }
}
