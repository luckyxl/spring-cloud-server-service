package com.xl.springclouddemoservice.controller;

import com.xl.springclouddemoservice.service.SchoolUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName SchoolUserController
 * @Description TODO
 * @Author xule
 * @Date 2019/9/24 15:49
 * @Version 1.0
 **/
@RestController
@RequestMapping("/schoolUser")
public class SchoolUserController {
    @Resource
    private SchoolUserService schoolUserService;

    @PostMapping("add")
    public String add(String schoolName, String userName) {
        schoolUserService.addSchoolAndUser(userName, schoolName);
        return "success";
    }

    @PostMapping("update")
    public String update(Integer schoolId,String schoolName,Integer userId,String userName) {
        schoolUserService.updateSchoolAndUser(schoolId, schoolName, userId, userName);
        return "success";
    }

}
