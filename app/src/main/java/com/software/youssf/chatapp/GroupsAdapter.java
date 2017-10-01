package com.software.youssf.chatapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by youssef on 30/09/17.
 */

public class GroupsAdapter extends ArrayAdapter<GroupItem> {

    public GroupsAdapter(Context context, ArrayList<GroupItem> lista) {
        super(context,0,lista);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        GroupItem item = getItem(position);
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.groups_list,parent,false);
        }
        TextView gr_name = (TextView) convertView.findViewById(R.id.group_name);
        ImageView gr_img = (ImageView) convertView.findViewById(R.id.group_image);
        TextView gr_date = (TextView) convertView.findViewById(R.id.group_date);
        TextView gr_members = (TextView) convertView.findViewById(R.id.group_members);
        gr_name.setText(item.group_name);
        gr_img.setImageResource(item.group_icon);
        gr_date.setText(item.group_date);
        gr_members.setText(item.group_members);
        return convertView;
    }
}
