package com.xh.vo;


public class BedVo {

    private int Bed_ID;         //床位id
    private String Bed_Name;    //床位号
    private String Bed_Status;  //床位状态：1可用，0不可用
    private String Puerpaer_Name; //产妇姓名
    private String DisplayType_Status; //产妇试产进度状态
    private String Custom_Type;     //自定义显示状态
    private int DisplayStatus;      //1或0，表示显示哪种状态，可显示已存在的亦可显示自定义的
    private int Puerpaer_Status;    //产妇出院住院状态

    @Override
    public String toString() {
        return "BedVo{" +
                "Bed_ID=" + Bed_ID +
                ", Bed_Name='" + Bed_Name + '\'' +
                ", Bed_Status='" + Bed_Status + '\'' +
                ", Puerpaer_Name='" + Puerpaer_Name + '\'' +
                ", DisplayType_Status='" + DisplayType_Status + '\'' +
                ", Custom_Type='" + Custom_Type + '\'' +
                ", DisplayStatus=" + DisplayStatus +
                ", Puerpaer_Status=" + Puerpaer_Status +
                '}';
    }

    public int getPuerpaer_Status() {
        return Puerpaer_Status;
    }

    public void setPuerpaer_Status(int puerpaer_Status) {
        Puerpaer_Status = puerpaer_Status;
    }

    public String getCustom_Type() {
        return Custom_Type;
    }

    public void setCustom_Type(String custom_Type) {
        Custom_Type = custom_Type;
    }

    public int getDisplayStatus() {
        return DisplayStatus;
    }

    public void setDisplayStatus(int displayStatus) {
        DisplayStatus = displayStatus;
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
}
