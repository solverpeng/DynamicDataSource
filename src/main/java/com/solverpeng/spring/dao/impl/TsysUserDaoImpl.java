package com.solverpeng.spring.dao.impl;

import com.solverpeng.spring.bean.TsysUser;
import com.solverpeng.spring.dao.TsysUserDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/3/29 0029
 *      desc  :
 * </pre>
 */
@Repository
public class TsysUserDaoImpl implements TsysUserDao {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    public TsysUser getById() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Connection connection = sqlSession.getConnection();
        System.out.println("TsysUserDaoImpl.getById:" + connection);
        TsysUser user = sqlSession.selectOne("com.solverpeng.spring.dao.TsysUserDao.getById");
        return user;
    }
}
