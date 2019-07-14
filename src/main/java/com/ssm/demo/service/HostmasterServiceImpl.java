package com.ssm.demo.service;

import com.ssm.demo.dao.HostmasterDao;
import com.ssm.demo.domain.hostmaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Transactional
@Service
public class HostmasterServiceImpl implements  HostmasterService {
    @Autowired
    HostmasterDao dao;

    @Override
    public void insert(String username) {
        dao.insert(username);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }

    @Override
    public void update(hostmaster hostmaster) {
        dao.update(hostmaster);
    }

    @Override
    public hostmaster findOne(int id) {
        return dao.findOne(id);
    }

    @Override
    public List<hostmaster> findAll() {
        return dao.findAll();
    }
}
