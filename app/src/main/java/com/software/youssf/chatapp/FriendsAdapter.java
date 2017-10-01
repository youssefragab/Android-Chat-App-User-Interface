package com.software.youssf.chatapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.andexert.library.RippleView;

import java.util.ArrayList;

import static com.software.youssf.chatapp.R.id.last_message;

/**
 * Created by youssef on 30/09/17.
 */

public class FriendsAdapter extends ArrayAdapter<FriendItem> {


    public FriendsAdapter(Context context, ArrayList<FriendItem> lista) {
        super(context,0,lista);
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
     final FriendItem item = getItem(position);
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.friends_list, parent, false);
        }
        TextView name = (TextView) convertView.findViewById(R.id.user_name);
        ImageView img = (ImageView) convertView.findViewById(R.id.user_image);
        Button chat = (Button) convertView.findViewById(R.id.chat);
        com.andexert.library.RippleView ripple = (com.andexert.library.RippleView) convertView.findViewById(R.id.more);

        name.setText(item.name);
        img.setImageResource(item.img);
         ripple.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
             @Override
             public void onComplete(RippleView rippleView) {
                 String user_name = item.name;
                 Intent conversation = new Intent(getContext(), userInfo.class);
                 conversation.putExtra("name",user_name);
                 conversation.putExtra("img",item.super_img);
                 getContext().startActivity(conversation);
             }
         });
        return convertView;
    }
}
