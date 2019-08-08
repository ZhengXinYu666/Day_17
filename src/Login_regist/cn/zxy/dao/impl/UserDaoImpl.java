package Login_regist.cn.zxy.dao.impl;

import Login_regist.cn.zxy.dao.UserDao;
import Login_regist.cn.zxy.pojo.User;

import java.util.ArrayList;

/**
 * 这是用户操作的具体实现类（集合版）
 *
 * @author 郑黑脸
 * @version V1.0
 *
 */
public class UserDaoImpl implements UserDao {
    //为了能让多个方法能够使用同一个集合，就把集合定义为成员变量
    //为了不让外界看到，用private修饰
    //为了让多个对象共享同一个成员变量，用static
    private static ArrayList<User> array = new ArrayList<User>();

    @Override
    public boolean isLogin(String username, String password) {
        //遍历集合，获取每一个用户，并判断该用户的用户名和密码是否和传递过来的匹配
        boolean flag = false;

        for(User u:array){
            if(u.getUsername().equals(username) && u.getPassword().equals(password));
            flag = true;
            break;
        }

        return flag;
    }

    @Override
    public void regist(User user) {
    //把用户信息存入集合
        //ArrayList<User> array = new ArrayList<User>();
        array.add(user);
    }
}
