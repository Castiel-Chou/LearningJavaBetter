package com.jokey.oop;

import java.util.Random;

/**
 * @ClassName: PolymorphismTest
 * @author: Jokey Zhou
 * @date: 2020/3/8 16:58
 * @description: 验证多态性是编译时行为还是运行时行为
 * 答：是运行时行为。该例说明了最后的eat()完全是随机的，只有在运行时调用到该方法时，才能知道到底是哪个动物吃东西
 *
 * 赛博世界并不是辽阔的荒野，数据也不全是冰冷的记录，它是亲人的笑靥，它是我们的记忆。
 */

class Animal  {

    protected void eat() {
        System.out.println("animal eat food");
    }
}

class Cat  extends Animal  {

    protected void eat() {
        System.out.println("cat eat fish");
    }
}

class Dog  extends Animal  {

    public void eat() {
        System.out.println("Dog eat bone");

    }

}

class Sheep  extends Animal  {

    public void eat() {
        System.out.println("Sheep eat grass");

    }
}

public class PolymorphismTest {

    public static Animal getInstance(int key) {
        switch (key) {
            case 0:
                return new Cat ();
            case 1:
                return new Dog ();
            default:
                return new Sheep ();
        }

    }
    public static void main(String[] args) {

        int key = new Random().nextInt(3);

        System.out.println(key);

        Animal  animal = getInstance(key);

        animal.eat();
    }
}
