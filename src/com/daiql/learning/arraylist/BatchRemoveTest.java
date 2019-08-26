package com.daiql.learning.arraylist;

import java.util.Arrays;
import java.util.List;

/**
 * Author daiql
 * Date 2019/8/26 15:46
 * Description 对ArrayList中私有方法 batchRemove() 加深理解
 */
public class BatchRemoveTest {

    public static void main(String[] args) {
        //模拟 removeAll(Collection<?> c) 方法
        batchRemove(false);

        //模拟 retainAll(Collection<?> c) 方法
        batchRemove(true);
    }

    public static void batchRemove(boolean complement) {
        String[] aa = {"1","2","3","4","5","6","7","8","9"}; //字符串数组模拟aaList中的elementData
        String[] bb = {"a","b","c","3","5","8"}; //已有集合aaList中的元素如果在bbList中出现，就需要剔除
        List<String> aaList = Arrays.asList(aa);
        List<String> bbList = Arrays.asList(bb);
        //开始模拟batchRemove()，并打印出日志，方便理解
        int r = 0, w = 0;
        //循环判断，如果aaList的元素不在bbList中，就是需要保留的，
        //需要保留的元素，依次更新到aa[0],aa[1],aa[2],aa[3],...中
        System.out.println("第一步处理开始");
        for (; r < aaList.size(); r++) {
            if (bbList.contains(aaList.get(r)) == complement) {
                int swap_w = w;
                aa[w++] = aa[r];
                System.out.println("r=" + r + ", w=" + swap_w + ", aa=" + Arrays.toString(aa));
            }
        }
        System.out.println("第一步处理结束，结果如下：");
        System.out.println("r=" + r + ", w=" + w + ", aa=" + Arrays.toString(aa));
        //第一步操作完成后，aa数组中前w个元素就是我们需要保存下来的
        //aa数组中w+1个元素开始到最后，都需要更新为null
        System.out.println("第二步处理开始");
        if (w < aa.length) {
            for (int i = w; i < aa.length; i++) {
                aa[i] = null;
            }
            // 这里取消了modCount修改计数的修改和修改后List大小的更改
        }
        System.out.println("处理结束，最终结果如下：");
        System.out.println(Arrays.toString(aa));
        System.out.println();
    }
}
