package com.xh.vo;


public class PlaceVo {

    private int Place_NO;
    private String Place_Name;
    private String Place_Type;
    private String Place_Flag;
    private String Place_Note;
    private int Place_Status;

    @Override
    public String toString() {
        return "PlaceVo{" +
                "Place_NO=" + Place_NO +
                ", Place_Name='" + Place_Name + '\'' +
                ", Place_Type='" + Place_Type + '\'' +
                ", Place_Flag='" + Place_Flag + '\'' +
                ", Place_Note='" + Place_Note + '\'' +
                ", Place_Status=" + Place_Status +
                '}';
    }

    public int getPlace_NO() {
        return Place_NO;
    }

    public void setPlace_NO(int place_NO) {
        Place_NO = place_NO;
    }

    public String getPlace_Name() {
        return Place_Name;
    }

    public void setPlace_Name(String place_Name) {
        Place_Name = place_Name;
    }

    public String getPlace_Type() {
        return Place_Type;
    }

    public void setPlace_Type(String place_Type) {
        Place_Type = place_Type;
    }

    public String getPlace_Flag() {
        return Place_Flag;
    }

    public void setPlace_Flag(String place_Flag) {
        Place_Flag = place_Flag;
    }

    public String getPlace_Note() {
        return Place_Note;
    }

    public void setPlace_Note(String place_Note) {
        Place_Note = place_Note;
    }

    public int getPlace_Status() {
        return Place_Status;
    }

    public void setPlace_Status(int place_Status) {
        Place_Status = place_Status;
    }
}
