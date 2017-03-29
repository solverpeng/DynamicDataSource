package com.solverpeng.spring.handler;

import com.solverpeng.spring.bean.Tmail;
import com.solverpeng.spring.service.TmailService;
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
public class MailHandler {
    @Autowired
    private TmailService tmailService;

    @RequestMapping("/hellomail")
    public String queryMail() {
        Tmail tmail = tmailService.getTmail();
        System.out.println(tmail);
        return "success";
    }
}
