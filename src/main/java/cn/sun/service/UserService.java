package cn.sun.service;

import cn.sun.pojo.User;

public interface UserService {
    //检验用户登录
    User checkLogin(String username, String password);
    void Regist(User user);
}
