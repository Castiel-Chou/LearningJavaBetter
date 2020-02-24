package com.jokey.loop.for_loop;

/**
 * @author Jokey Zhou
 * @version 1.0
 * @date 2020/2/24 16:26
 * @description:
 * 输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身
 * 例如： 153 = 1*1*1 + 3*3*3 + 5*5*5
 *
 * 赛博世界并不是辽阔的荒野，数据也不全是冰冷的记录，它是亲人的笑靥，它是我们的记忆。
 */
public class ForTest3 {
    public static void main(String[] args) {
        for (int i=100; i<1000; i++) {
            int hundred = i / 100;  // 取百位
            int decade = i % 100 / 10;  // 取十位
            int single = i % 10;  // 取个位

            if (hundred * hundred * hundred + decade * decade *decade + single * single * single == i) {
                System.out.println(i);
            }
        }
    }
}
