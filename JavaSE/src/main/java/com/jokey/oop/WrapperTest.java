package com.jokey.oop;

/**
 * @ClassName: WrapperTest
 * @author: Jokey Zhou
 * @date: 2020/3/8 20:24
 * @description: 包装类测试题
 * 赛博世界并不是辽阔的荒野，数据也不全是冰冷的记录，它是亲人的笑靥，它是我们的记忆。
 */
public class WrapperTest {
    public static void main(String[] args) {

        /*
        这是因为三目运算符要求后面的两个返回值的类型是一致的
        因此将整型统一到了浮点型
        输出结果为 1.0
         */
        Object obj = true ? new Integer(1) : new Double(2.0);
        System.out.println(obj);

        /*
        该题是一道普通题 结果就是 1
         */
        Object obj2;
        if (true)
            obj2 = new Integer(1);
        else
            obj2 = new Double(2.0);

        System.out.println(obj2);

        /*
        第一个结果为True 第二个结果为False
        这是因为Integer内部定义了一个IntegerCache结构，IntegerCache中又定义了Integer[]
        该数组保存了从-128~127范围的整数
        如果使用自动装箱的方式 给Integer赋值范围在-128~127中时 可以直接使用数组中的元素
        否则就要重新new一个对象 导致指向不同的对象地址 该设置的目的是为了提高效率
         */
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);

        Integer m1 = 128;
        Integer n1 = 128;
        System.out.println(m1 == n1);
    }
}
