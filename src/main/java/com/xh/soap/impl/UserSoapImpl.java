package com.xh.soap.impl;

import com.alibaba.fastjson.JSONObject;
import com.xh.service.PlaceService;
import com.xh.service.PuerpaerService;
import com.xh.service.UserService;
import com.xh.soap.UserSoap;
import com.xh.vo.BedVo;

import javax.annotation.Resource;
import javax.jws.WebService;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@WebService(name = "NurseService",targetNamespace = "http://NurseService.xh.com",endpointInterface = "com.xh.soap.UserSoap",serviceName = "NurseServiceName",portName = "NursePortName")
public class UserSoapImpl implements UserSoap {

    @Resource
    UserService userService;
    @Resource
    PlaceService placeService;
    @Resource
    PuerpaerService puerpaerService;

    //实现登录接口
    @Override
    public String login(String Staff_LoginName, String Staff_password) {
        Map<String,Object> map = new LinkedHashMap<>();
        map.put("Staff_LoginName",Staff_LoginName);
        map.put("Staff_password",Staff_password);

        Map<String,Object> loginMap = userService.login(map);

        return JSONObject.toJSONString(loginMap);
    }

    @Override
    public String call_Place() {

        return placeService.call_Place();
    }

    @Override
    public String call_Bed(int Place_NO) {
//        List<BedVo> bedList = ;
//        for (int i=0; i<bedList.size();i++){
//            System.out.println(bedList.get(i));
//        }
//        Map<String,Object> map = new LinkedHashMap<>();
//        map.put("resultCode","1");
//        map.put("resultInfo","服务调用成功！");
//        map.put("data",bedList);
      /*  Map<Integer,BedVo> bedMap = new HashMap<Integer, BedVo>();
        for (BedVo bedVo : bedList){
            bedMap.put(bedVo.getBed_ID(),bedVo);
        }*/

        return placeService.call_Bed(Place_NO);
    }

    @Override
    public String addMaternal(String Puerpaer_Name, int Puerpaer_Sex, int Puerpaer_Age, int Bed_ID,
                 int DisplayType_ID, String Custom_Type, String Custom_Broadcast, int Puerpaer_Status)
    {
        Map<String,Object> map = new LinkedHashMap<>();
        map.put("Puerpaer_Name",Puerpaer_Name);
        map.put("Puerpaer_Sex",Puerpaer_Sex);
        map.put("Puerpaer_Age",Puerpaer_Age);
        map.put("Bed_ID",Bed_ID);
        map.put("DisplayType_ID",DisplayType_ID);
        map.put("Custom_Type",Custom_Type);
        map.put("Custom_Broadcast",Custom_Broadcast);
        map.put("Puerpaer_Status",Puerpaer_Status);

        Map<String,Object> addMap = puerpaerService.addMaternal(map);

        return JSONObject.toJSONString(addMap);
    }

    @Override
    public String read_Display() {

        return puerpaerService.paer_Display();
    }

}
