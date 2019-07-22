package com.xh.mapper;

import com.xh.vo.DisplayTypeVo;

import java.util.List;
import java.util.Map;

public interface UserDao {

    //登录
    Map<String,Object> login(Map<String, Object> mpa);

    //下拉框所需所有状态信息
    List<DisplayTypeVo> call_DisplayType();

}
