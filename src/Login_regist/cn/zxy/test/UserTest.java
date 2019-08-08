package Login_regist.cn.zxy.test;

import Login_regist.cn.zxy.dao.UserDao;
import Login_regist.cn.zxy.dao.impl.UserDaoImpl;
import Login_regist.cn.zxy.game.GuessNumberGame;
import Login_regist.cn.zxy.pojo.User;

import java.util.Scanner;

/**
 * 用户测试类
 *
 * @author 郑黑脸
 * @version V1.0
 *
 * 新增加了两个小问题
 * A：多个对象共享同一个成员变量，用静态
 * B：循环里面如果有switch，并且在switch中有break，那么结束的不是循环，而是switch语句
 *
 */
public class UserTest {
    public static void main(String[] args) {
        //为了能够回来
        while(true) {
            //欢迎界面，给出选择项
            System.out.println("--------------欢迎观临--------------");
            System.out.println("************ 1  登录 **************");
            System.out.println("************ 2  注册 **************");
            System.out.println("************ 3  退出 **************");
            System.out.println("**********  请输入你的选择  *********");
            System.out.println("***********************************");

            //键盘录入选择，根据选择做不同的操作
            Scanner sc = new Scanner(System.in);
            //为了后来录入信息的方便，所有的信息录入全部用字符串接收
            String choiceString = sc.nextLine();

            //多个地方要使用，就定义到外面
            UserDao ud = new UserDaoImpl();
            //经过简单地思考，选择了switch()
            switch (choiceString) {
                case "1":
                    //登录界面，请输入用户名和密码
                    System.out.println("--------------登录界面--------------");
                    System.out.println("请输入用户名：");
                    String username = sc.nextLine();
                    System.out.println("请输入密码：");
                    String password = sc.nextLine();

                    //调用登录功能
                    //UserDao ud = new UserDaoImpl();
                    boolean flag = ud.isLogin(username, password);
                    if (flag) {
                        System.out.println("登陆成功");

                        System.out.println("来一发么？");
                        System.out.println("Y/N");
                        while(true) {
                            String resultString = sc.nextLine();
                            if (resultString.equals("Y")) {
                                //玩游戏
                                GuessNumberGame.start();
                                System.out.println("还想再来一发？Y/N");
                            } else {
                                System.out.println("滚");
                                break;
                            }
                        }
                        System.exit(0);
                        //注意这里写break结束的是switch
                    } else {
                        System.out.println("用户名或密码错误，登录失败");
                    }

                    break;
                case "2":
                    //注册界面，请输入用户名和密码
                    System.out.println("--------------注册界面--------------");
                    System.out.println("请输入用户名：");
                    String newUsername = sc.nextLine();
                    System.out.println("请输入密码：");
                    String newPassword = sc.nextLine();

                    //把用户名和密码封装到一个对象中
                    User user = new User();
                    user.setUsername(newUsername);
                    user.setPassword(newPassword);

                    //调用注册功能
                    //多态用法
                    //UserDao ud = new UserDaoImpl();
                    //具体类使用
                    //UserDaoImpl udi = new UserDaoImpl();

                    ud.regist(user);
                    System.out.println("注册成功");
                    break;

                case "3":
                default:
                    System.out.println("谢谢使用，欢迎下次再来！");
                    System.exit(0);
                    break;
            }
        }
    }
}
