package com.jokey.loop.multiple_loop;

/**
 * @author Jokey Zhou
 * @version 1.0
 * @date 2020/2/24 19:32
 * @description:
 * 打印一个九九乘法表
 *
 * 赛博世界并不是辽阔的荒野，数据也不全是冰冷的记录，它是亲人的笑靥，它是我们的记忆。
 */
public class NineNineTable {
    public static void main(String[] args) {

        for (int i=1; i<=9; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(i + "*" + j + "=" + i*j + "\t");
            }
            System.out.println();
        }
    }
}
