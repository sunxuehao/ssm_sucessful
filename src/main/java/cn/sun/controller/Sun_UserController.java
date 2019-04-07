package cn.sun.controller;

import cn.sun.pojo.Sun_User;
import cn.sun.service.Sun_UserService;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class Sun_UserController {
    @Resource
    private Sun_UserService sun_userService;

    @GetMapping("/findAll")
    public  String findALL(Model model){
        List<Sun_User> sun_userList = sun_userService.findAll(new RowBounds(0,4));
        for (Sun_User sun_user : sun_userList){
            System.out.println("id:"+sun_user.getId());
            System.out.println("name:"+sun_user.getName());
        }

        return "hello";
    }

    @GetMapping("/findAll2")
    public  String findALL2(Model model){
        PageHelper.startPage(0,2);
//        采用物理分页
        List<Sun_User> sun_userList = sun_userService.findAll();
        for (Sun_User sun_user : sun_userList){
            System.out.println("id: "+sun_user.getId());
            System.out.println("name:"+sun_user.getName());
        }

        return "hello";
    }
}