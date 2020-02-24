package com.jokey.loop.multiple_loop;

/**
 * @author Jokey Zhou
 * @version 1.0
 * @date 2020/2/24 17:18
 * @description:
 * 在控制台显示以下图形

 *
 * *
 * * *
 * * * *
 * * * * *

 * 赛博世界并不是辽阔的荒野，数据也不全是冰冷的记录，它是亲人的笑靥，它是我们的记忆。
 */
public class PrintStars {
    public static void main(String[] args) {

        // i代表行数 j代表列数
        for (int i=1; i<= 5; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
