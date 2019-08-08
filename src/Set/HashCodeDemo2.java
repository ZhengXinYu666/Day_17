package Set;

import TreeSet.Student;

import java.util.HashSet;

/**
 * 需求：存储自定义对象，并保证元素的唯一性
 * 要求：如果两个对象的成员变量值都相同，则为同一个元素
 *
 * 目前是不符合要求的，因为我们直到HashSet底层依赖的是hashCode()和equals()方法
 * 我们并没有重写这两个方法，所以默认使用的是Object类
 * 这个时候，他们的哈希值是不会一样的，根本不会继续判断，并执行了添加操作
 */
public class HashCodeDemo2 {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<Student> hs = new HashSet<Student>();
        //创建并添加元素
        Student s1 = new Student("花木兰",18);
        Student s2 = new Student("芈月",22);
        Student s3 = new Student("公孙离",18);
        Student s4 = new Student("花木兰",20);
        Student s5 = new Student("花木兰",18);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        hs.add(s5);

        //遍历集合
        for(Student s:hs){
            System.out.println(s.getName()+"---"+s.getAge());
        }
    }
}
