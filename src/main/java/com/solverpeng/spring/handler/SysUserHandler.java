package com.solverpeng.spring.handler;

import com.solverpeng.spring.bean.TsysUser;
import com.solverpeng.spring.service.TsysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/3/29 0029
 *      desc  :
 * </pre>
 */
@Controller
public class SysUserHandler {
    @Autowired
    private TsysUserService tsysUserService;

    @RequestMapping("/sysUser")
    public String querySysUser() {
        TsysUser sysUser = tsysUserService.getSysUser();
        System.out.println(sysUser);
        return "success";
    }
}
