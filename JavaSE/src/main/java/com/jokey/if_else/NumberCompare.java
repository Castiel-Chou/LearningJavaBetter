package com.jokey.if_else;

import java.util.Scanner;

/**
 * @author Jokey Zhou
 * @version 1.0
 * @date 2020/2/23 11:48
 * @description:
 * 编写程序：由键盘输入三个整数分别存入变量num1、 num2、 num3，
 * 对它们进行排序(使用 if-else if-else),并且从小到大输出
 *
 * 说明：
 * 1.if...else结构是可以嵌套的
 * 2.不建议嵌套过多层次的if else结构
 *
 * 赛博世界并不是辽阔的荒野，数据也不全是冰冷的记录，它是亲人的笑靥，它是我们的记忆。
 */
public class NumberCompare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个数：");
        int num2 = scanner.nextInt();
        System.out.println("请输入第三个数：");
        int num3 = scanner.nextInt();

        if (num1 > num2) {
            if (num3 >= num1) {
                System.out.println("从小到大的顺序为： " + num2 + "\t" + num1 + "\t" + num3);
            } else if (num2 >= num3) {
                System.out.println("从小到大的顺序为： " + num3 + "\t" + num2 + "\t" + num1);
            } else {
                System.out.println("从小到大的顺序为： " + num2 + "\t" + num3 + "\t" + num1);
            }
        } else if (num2 > num3) {
            if (num1 >= num3) {
                System.out.println("从小到大的顺序为： " + num3 + "\t" + num1 + "\t" + num2);
            } else {
                System.out.println("从小到大的顺序为： " + num1 + "\t" + num3 + "\t" + num2);
            }
        } else {
            System.out.println("从小到大的顺序为： " + num1 + "\t" + num2 + "\t" + num3);
        }
    }
}
