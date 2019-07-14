package com.ssm.demo.service;
import com.ssm.demo.domain.hostmaster;

import java.util.List;

public interface HostmasterService {
    //添加
    void insert(String username);
    //删除
    void delete(int id);
    //修改
    void update(hostmaster hostmaster );
    //根据id查询
    hostmaster findOne(int id);
    //查询所有
    List<hostmaster> findAll();
}
