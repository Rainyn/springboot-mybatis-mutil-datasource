package com.springboot.mutildatasource.service.impl;

import com.springboot.mutildatasource.dao.cluster.CityDao;
import com.springboot.mutildatasource.dao.master.UserDao;
import com.springboot.mutildatasource.domain.City;
import com.springboot.mutildatasource.domain.User;
import com.springboot.mutildatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户业务实层
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private CityDao cityDao;

    @Autowired
    private UserDao userDao;

    public User findByName(String userName){
        User user = userDao.findByName(userName);
        City city = cityDao.findByName("杭州");
        user.setCity(city);
        return  user;
    }

}
