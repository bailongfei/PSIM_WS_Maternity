package com.xh.vo;


public class DisplayVo {

    private String Place_NO;
    private String Place_Flag;
    private String Bed_Name;
    private String Puerpaer_Name;
    private String DisplayType_Status;

    @Override
    public String toString() {
        return "DisplayVo{" +
                "Place_NO='" + Place_NO + '\'' +
                ", Place_Flag='" + Place_Flag + '\'' +
                ", Bed_Name='" + Bed_Name + '\'' +
                ", Puerpaer_Name='" + Puerpaer_Name + '\'' +
                ", DisplayType_Status='" + DisplayType_Status + '\'' +
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
}
