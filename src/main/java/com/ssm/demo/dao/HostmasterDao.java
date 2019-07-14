package com.ssm.demo.dao;

import com.ssm.demo.domain.hostmaster;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface HostmasterDao {
    //添加
    @Insert("insert into hostmaster(username) values(#{username})")
    void insert(String username);
    //删除
    @Delete("delete from hostmaster where id=#{id}")
    void delete(int id);
    //修改
    @Update("update hostmaster set username=#{username} where id=#{id}")
    void update(hostmaster hostmaster );
    //根据id查询
    @Select("select * from hostmaster where id=#{id}")
    hostmaster findOne(int id);
    //查询所有
    @Select("select * from hostmaster")
    List<hostmaster> findAll();
}
