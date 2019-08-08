package Login_regist.cn.zxy.game;

import java.util.Scanner;

/**
 * 这是猜数字小游戏
 *
 * @author 郑黑脸
 * @version V1.0
 *
 */
public class GuessNumberGame {
    private GuessNumberGame(){}

    public static void start() {
        System.out.println("恭喜你进入了隐藏关卡，可以玩一把猜数字游戏");
        System.out.println("这个数字在1-100之间");
        System.out.println("游戏开始");
        //产生一个随机数
        int number = (int) (Math.random() * 100) + 1;

        //定义一个统计变量
        int count = 0;
        while (true) {
            //键盘录入一个数据
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要猜的数字：");
            int guessNumber = sc.nextInt();
            count ++;
            //判断
            if (guessNumber < number) {
                System.out.println("瓜怂，你猜小了");
            } else if (guessNumber > number) {
                System.out.println("瓷锤，你猜大了");
            } else {
                System.out.println("哎呀！猜了"+count+"次你狗势的终于猜中了！");
                break;
            }
        }
    }
}
