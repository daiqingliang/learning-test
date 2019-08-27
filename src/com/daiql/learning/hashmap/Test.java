package com.daiql.learning.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Author daiql
 * Date 2019/8/27 18:55
 * Description TODO
 */
public class Test {
    public static void main(String[] args) {
        //扰动函数，后期加上测试扰动函数效果 HashMap.hash()
        Map<String, String> map = new HashMap<>();
        map.put("484156","abc");
        String aa = "484156";
        int h = aa.hashCode();
        System.out.println(h);
        System.out.println(Integer.toBinaryString(h));
        int k = h >>> 16;
        System.out.println(k);
        System.out.println(Integer.toBinaryString(k));
        int end = (aa.hashCode()) ^ (h >>> 16);
        System.out.println(end);
        System.out.println(Integer.toBinaryString(end));

        //HashMap.tableSizeFor() 指定容量时，返回大于等于指定容量的2的幂等的容量
        //比如，指定容量是8时，返回8；指定容量是9时，返回16，指定容量是17时，返回32.
        int n = 17;
        n |= n >>> 1;
        System.out.println(n);
        n |= n >>> 2;
        System.out.println(n);
        n |= n >>> 4;
        System.out.println(n);
        n |= n >>> 8;
        System.out.println(n);
        n |= n >>> 16;
        System.out.println(n);
    }
}
