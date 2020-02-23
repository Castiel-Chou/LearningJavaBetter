package com.jokey.switch_case;

import java.util.Scanner;

/**
 * @author Jokey Zhou
 * @version 1.0
 * @date 2020/2/23 16:12
 * @description:
 * 使用 switch 把小写类型的 char型转为大写。只转换 a, b, c, d, e. 其它的输出 “other”
 *
 * 赛博世界并不是辽阔的荒野，数据也不全是冰冷的记录，它是亲人的笑靥，它是我们的记忆。
 */
public class LetterTransfer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个小写字母：");
        String stringLetter = scanner.next();
        char letter = stringLetter.charAt(0);

        switch (letter) {
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("other");
        }

    }
}
