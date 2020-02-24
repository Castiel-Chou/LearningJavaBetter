package com.jokey.loop.multiple_loop.prime_number;

/**
 * @author Jokey Zhou
 * @version 1.0
 * @date 2020/2/24 20:25
 * @description:
 * 优化质数2
 *
 * 赛博世界并不是辽阔的荒野，数据也不全是冰冷的记录，它是亲人的笑靥，它是我们的记忆。
 */
public class PrimeNumber3 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        for (int i=2; i<=100000; i++) {
            boolean isFlag = true;
            for (int j=2; j<Math.sqrt(i); j++) { // 优化二：开方，对本身是质数的自然数是有效的
                if (i % j == 0) {
                    isFlag = false;
                    break;  // 优化一：当出现第一次能被整除时就直接退出，只对本身非质数的自然数是有效的
                }
            }
            if (isFlag) {
                System.out.println(i);
            }
        }

        System.out.println("花费的时间为：" + (System.currentTimeMillis() - start));
    }
}
