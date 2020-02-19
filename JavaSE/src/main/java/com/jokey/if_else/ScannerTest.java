package com.jokey.if_else;

import java.util.Scanner;

/**
 * @author Jokey Zhou
 * @version 1.0
 * @date 2020/2/19 21:54
 * @description:
 *
 * 岳小鹏参加Java考试，他和父亲岳不群达成承诺：
 * 如果：
 * 成绩为100分时，奖励一辆BMW；
 * 成绩为(80， 99]时，奖励一台iphone xs max；
 * 当成绩为[60,80]时，奖励一个 iPad；
 * 其它时，什么奖励也没有。
 * 请从键盘输入岳小鹏的期末成绩，并加以判断
 *
 * 赛博世界并不是辽阔的荒野，数据也不全是冰冷的记录，它是亲人的笑靥，它是我们的记忆。
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入此次考试成绩(0~100): ");
        int score = scanner.nextInt();

        if (score == 100) {
            System.out.println("奖励一辆BMW");
        } else if (score > 80 && score <= 99) {
            System.out.println("奖励一台iphone xs max");
        } else if (score >= 60 && score <= 80) {
            System.out.println("奖励一个 iPad");
        } else {
            System.out.println("什么奖励也没有");
        }
    }
}
