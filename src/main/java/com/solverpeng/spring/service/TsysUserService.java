package com.solverpeng.spring.service;

import com.solverpeng.spring.bean.TsysUser;
import com.solverpeng.spring.dao.TsysUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TsysUserService{

    @Autowired
    private TsysUserDao tsysUserDao;

    @Transactional(readOnly = true)
    public TsysUser getSysUser() {
        return tsysUserDao.getById();
    }
}
