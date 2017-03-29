package com.solverpeng.spring.service;

import com.solverpeng.spring.bean.Tmail;
import com.solverpeng.spring.dao.TmailDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TmailService{

    @Autowired
    private TmailDao tmailDao;

    @Transactional(readOnly = true)
    public Tmail getTmail() {
        return tmailDao.getById();
    }
}
