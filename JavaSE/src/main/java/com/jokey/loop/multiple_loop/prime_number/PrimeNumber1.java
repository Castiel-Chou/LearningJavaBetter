package com.jokey.loop.multiple_loop.prime_number;

/**
 * @author Jokey Zhou
 * @version 1.0
 * @date 2020/2/24 19:44
 * @description:
 * 输出1~100000以内所有的质数
 *
 * 赛博世界并不是辽阔的荒野，数据也不全是冰冷的记录，它是亲人的笑靥，它是我们的记忆。
 */
public class PrimeNumber1 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        for (int i=2; i<=100000; i++) {
            boolean isFlag = true;
            for (int j=2; j<i; j++) {
                if (i % j == 0) {
                    isFlag = false;
                }
            }
            if (isFlag) {
                System.out.println(i);
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("花费的时间为：" + (end - start));
    }
}
