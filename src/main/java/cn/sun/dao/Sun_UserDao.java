package cn.sun.dao;

import cn.sun.pojo.Sun_User;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Sun_UserDao {

    List<Sun_User> findAll(RowBounds rowBounds);
    List<Sun_User> findAll();

    int insert(Sun_User sun_user);
}
