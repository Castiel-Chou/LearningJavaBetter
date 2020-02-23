package com.jokey.loop.for_loop;

/**
 * @author Jokey Zhou
 * @version 1.0
 * @date 2020/2/23 17:31
 * @description:
 * 编写程序从1循环到150，并在每行打印一个值，另外在每个3的倍数行上打印出“foo”,
 * 在每个5的倍数行上打印“biz”,在每个7的倍数行上打印输出“baz”
 *
 * 赛博世界并不是辽阔的荒野，数据也不全是冰冷的记录，它是亲人的笑靥，它是我们的记忆。
 */
public class ForTest1 {
    public static void main(String[] args) {

        for (int i=1; i<=150; i++) {
            System.out.print(i + " ");

            if (i % 3 == 0) System.out.print("foo ");
            if (i % 5 == 0) System.out.print("biz ");
            if (i % 7 == 0) System.out.print("baz");
            System.out.println();
        }
    }
}
