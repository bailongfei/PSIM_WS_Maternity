package com.xh.vo;


public class AvailableBedVo {

    private String Place_NO;
    private int available_Count;

    @Override
    public String toString() {
        return "AvailableBedVo{" +
                "Place_NO='" + Place_NO + '\'' +
                ", available_Count=" + available_Count +
                '}';
    }

    public String getPlace_NO() {
        return Place_NO;
    }

    public void setPlace_NO(String place_NO) {
        Place_NO = place_NO;
    }

    public int getAvailable_Count() {
        return available_Count;
    }

    public void setAvailable_Count(int available_Count) {
        this.available_Count = available_Count;
    }
}
