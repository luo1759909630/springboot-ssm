package com.ssm.demo.Controller;

import com.ssm.demo.domain.hostmaster;
import com.ssm.demo.service.HostmasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HostmasterController {
    @Autowired
    HostmasterService service;

    //添加
    @RequestMapping("/insert")
    public  String insert(String username){
        service.insert(username);
        return "添加成功";
    }
    //删除
    @RequestMapping("/delete")
    public String delete(int id){
        service.delete(id);
        return  "删除成功";
    }
    //修改
    @RequestMapping("/update")
    public String update(){
        hostmaster hostmaster=new hostmaster();
        hostmaster.setId(1);
        hostmaster.setUsername("荆轲");
        service.update(hostmaster);
        return  "修改成功";
    }
    //根据id查询
    @RequestMapping("/findOne")
    public hostmaster findOne(int id){
        hostmaster hostmaster=service.findOne(id);
        return  hostmaster;
    }
    //查询所有
    @RequestMapping("/findAll")
    public  List<hostmaster> findAll(){
        List<hostmaster> list=service.findAll();
        return list;
    }
}
