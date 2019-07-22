package com.xh.mapper;

import com.xh.vo.DisplayVo;
import org.omg.CORBA.OBJ_ADAPTER;

import java.util.List;
import java.util.Map;

public interface PuerpaerDao {

    //新增产妇信息
    Map<String,Object> addMaternal(Map<String, Object> map);

    //大屏显示产妇试产进度状态信息
    List<DisplayVo> read_Display();

    //大屏显示标题和滚动信息
    Map<String,Object> disPlay_Title();

    //根据床位Bed_ID获取相应的产妇信息
    Map<String,Object> read_Maternal(Map<String,Object> map);

    //修改产妇进度状态信息
    Map<String,Object> updateMaternal(Map<String,Object> map);

    //修改自定义产妇进度状态信息
    Map<String,Object> update_CustomType(Map<String,Object> map);

    //修改自定义呼叫信息
    Map<String,Object> update_Broadcast(Map<String,Object> map);

}

