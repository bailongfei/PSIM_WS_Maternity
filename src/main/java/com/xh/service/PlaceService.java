package com.xh.service;

import com.alibaba.fastjson.JSONObject;
import com.xh.mapper.PlaceDao;
import com.xh.vo.AvailableBedVo;
import com.xh.vo.BedVo;
import com.xh.vo.FindMaternalVo;
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

    public String find_AvailableBed(){
        Map<String,Object> map = new LinkedHashMap<>();
        map.put("result","0");
        map.put("resultInfo","服务调用失败！");
        try{
            List<AvailableBedVo> placeVos = placeDao.find_AvailableBed();
            map.put("result","1");
            map.put("resultInfo","服务调用成功！");
            map.put("data",placeVos);
        }catch (Exception e){
            e.printStackTrace();
            map.put("resultInfo","服务调用异常!\t"+e.getMessage());
        }

        return JSONObject.toJSONString(map);
    }

    public String findMaternal(String Puerpaer_Name,String Bed_Name,int Puerpaer_Status){
//        System.out.println("Puerpaer_Name："+Puerpaer_Name+"，Bed_Name："+Bed_Name+"，Puerpaer_Status："+Puerpaer_Status);
        Map<String,Object> map = new LinkedHashMap<>();
        map.put("result","0");
        map.put("resultInfo","服务调用失败！");
        try{
            System.out.println("Puerpaer_Name："+Puerpaer_Name+"，Bed_Name："+Bed_Name+"，Puerpaer_Status："+Puerpaer_Status);
            List<FindMaternalVo> findMaternalVos = placeDao.findMaternal(Puerpaer_Name,Bed_Name,Puerpaer_Status);
            map.put("result","1");
            map.put("resultInfo","服务调用成功！");
            map.put("data",findMaternalVos);
        }catch (Exception e){
            e.printStackTrace();
            map.put("resultInfo","服务调用异常!\t"+e.getMessage());
        }

        return JSONObject.toJSONString(map);
    }

    public String call_Bed(String Place_NO){
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
