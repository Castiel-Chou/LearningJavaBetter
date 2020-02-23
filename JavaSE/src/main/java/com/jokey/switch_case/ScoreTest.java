package com.jokey.switch_case;

/**
 * @author Jokey Zhou
 * @version 1.0
 * @date 2020/2/23 16:19
 * @description:
 * 对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”
 *
 * 赛博世界并不是辽阔的荒野，数据也不全是冰冷的记录，它是亲人的笑靥，它是我们的记忆。
 */
public class ScoreTest {
    public static void main(String[] args) {

        int score = 60;

        // 若switch-case结构中的多个case语句相同，则可以考虑合并
        switch (score / 10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不合格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("合格");
                break;
        }


        // 更优解
        switch (score / 60) {
            case 0:
                System.out.println("不合格");
                break;
            default:
                System.out.println("合格");
        }
    }
}
