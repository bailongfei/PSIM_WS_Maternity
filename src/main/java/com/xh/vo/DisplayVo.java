package com.xh.vo;


public class DisplayVo {

    private String Place_NO;    //房间号
    private String Place_Flag;  //房间表示
    private String Bed_Name;    //床位
    private String Puerpaer_Name;   //姓名
    private String DisplayType_Status;  //显示状态
    private String Custom_Type;      //自定义显示状态
    private String Custom_Broadcast; //自定义呼叫信息

    @Override
    public String toString() {
        return "DisplayVo{" +
                "Place_NO='" + Place_NO + '\'' +
                ", Place_Flag='" + Place_Flag + '\'' +
                ", Bed_Name='" + Bed_Name + '\'' +
                ", Puerpaer_Name='" + Puerpaer_Name + '\'' +
                ", DisplayType_Status='" + DisplayType_Status + '\'' +
                ", Custom_Type='" + Custom_Type + '\'' +
                ", Custom_Broadcast='" + Custom_Broadcast + '\'' +
                '}';
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

    public String getBed_Name() {
        return Bed_Name;
    }

    public void setBed_Name(String bed_Name) {
        Bed_Name = bed_Name;
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
