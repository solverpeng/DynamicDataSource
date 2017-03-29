package com.solverpeng.spring.special;

import com.solverpeng.spring.dao.TmailDao;
import com.solverpeng.spring.dao.TsysUserDao;
import com.solverpeng.spring.service.TmailService;
import com.solverpeng.spring.service.TsysUserService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/3/29 0029
 *      desc  :
 * </pre>
 */
@Aspect
@Component
@Order(1)
public class MultipleDataSourceAspectAdvice {

    @Before("execution(* com.solverpeng.spring.service.*.*(..))")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        if (joinPoint.getTarget() instanceof TmailService) {
            MultipleDataSource.setDataSourceKey("mySqlDataSource");
        } else if (joinPoint.getTarget() instanceof TsysUserService) {
            MultipleDataSource.setDataSourceKey("sqlServerDataSource");
        }
    }
}
