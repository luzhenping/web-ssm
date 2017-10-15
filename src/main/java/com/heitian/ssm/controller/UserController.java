package com.heitian.ssm.controller;

import com.heitian.ssm.model.PageBean;
import com.heitian.ssm.model.User;
import com.heitian.ssm.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    private Logger log = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;

    @RequestMapping("/gotoList")
    public String gotoList(){
        return "showUser";
    }

    @ResponseBody
    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model){
        log.info("查询所有用户信息");
        PageBean pageBean = new PageBean<User>();
        pageBean.setCurrentPage(1);
        pageBean.setPageSize(10);
        pageBean.setRecordList(userService.getAllUser());
        pageBean.setBeginPageIndex(1);
        pageBean.setEndPageIndex(1);
        model.addAttribute("pageBean",pageBean);
        return "showUser";
    }
}
