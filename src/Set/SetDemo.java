package Set;

import java.util.HashSet;
import java.util.Set;

/**
 * Collection
 *      List：
 *          有序（存储顺序和取出顺序一致），可重复
 *      Set：
 *          无序（存储顺序和去除顺序不一致），唯一
 *          虽然set集合的元素无序，但是，作为集合来说，肯定有自己的存储数据
 *          而你的顺序恰好和它的存储数据一致，这无法代表有序，可以多存出一些数据，就能看出效果
 *
 *   HashSet：不保证set的迭代顺序；特别是不保证该顺序恒久不变
 */
public class SetDemo {
    public static void main(String[] args) {
        //创建集合对象
        Set<String> set = new HashSet<String>();
        //创建并添加元素
        set.add("hello");
        set.add("world");
        set.add("java");

        //是否有序
        for(String s:set){
            System.out.println(s);
        }

    }
}
