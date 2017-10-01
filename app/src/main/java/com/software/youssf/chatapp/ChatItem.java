package com.software.youssf.chatapp;

import android.content.Intent;

/**
 * Created by youssef on 29/09/17.
 */

public class ChatItem {
    public String userName;
    public String last_message;
    public int user_img;
    public String mess_date;
    public ChatItem(String user,String lastmessage, int img, String date) {
        this.userName = user;
        this.last_message = lastmessage;
        this.user_img = img;
        this.mess_date = date;
    }
    
}
