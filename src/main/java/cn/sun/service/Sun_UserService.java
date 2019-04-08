package cn.sun.service;

import cn.sun.pojo.Sun_User;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface Sun_UserService {
    List<Sun_User> findAll(RowBounds rowBounds);
    List<Sun_User> findAll();
    int insert(Sun_User sun_user);
}
