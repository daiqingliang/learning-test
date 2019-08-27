package com.daiql.learning.hashmap;

/**
 * Author daiql
 * Date 2019/8/27 19:42
 * Description TODO
 */
public class Test2 {
    public static void main(String[] args) {
        float f1 = 0.78f;
        System.out.println(Float.isNaN(f1));
        if (f1 <= 0 || Float.isNaN(f1)) {
            System.out.println(111);
        }
    }
}
