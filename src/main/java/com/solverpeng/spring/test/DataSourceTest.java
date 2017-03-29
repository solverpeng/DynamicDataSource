package com.solverpeng.spring.test;

import com.solverpeng.spring.bean.Tmail;
import com.solverpeng.spring.bean.TsysUser;
import com.solverpeng.spring.dao.TmailDao;
import com.solverpeng.spring.dao.TsysUserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/3/29 0029
 *      desc  :
 * </pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ApplicationContext.xml")
public class DataSourceTest {
    @Autowired
    private TmailDao tmailDao;
    @Autowired
    private TsysUserDao tsysUserDao;
    @Test
    public void test() {
        TsysUser sysUser = tsysUserDao.getById();
        System.out.println(sysUser);

        Tmail tmail = tmailDao.getById();
        System.out.println(tmail);
    }
}
