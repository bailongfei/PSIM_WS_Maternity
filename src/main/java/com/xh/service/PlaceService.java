package com.xh.service;

import com.alibaba.fastjson.JSONObject;
import com.xh.mapper.PlaceDao;
import com.xh.vo.BedVo;
import com.xh.vo.PlaceVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class PlaceService {

    @Resource
    PlaceDao placeDao;

    public String call_Place(){

        Map<String,Object> map = new LinkedHashMap<>();
        map.put("result","0");
        map.put("resultInfo","服务调用失败！");
        try{
            List<PlaceVo> placeVos = placeDao.call_Place();
            map.put("result","1");
            map.put("resultInfo","服务调用成功！");
            map.put("data",placeVos);
        }catch (Exception e){
            e.printStackTrace();
            map.put("resultInfo","服务调用异常!\t"+e.getMessage());
        }

        return JSONObject.toJSONString(map);
    }

    public String call_Bed(int Place_NO){
        Map<String,Object> map = new LinkedHashMap<>();
        map.put("result","0");
        map.put("resultInfo","服务调用失败！");
        try{
            List<BedVo> bedVos = placeDao.call_Bed(Place_NO);
            map.put("result","1");
            map.put("resultInfo","服务调用成功！");
            map.put("data",bedVos);
        }catch (Exception e){
            e.printStackTrace();
            map.put("resultInfo","服务调用异常!\t"+e.getMessage());
        }
          return JSONObject.toJSONString(map);
    }

}
