package com.solverpeng.spring.dao.impl;

import com.solverpeng.spring.bean.Tmail;
import com.solverpeng.spring.dao.TmailDao;
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
public class TmailDaoImpl implements TmailDao{
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    public Tmail getById(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Connection connection = sqlSession.getConnection();
        System.out.println("TmailDaoImpl.getById:" + connection);
        Tmail mail = sqlSession.selectOne("com.solverpeng.spring.dao.TmailDao.getById");
        return mail;
    }
}
