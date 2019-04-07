package cn.sun.test;

import cn.sun.dao.Sun_UserDao;
import cn.sun.pojo.Sun_User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: SXH
 * \* Date: 2019/4/5
 * \
 */
public class Sun_UserDaoTest extends BaseJunit4Test {
    @Resource
    private Sun_UserDao sun_userDao;

    @Test
    public void testFindAll(){
//        下面演示逻辑分页
        List<Sun_User> sun_userList = sun_userDao.findAll(new RowBounds(0,3));
        System.out.println(sun_userList.size());
        for (Sun_User sun_user : sun_userList){
            System.out.println(sun_user.getId());
        }
    }

    @Test
    public void testFindAll2(){
//        下面演示物理分页
        PageHelper.startPage(0,3);
        List<Sun_User> sun_userList = sun_userDao.findAll();
        PageInfo pageInfo = new PageInfo(sun_userList);
//        pageInfo中包含了全面的分页信息
        System.out.println(sun_userList.size());
        for (Sun_User sun_user : sun_userList){
            System.out.println(sun_user.getId());
        }
    }
}
