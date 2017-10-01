package com.software.youssf.chatapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.andexert.library.RippleView;

import java.util.ArrayList;

import static android.R.id.list;

/**
 * Created by youssef on 29/09/17.
 */

public class ChatsAdapter extends ArrayAdapter<ChatItem> {
    public ChatsAdapter(Context context, ArrayList<ChatItem> list) {
        super(context,0,list);
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        final ChatItem item = getItem(position);
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.chats_list, parent, false);
        }
        TextView name = (TextView) convertView.findViewById(R.id.user_name);
        ImageView userImage = (ImageView) convertView.findViewById(R.id.user_image);
        TextView lastmess = (TextView) convertView.findViewById(R.id.last_message);
        TextView time = (TextView) convertView.findViewById(R.id.time);
        com.andexert.library.RippleView ripple = (com.andexert.library.RippleView) convertView.findViewById(R.id.more);

        time.setText(item.mess_date);
        lastmess.setText(item.last_message);
        name.setText(item.userName);
        userImage.setImageResource(item.user_img);
        ripple.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                String user_name = item.userName;
                String last_message = item.last_message;
                String date = item.mess_date;

                Intent conversation = new Intent(getContext(), conversation.class);
                conversation.putExtra("name",user_name);
                conversation.putExtra("message",last_message);
                conversation.putExtra("date",date);
                getContext().startActivity(conversation);
            }
        });
        return convertView;
    }
}
