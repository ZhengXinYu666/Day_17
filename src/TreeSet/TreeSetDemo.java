package TreeSet;

import java.util.TreeSet;

/**
 * TreeSet：能够对元素按照某种规则进行排序
 * 排序有两种方式：
 *  1、自然排序
 *  2、比较器排序
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        //自然顺序排序
        TreeSet<Integer> ts = new TreeSet<Integer>();
        //由于自动装箱，所以可以直接add
        ts.add(20);
        ts.add(18);
        ts.add(23);
        ts.add(22);
        ts.add(17);
        ts.add(24);
        ts.add(19);
        ts.add(18);
        ts.add(24);

        //遍历
        for(Integer i:ts){
            System.out.println(i);
        }
    }
}
