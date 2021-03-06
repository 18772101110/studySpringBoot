package com.study.controller;

import com.study.entity.User;
import com.study.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @CLASSNAME :TestController
 * @Description :数据测试
 * @Author :Mr.薛
 * @Data :2019/3/6 0006  16:10
 * @Version :V1.0
 * @Status : 编写
 **/
@RestController
public class TestController {
    @Autowired
    IUserService userService;

    /*查询所有用户信息*/
    @RequestMapping(value = "/selectAllUser",method = RequestMethod.GET)
    public List<User> selectAllUser(){
        List<User> list = userService.selectAllUser();
        if(list.size() > 0){
            return list;
        }else{
            return null;
        }
    }

    /*根据id查询用户信息*/
    @RequestMapping(value = "/selectUserById/{id}",method = RequestMethod.GET)
    public User selectUserById(@PathVariable("id") int id){
        return userService.selectUserById(id);
    }

    /*根据姓名模糊查询*/
    @RequestMapping(value = "/selectLikeName/{name}",method = RequestMethod.GET)
    public List<User> selectLikeName(@PathVariable("name") String name){
        List<User> list = userService.selectLikeName(name);
        if(list.size() > 0){
            return list;
        }else{
            return null;
        }
    }

    /*添加用户信息*/
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public String addUser(@RequestParam("age") int age, @RequestParam("name") String name){
        int m = userService.addUser(age,name);
        if(m > 0){
            return "addUser Success";
        }else{
            return "addUser Failed";
        }
    }

    /*修改用户信息*/
    @RequestMapping(value = "/updateUser/{id}",method = RequestMethod.PUT)
    public String updateUser(@PathVariable("id") int id, @RequestParam("age") int age, @RequestParam("name") String name){
        int m = userService.updateUser(id,age,name);
        if(m > 0){
            return "updateUser Success";
        }else{
            return "updateUser Failed,Please check the id is write";
        }
    }

    /*删除用户信息*/
    @RequestMapping(value = "/deleteUser/{id}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable("id") int id){
        int m = userService.deleteUser(id);
        if(m > 0){
            return "deleteUser Success";
        }else{
            return "deleteUser Failed,Please check the id is write";
        }
    }

}
