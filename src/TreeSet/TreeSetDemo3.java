package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;


/**
 * 需求：按照姓名的长度排序
 *
 * TreeSet集合保证元素排序和唯一性的原理
 * 唯一性：根据比较的返回是否是0来决定
 * 排序：
 *  1、自然排序（元素具备比较性）
 *      让元素所属的类实现自然排序接口Comparable
 *  2、比较器排序（集合具备比较性）
 *      让集合的构造方法接收一个比较器接口的子类对象Comparator
 */

public class TreeSetDemo3 {
    public static void main(String[] args){
        //public TreeSet(Comparator comparator)比较器排序
        //TreeSet<Student> ts = new TreeSet<Student>();

        //如果一个方法的参数是借口，真正要的是接口的实现类的对象，而匿名内部类可以实现
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //姓名长度
        int num = s1.getName().length()-s2.getName().length();
        //姓名内容
        int num2 = num == 0 ? s1.getName().compareTo(s2.getName()):num;
        //年龄
        int num3 = num == 0 ? s1.getAge()-s2.getAge():num2;
        return num3;
            }
        });

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
