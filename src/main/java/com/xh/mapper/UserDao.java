package com.xh.mapper;

import java.util.Map;

public interface UserDao {

    //登录
    Map<String,Object> login(Map<String, Object> mpa);

}
