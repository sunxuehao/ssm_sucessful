package cn.sun.service.impl;

import cn.sun.dao.Sun_UserDao;
import cn.sun.pojo.Sun_User;
import cn.sun.service.Sun_UserService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Sun_UserServiceImpl implements Sun_UserService {
    @Resource
    private Sun_UserDao sun_userDao;

    public List<Sun_User> findAll(RowBounds rowBounds) {
        return sun_userDao.findAll(rowBounds);
    }

    @Override
    public List<Sun_User> findAll() {
        return sun_userDao.findAll();
    }

    @Override
    public int insert(Sun_User sun_user) {
        return sun_userDao.insert(sun_user);
    }

}
