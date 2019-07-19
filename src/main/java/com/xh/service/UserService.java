package com.xh.service;

import com.alibaba.fastjson.JSONObject;
import com.xh.mapper.UserDao;
import com.xh.vo.DisplayTypeVo;
import com.xh.vo.DisplayVo;
import org.springframework.stereotype.Service;
import sun.plugin2.message.JavaScriptBaseMessage;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Resource
    UserDao userDao;

    public Map<String,Object> login(Map<String,Object> map){

        return userDao.login(map);
    }

    public String call_DisplayType(){
        Map<String,Object> map = new LinkedHashMap<>();
        map.put("result","0");
        map.put("resultInfo","服务调用失败！");
        try{
            List<DisplayTypeVo> displayVos = userDao.call_DisplayType();
            map.put("result","1");
            map.put("resultInfo","服务调用成功！");
            map.put("data",displayVos);
        }catch (Exception e){
            e.printStackTrace();
            map.put("resultInfo","服务调用异常!\t"+e.getMessage());
        }

        return JSONObject.toJSONString(map);
    }

}
