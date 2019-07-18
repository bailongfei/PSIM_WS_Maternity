package com.xh.vo;


public class BedVo {

    private int Bed_ID;         //床位id
    private String Bed_Name;    //床位号
    private String Bed_Status;  //床位状态：1可用，0不可用

    @Override
    public String toString() {
        return "BedVo{" +
                "Bed_ID=" + Bed_ID +
                ", Bed_Name='" + Bed_Name + '\'' +
                ", Bed_Status='" + Bed_Status + '\'' +
                '}';
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
