package com.xh.vo;


public class FindMaternalVo {

    private String Place_NO;    //产室序号
    private String Place_Flag;  //特殊标符
    private int Bed_ID;         //床位id
    private String Bed_Name;    //床位号
    private String Bed_Status;  //床位状态：1可用，0不可用
    private String Puerpaer_Name; //产妇姓名
    private String DisplayType_Status; //产妇试产进度状态
    private String Custom_Type;      //自定义显示状态
    private String Custom_Broadcast; //自定义呼叫信息
    private int DisplayStatus;      //1、0

    @Override
    public String toString() {
        return "FindMaternalVo{" +
                "Place_NO='" + Place_NO + '\'' +
                ", Place_Flag='" + Place_Flag + '\'' +
                ", Bed_ID=" + Bed_ID +
                ", Bed_Name='" + Bed_Name + '\'' +
                ", Bed_Status='" + Bed_Status + '\'' +
                ", Puerpaer_Name='" + Puerpaer_Name + '\'' +
                ", DisplayType_Status='" + DisplayType_Status + '\'' +
                ", Custom_Type='" + Custom_Type + '\'' +
                ", Custom_Broadcast='" + Custom_Broadcast + '\'' +
                ", DisplayStatus=" + DisplayStatus +
                '}';
    }

    public int getDisplayStatus() {
        return DisplayStatus;
    }

    public void setDisplayStatus(int displayStatus) {
        DisplayStatus = displayStatus;
    }

    public String getPlace_NO() {
        return Place_NO;
    }

    public void setPlace_NO(String place_NO) {
        Place_NO = place_NO;
    }

    public String getPlace_Flag() {
        return Place_Flag;
    }

    public void setPlace_Flag(String place_Flag) {
        Place_Flag = place_Flag;
    }

    public int getBed_ID() {
        return Bed_ID;
    }

    public void setBed_ID(int bed_ID) {
        Bed_ID = bed_ID;
    }

    public String getBed_Name() {
        return Bed_Name;
    }

    public void setBed_Name(String bed_Name) {
        Bed_Name = bed_Name;
    }

    public String getBed_Status() {
        return Bed_Status;
    }

    public void setBed_Status(String bed_Status) {
        Bed_Status = bed_Status;
    }

    public String getPuerpaer_Name() {
        return Puerpaer_Name;
    }

    public void setPuerpaer_Name(String puerpaer_Name) {
        Puerpaer_Name = puerpaer_Name;
    }

    public String getDisplayType_Status() {
        return DisplayType_Status;
    }

    public void setDisplayType_Status(String displayType_Status) {
        DisplayType_Status = displayType_Status;
    }

    public String getCustom_Type() {
        return Custom_Type;
    }

    public void setCustom_Type(String custom_Type) {
        Custom_Type = custom_Type;
    }

    public String getCustom_Broadcast() {
        return Custom_Broadcast;
    }

    public void setCustom_Broadcast(String custom_Broadcast) {
        Custom_Broadcast = custom_Broadcast;
    }
}
