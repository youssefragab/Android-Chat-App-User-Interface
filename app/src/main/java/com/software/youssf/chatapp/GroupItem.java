package com.software.youssf.chatapp;

/**
 * Created by youssef on 30/09/17.
 */

public class GroupItem {
    public String group_name;
    public int group_icon;
    public String group_date;
    public String group_members;

    public GroupItem(String name,int img, String date, String members) {
        this.group_name = name;
        this.group_icon = img;
        this.group_date = date;
        this.group_members = members;

    }
}
