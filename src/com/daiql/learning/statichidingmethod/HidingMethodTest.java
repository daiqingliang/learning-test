package com.daiql.learning.statichidingmethod;

/**
 * Author daiql
 * Date 2019/8/27 17:01
 * Description 静态方法是和类绑定到一起的，那么在实例化的时候，用的谁的类型的引用，那么call到的方法就是谁的实现
 */
public class HidingMethodTest {
//    class Super {
//        static String greeting() { return "Goodnight"; }
//        String name() { return "Richard"; }
//    }
//    class Sub extends Super {
//        static String greeting() { return "Hello"; }
//        String name() { return "Kick"; }
//    }
        public static void main(String[] args) {
            Super s = new Sub();
            System.out.println(s.greeting() + ", " + s.name());
            //输出：Goodnight, Kick
            Sub s2 = new Sub();
            System.out.println(s2.greeting() + ", " + s.name());
            //输出：Hello, Kick
        }
}
