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

    public Map<String,Object> disPlay_Title(){

        return puerpaerDao.disPlay_Title();
    }

    public String updateDisplayTitle(Map<String,Object> map){
        Map<String,Object> map1 = new LinkedHashMap<>();
        map1.put("result","0");
        map1.put("resultInfo","服务调用失败！");
        try{
            Map<String,Object> displayTitleVos = puerpaerDao.updateDisplayTitle(map);
            map1.put("result","1");
            map1.put("resultInfo","服务调用成功！");
            map1.put("data",displayTitleVos);
        }catch (Exception e){
            e.printStackTrace();
            map1.put("resultInfo","服务调用异常!\t"+e.getMessage());
        }

        return JSONObject.toJSONString(map1);
    }

    public Map<String,Object> updateMaternal(Map<String,Object> map){

        return puerpaerDao.updateMaternal(map);
    }

    public Map<String,Object> read_Maternal(Map<String,Object> map){

        return puerpaerDao.read_Maternal(map);
    }

    public Map<String,Object> update_CustomType(Map<String,Object> map){

        return puerpaerDao.update_CustomType(map);
    }

    public Map<String,Object> update_Broadcast(Map<String,Object> map){

        return puerpaerDao.update_Broadcast(map);
    }

}
