package com.jokey.loop.multiple_loop;

/**
 * @author Jokey Zhou
 * @version 1.0
 * @date 2020/2/24 20:43
 * @description:
 * 可以设定标志，指定break或continue结束的是那一层的循环
 *
 * 赛博世界并不是辽阔的荒野，数据也不全是冰冷的记录，它是亲人的笑靥，它是我们的记忆。
 */
public class LabelLoop {
    public static void main(String[] args) {

        labe1:for (int i = 1; i < 4; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j % 4 == 0) {
                    continue labe1; // 直接跳过本次外层的循环
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
