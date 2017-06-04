package com.index.controller;

import com.index.po.Admin;
import com.index.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/5/26.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
  @Autowired
    private AdminService adminService;


    @RequestMapping("/login")
    public String login(HttpSession session, Admin admin , Model model) throws Exception {

        Admin reAdmin=new Admin();
        reAdmin=adminService.adminLogin(admin);
          if (reAdmin==null){
             model.addAttribute("errorMsg","用户名或密码错误！");
             return "admin/login";
        }
        session.setAttribute("username",reAdmin.getUsername());
        return "admin/index";

    }

    @RequestMapping("/logout")
    public String logout(HttpSession session, Admin admin , Model model) throws Exception {

      session.invalidate();
        return "admin/login";

    }
    @RequestMapping("/uploadPic")
    public ModelAndView uploadPic() throws Exception {

        ModelAndView  modelAndView=new ModelAndView();
        modelAndView.setViewName("admin/uploadPic");
        return modelAndView;

    }


}
