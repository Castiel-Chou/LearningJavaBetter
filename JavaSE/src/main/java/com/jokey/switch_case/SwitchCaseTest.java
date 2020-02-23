package com.jokey.switch_case;

/**
 * @author Jokey Zhou
 * @version 1.0
 * @date 2020/2/23 15:44
 * @description:
 * 根据switch表达式中的值，依次匹配各个case中的常量。一旦匹配成功，则进入相应case结构中，调用其执行语句。
 * 当调用完执行语句后，则仍然继续向下执行其他case结构中的执行语句，直到遇到break关键字或此switch...case结构末尾为止结束
 *
 * 赛博世界并不是辽阔的荒野，数据也不全是冰冷的记录，它是亲人的笑靥，它是我们的记忆。
 */
public class SwitchCaseTest {
    public static void main(String[] args) {

        int number = 2;
        switch (number) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
            default:
                System.out.println("other");
        }
    }
}
