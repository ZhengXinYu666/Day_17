package TreeSet;

import java.util.TreeSet;

/**
 * 通过观察TreeSet的add（）方法，我们知道最终要看TreeMap的put()方法
 * TreeSet底层为二叉树（红黑树--一种自平衡的二叉树）
 *
 * TreeSet存储自定义对象并保证排序和唯一
 *
 * A:如何排序？
 *      自然排序，按年龄从小到达排序
 * B：元素什么情况唯一？
 *      成员变量相同就为一个元素
 */
public class TreeSetDemo2 {
    public static void main(String[] args){
        TreeSet<Student> ts = new TreeSet<Student>();

        Student s1 = new Student("linqingxia",27);
        Student s2 = new Student("zhangguorong",29);
        Student s3 = new Student("wanglihong",29);
        Student s4 = new Student("linqingxia",27);
        Student s5 = new Student("liushishi",22);
        Student s6 = new Student("wuqilong",40);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        for(Student s:ts){
            System.out.println(s.getName()+"---"+s.getAge());
        }



    }
}
