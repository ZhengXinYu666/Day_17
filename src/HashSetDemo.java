import java.util.HashSet;
import java.util.Random;

/**
 * 编写一个程序，获取10个1-20的随机数，要求随机数不能重复
 *
 * 分析：
 *  A、创建随机数对象
 *  B、创建一个Set集合
 *  C、判断集合的长度是否小于10
 *      是：创建一个随机数，添加
 *      否：不仅如此
 *  D、遍历Set集合
 */
public class HashSetDemo {
    public static void main(String[] args) {
        //创建随机数对象
        Random r = new Random();

        //创建一个Set集合
        HashSet<Integer> hs = new HashSet<Integer>();

        //判断集合的长度是不是小于10
        while(hs.size()<10){
            int num = r.nextInt(20)+1;
            hs.add(num);
        }

        //遍历集合
        for(Integer i:hs){
            System.out.println(i);
        }
    }
}
