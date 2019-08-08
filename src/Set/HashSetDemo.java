package Set;

import java.util.HashSet;

/**
 * HashSet存储字符串并遍历
 *
 * 问题：为什么存储字符串内容相同的只存储了一个呢？
 *
 *  通过查看add方法的源码
 *  直到这个方法底层以来两个方法：hashCode（）和equals()方法
 *  步骤：
 *          首先比较哈希值
 *          相同，继续走，比较key值或者走equals()
 *          不同，直接添加到集合中
 *  按照方法的步骤来说：
 *      先看hashCode()值是否相同
 *          相同：继续走equals()方法
 *              返回true：说明元素重复，就不添加
 *              返回false：说明元素不重复，就添加到集合
 *          不同：直接把元素添加到集合
 *
 *  如果类没有重写这两个方法，默认使用的Object()
 *  而String类重写了hashCode()和equals()方法，所以它就可以吧内容相同的字符串去掉，只留下一个。
 *
 *
 */
public class HashSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<String> hs = new HashSet<String>();
        //创建并添加元素
        hs.add("hello");
        hs.add("hello");
        hs.add("hello");
        hs.add("world");
        hs.add("java");
        //遍历
        for(String s:hs){
            System.out.println(s);
        }
    }
}