package com.xh.mapper;

import com.xh.vo.DisplayVo;

import java.util.List;
import java.util.Map;

public interface PuerpaerDao {

    //新增产妇信息
    Map<String,Object> addMaternal(Map<String, Object> map);

    //大屏显示产妇试产进度状态信息
    List<DisplayVo> read_Display();

}
