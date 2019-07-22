package com.xh.vo;


public class DisplayTypeVo {

    private int DisplayType_ID;
    private String DisplayType_Status;

    @Override
    public String toString() {
        return "DisplayTypeVo{" +
                "DisplayType_ID=" + DisplayType_ID +
                ", DisplayType_Status='" + DisplayType_Status + '\'' +
                '}';
    }

    public int getDisplayType_ID() {
        return DisplayType_ID;
    }

    public void setDisplayType_ID(int displayType_ID) {
        DisplayType_ID = displayType_ID;
    }

    public String getDisplayType_Status() {
        return DisplayType_Status;
    }

    public void setDisplayType_Status(String displayType_Status) {
        DisplayType_Status = displayType_Status;
    }
}
