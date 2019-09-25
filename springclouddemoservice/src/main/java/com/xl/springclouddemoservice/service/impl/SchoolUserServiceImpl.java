package com.xl.springclouddemoservice.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.xl.springclouddemoservice.dao.SchoolDao;
import com.xl.springclouddemoservice.dao.UserDao;
import com.xl.springclouddemoservice.entity.School;
import com.xl.springclouddemoservice.entity.User;
import com.xl.springclouddemoservice.service.SchoolUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @ClassName SchoolUserServiceImpl
 * @Description TODO
 * @Author xule
 * @Date 2019/9/24 15:45
 * @Version 1.0
 **/

@Service("schoolUserService")
public class SchoolUserServiceImpl implements SchoolUserService {
    @Resource
    private SchoolDao schoolDao;
    @Resource
    private UserDao userDao;

    @Override
    @LcnTransaction //分布式事务注解
    @Transactional(rollbackFor = Exception.class) //本地事务注解
    public void addSchoolAndUser(String userName, String schoolName) {
        School school = new School();
        school.setName(schoolName);
        schoolDao.insertSelective(school);
        User user = new User();
        user.setName(userName);
        user.setSchoolId(school.getId());
        userDao.insertSelective(user);
    }

    @Override
    @LcnTransaction //分布式事务注解
    @Transactional(rollbackFor = Exception.class) //本地事务注解
    public void updateSchoolAndUser(Integer schoolId, String schoolName, Integer userId, String userName) {
        School school = new School();
        school.setId(schoolId);
        school.setName(schoolName);
        schoolDao.updateByPrimaryKeySelective(school);
        User user = new User();
        user.setId(userId);
        user.setName(userName);
        userDao.updateByPrimaryKeySelective(user);
    }
}
