package com.xl.springclouddemoservice.service;

/**
 * @ClassName SchoolUserService
 * @Description TODO
 * @Author xule
 * @Date 2019/9/24 15:44
 * @Version 1.0
 **/
public interface SchoolUserService {

    void addSchoolAndUser(String userName, String schoolName);

    void updateSchoolAndUser(Integer schoolId,String schoolName,Integer userId,String userName);
}
