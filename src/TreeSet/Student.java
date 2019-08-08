package TreeSet;

/**
 * 如果一个类的元素想能自然排序，就必须实现自然排序接口
 *
 */
public class Student {//implements Comparable<Student>{
    private String name;
    private int age;

    public Student(){}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        //因为成员变量值影响了哈希值，所以我们把成员变量值相加即可
        return name.hashCode()+this.age*15;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(!(obj instanceof Student)){
            return false;
        }

        Student s = (Student) obj;
        return this.name.equals(s.name) && this.age == s.age;
    }

//    @Override
//    public int compareTo(Student s) {
//        //return 0;
//        //return 1;
//        //return -1;
//        //返回什么，要根据排序规则来做
//        //按照年龄排序---主要条件
//        int num = this.age-s.age;
//        //分析次要条件，年龄相同，要去看姓名是否相同，如果两个都相同才不存储，才是同一个元素
//        int num2=num == 0?this.name.compareTo(s.name):num;
//        return num2;
//    }
}
