package com.jokey.array_lesson;

import java.util.Arrays;

/**
 * @author Jokey Zhou
 * @version 1.0
 * @date 2020/2/26 12:43
 * @description:
 * 1.在main()方法中声明array1和array2两个变量，他们是int[]类型的数组
 * 2.使用大括号{}，把array1初始化为8个素数： 2,3,5,7,11,13,17,19
 * 3.实现array2对array1的复制
 *
 * 赛博世界并不是辽阔的荒野，数据也不全是冰冷的记录，它是亲人的笑靥，它是我们的记忆。
 */
public class ArrayCopy {
    public static void main(String[] args) {
        int[] array1;
        int[] array2;
        
        array1 = new int[]{2,3,5,7,11,13,17,19};
        array2 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }

        for (int i : array2) {
            System.out.println(i);
        }
    }
}
