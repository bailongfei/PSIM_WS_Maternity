package com.xh.soap.impl;

import com.alibaba.fastjson.JSONObject;
import com.xh.service.PlaceService;
import com.xh.service.PuerpaerService;
import com.xh.service.UserService;
import com.xh.soap.UserSoap;

import javax.annotation.Resource;
import javax.jws.WebService;
import java.util.LinkedHashMap;
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
    public String call_Bed(String Place_NO) {
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
                 int DisplayType_ID, String Custom_Type, String Custom_Broadcast, int Puerpaer_Status,
                 int DisplayStatus)
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
        map.put("DisplayStatus",DisplayStatus);

        Map<String,Object> addMap = puerpaerService.addMaternal(map);

        return JSONObject.toJSONString(addMap);
    }

    @Override
    public String read_Display() {

        return puerpaerService.read_Display();
    }

    @Override
    public String read_Maternal(int Bed_ID) {
        Map<String,Object> map = new LinkedHashMap<>();
        map.put("Bed_ID",Bed_ID);

        Map<String,Object> readMaternalMap = puerpaerService.read_Maternal(map);

        return JSONObject.toJSONString(readMaternalMap);
    }

    @Override
    public String disPlay_Title() {
        Map<String,Object> titleMap = puerpaerService.disPlay_Title();

        return JSONObject.toJSONString(titleMap);
    }

    @Override
    public String updateDisplayTitle(String Display_IP, String Display_Title, String Display_Scroll_Text) {
        Map<String,Object> map = new LinkedHashMap<>();
        map.put("Display_IP",Display_IP);
        map.put("Display_Title",Display_Title);
        map.put("Display_Scroll_Text",Display_Scroll_Text);

        return puerpaerService.updateDisplayTitle(map);
    }

    @Override
    public String call_DisplayType() {

        return userService.call_DisplayType();
    }

    @Override
    public String updateMaternal(int Bed_ID, int Display_ID) {
        Map<String,Object> map = new LinkedHashMap<>();
        map.put("Bed_ID",Bed_ID);
        map.put("Display_ID",Display_ID);

        Map<String,Object> materMap = puerpaerService.updateMaternal(map);

        return JSONObject.toJSONString(materMap);
    }

    @Override
    public String update_CustomType(int Bed_ID, String Custom_Type) {
        Map<String,Object> map = new LinkedHashMap<>();
        map.put("Bed_ID",Bed_ID);
        map.put("Custom_Type",Custom_Type);

        Map<String,Object> customTypeMap = puerpaerService.update_CustomType(map);

        return JSONObject.toJSONString(customTypeMap);
    }

    @Override
    public String update_Broadcast(int Bed_ID, String Custom_Broadcast) {
        Map<String,Object> map = new LinkedHashMap<>();
        map.put("Bed_ID",Bed_ID);
        map.put("Custom_Broadcast",Custom_Broadcast);

        Map<String,Object> broadcastMap = puerpaerService.update_Broadcast(map);

        return JSONObject.toJSONString(broadcastMap);
    }

    @Override
    public String findMaternal(String Puerpaer_Name, String Bed_Name, int Puerpaer_Status) {

        return placeService.findMaternal(Puerpaer_Name,Bed_Name,Puerpaer_Status);
    }
}
