package com.jokey.array_lesson;

/**
 * @author Jokey Zhou
 * @version 1.0
 * @date 2020/2/26 12:58
 * @description:
 * 数组反转
 *
 * 赛博世界并不是辽阔的荒野，数据也不全是冰冷的记录，它是亲人的笑靥，它是我们的记忆。
 */
public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 5, 7, 11, 13, 17, 19};

        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length -1 -i];
            arr[arr.length -1 -i] = tmp;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
