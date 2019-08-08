import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 键盘录入5个学生信息(姓名，语文成绩，数学成绩，英语成绩)，按照总分从高到低输出
 *
 * 分析：
 *  A、定义学生类
 *  B、创建一个TreeSet集合
 *  C、总分从高到低如何实现呢？
 *  D、键盘录入5个学生信息
 *  E、遍历TreeSet集合
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        //创建TreeSet集合
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //总分从高到低
                int num = s2.getSum()-s1.getSum();
                //总分相同的不一定是同一个人
                //不一定语文/数学/英语相同
                int num2 = num == 0 ? s1.getChinese()-s2.getChinese():num;
                int num3 = num == 0 ? s1.getMath()-s2.getMath():num2;
                int num4 = num == 0 ? s1.getEnglish()-s2.getEnglish():num3;
                //姓名不一定相同
                int num5 = num4==0 ? s1.getName().compareTo(s2.getName()):num4;
                return num5;
            }
        });

        for(int x = 1; x<=5; x++) {
            System.out.println("学生信息录入开始");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第" + x + "个学生的姓名");
            String name = sc.nextLine();
            System.out.println("请输入第" + x + "个学生的语文成绩");
            String chineseString = sc.nextLine();
            System.out.println("请输入第" + x + "个学生的数学成绩");
            String mathString = sc.nextLine();
            System.out.println("请输入第" + x + "个学生的英语成绩");
            String englishString = sc.nextLine();


            //封装数据
            Student s = new Student();
            s.setName(name);
            s.setChinese(Integer.parseInt(chineseString));
            s.setMath(Integer.parseInt(mathString));
            s.setEnglish(Integer.parseInt(englishString));

            //添加到集合
            ts.add(s);
        }
        System.out.println("学生信息录入完毕");
        System.out.println("学生信息按成绩从高到低排序如下");
        System.out.println("姓名\t语文成绩\t数学成绩\t英语成绩");

        //遍历集合
        for(Student s:ts){
            System.out.println(s.getName()+"\t"+s.getChinese()+"\t"+s.getMath()+"\t"+s.getEnglish());
        }

    }
}

