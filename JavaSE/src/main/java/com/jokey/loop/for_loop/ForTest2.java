package com.jokey.loop.for_loop;

import java.util.Scanner;

/**
 * @author Jokey Zhou
 * @version 1.0
 * @date 2020/2/24 11:11
 * @description:
 * 输入两个正整数，求其最大公约数和最小公倍数(break关键字的使用)
 *
 * 赛博世界并不是辽阔的荒野，数据也不全是冰冷的记录，它是亲人的笑靥，它是我们的记忆。
 */
public class ForTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个正整数：");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个正整数：");
        int num2 = scanner.nextInt();

        // 获取两个数中较小的数
        int min = (num1 <= num2) ? num1 : num2;
        // 获取两个数中较大的数
        int max = (num1 >= num2) ? num1 : num2;

        // 最大公约数
        for (int i=min; i>=1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println("最大公约数为： " + i);
                break;
            }
        }

        // 最小公倍数
        for (int i=max; i<= num1*num2; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                System.out.println("最小公倍数为： " + i);
                break;
            }
        }
    }
}
