package com.springboot.mutildatasource.service;

import com.springboot.mutildatasource.domain.User;

/**
 *城市业务逻辑接口
 */
public interface UserService {

    /**
     * 根据城市名查询城市信息
     * @return
     */
    User findByName(String userName);

}
