package com.xh.soap;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "NurseService",targetNamespace = "http://NurseService.xh.com")
public interface UserSoap {

    //登录
    @WebMethod(operationName = "login",action = "http://NurseService.xh.com/login")
    @WebResult(name = "loginResult",targetNamespace = "http://NurseService.xh.com")
    public String login(
            @WebParam(name = "Staff_LoginName") String Staff_LoginName,
            @WebParam(name = "Staff_password") String Staff_password
    );

    //读取产房数据
    @WebMethod(operationName = "call_Place",action = "http://NurseService.xh.com/call_Place")
    @WebResult(name = "placeResult",targetNamespace = "http://NurseService.xh.com")
    public String call_Place();

    //读取床位数据
    @WebMethod(operationName = "call_Bed",action = "http://NurseService.xh.com/call_Bed")
    @WebResult(name = "bedResult",targetNamespace = "http://NurseService.xh.com")
    public String call_Bed(
            @WebParam(name = "Place_NO") int Place_NO
    );

    //新增产妇信息表数据
    @WebMethod(operationName = "add_Maternal",action = "http://NurseService.xh.com/add_Maternal")
    @WebResult(name = "maternalResult",targetNamespace = "http://NurseService.xh.com")
    public String addMaternal(
            @WebParam(name = "Puerpaer_Name") String Puerpaer_Name,
            @WebParam(name = "Puerpaer_Sex") int Puerpaer_Sex,
            @WebParam(name = "Puerpaer_Age") int Puerpaer_Age,
            @WebParam(name = "Bed_ID") int Bed_ID,
            @WebParam(name = "DisplayType_ID") int DisplayType_ID,
            @WebParam(name = "Custom_Type") String Custom_Type,
            @WebParam(name = "Custom_Broadcast") String Custom_Broadcast,
            @WebParam(name = "Puerpaer_Status") int Puerpaer_Status

    );

    //大屏显示产妇试产进度信息
    /**所需参数：
     *     无
     *
     * 返回参数：
     *      房间编号、特殊标符、床位编号、产妇姓名、产妇进度状态
     * */
    @WebMethod(operationName = "read_Display",action = "http://NurseService.xh.com/read_Display")
    @WebResult(name = "displayResult",targetNamespace = "http://NurseService.xh.com")
    public String read_Display();

    //根据床位Bed_ID获取相应床位产妇的信息


    //修改产妇试产进度信息
    /**
     * 所需参数：
     *      床位Id
     *      产妇进度状态信息
     *
     * 返回参数： result  1
     * */
    @WebMethod(operationName = "updateMaternal",action = "http://NurseService.xh.com/updateMaternal")
    @WebResult(name = "upMaterResult",targetNamespace = "http://NurseService.xh.com")
    public String updateMaternal(
            @WebParam(name = "Bed_ID") int Bed_ID,
            @WebParam(name = "Display_ID") int Display_ID
    );

    //根据Bed_ID获取相应产房进度状态信息
    /**所需参数：
     *      Bed_ID      床位ID
     *
     * 返回参数：
     *      房间号、床位号、姓名、状态、自定义状态、自定义呼叫
     * */
    @WebMethod(operationName = "read_Maternal",action = "http://NurseService.xh.com/read_Maternal")
    @WebResult(name = "readMaterResult",targetNamespace = "http://NurseService.xh.com")
    public String read_Maternal(
            @WebParam(name = "Bed_ID") int Bed_ID
    );

    //获取所有状态进度信息
    /**
     * 所需参数：无
     * 返回参数
     *      状态id
     *      状态名字
     * */
    @WebMethod(operationName = "call_DisplayType",action = "http://NurseService.xh.com/call_DisplayType")
    @WebResult(name = "displayTypeResult",targetNamespace = "http://NurseService.xh.com")
    public String call_DisplayType();

}
