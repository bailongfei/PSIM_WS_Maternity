package com.xh.service;

import com.alibaba.fastjson.JSONObject;
import com.xh.mapper.PuerpaerDao;
import com.xh.vo.DisplayVo;
import com.xh.vo.PlaceVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class PuerpaerService {

    @Resource
    PuerpaerDao puerpaerDao;

    public Map<String,Object> addMaternal(Map<String,Object> map){

        return puerpaerDao.addMaternal(map);
    }

    public String read_Display(){
        Map<String,Object> map = new LinkedHashMap<>();
        map.put("result","0");
        map.put("resultInfo","服务调用失败！");
        try{
            List<DisplayVo> displayVos = puerpaerDao.read_Display();
            map.put("result","1");
            map.put("resultInfo","服务调用成功！");
            map.put("data",displayVos);
        }catch (Exception e){
            e.printStackTrace();
            map.put("resultInfo","服务调用异常!\t"+e.getMessage());
        }

        return JSONObject.toJSONString(map);
    }

    public Map<String,Object> updateMaternal(Map<String,Object> map){

        return puerpaerDao.updateMaternal(map);
    }

}
