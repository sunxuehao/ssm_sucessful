package cn.sun.service.impl;

import cn.sun.dao.UserDao;
import cn.sun.pojo.User;
import cn.sun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: SXH
 * \* Date: 2019/4/18
 * \
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /*
     * 检验用户登录业务
     *
     */

    public User checkLogin(String username, String password) {

        User user = userDao.findByUsername(username);
        if(user != null && user.getPassword().equals(password)){

            return user;
        }
        return null;
    }

    @Override
    public void Regist(User user) {

        userDao.registerByUsernameAndPassword(user.getUsername(),user.getPassword());

    }
}