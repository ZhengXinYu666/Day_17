package Set;

import java.util.HashSet;

/**
 * HashSet存储自定义对象并遍历，如果对象的成员变量值相同即为同一个对象
 *
 * 注意：
 *      使用的是HashSet集合，这个集合的底层是哈希表结构
 *      而哈希表结构底层以来：hashCode（）和equals()方法
 *      如果你认为陈源对象的成员变量值相同即为一个对象的话，应该重写这个该方法
 *      如何重写？自动生成
 */
public class DogDemo {
    public static void main(String[] args) {
        HashSet<Dog> hs = new HashSet<Dog>();

        Dog d1 = new Dog("秦桧",25,"红色",'男');
        Dog d2 = new Dog("高俅",22,"黑色",'女');
        Dog d3 = new Dog("秦桧",25,"红色",'男');
        Dog d4 = new Dog("秦桧",20,"红色",'女');
        Dog d5 = new Dog("魏忠贤",28,"白色",'男');
        Dog d6 = new Dog("李莲英",23,"黄色",'女');
        Dog d7 = new Dog("李莲英",23,"黄色",'女');
        Dog d8 = new Dog("李莲英",23,"黄色",'女');
        Dog d9 = new Dog("秦桧",25,"黄色",'男');

        hs.add(d1);
        hs.add(d2);
        hs.add(d3);
        hs.add(d4);
        hs.add(d5);
        hs.add(d6);
        hs.add(d7);
        hs.add(d8);
        hs.add(d9);

        for(Dog d:hs){
            System.out.println(d.getName()+"---"+d.getAge()+"---"+d.getColor()+"---"+d.getSex());
        }
    }
}
