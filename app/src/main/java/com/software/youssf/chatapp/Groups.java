package com.software.youssf.chatapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Groups extends Fragment {


    public Groups() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_groups, container, false);
        GridView group_list = (GridView) v.findViewById(R.id.groups_list);
        final ArrayList<GroupItem> groups = new ArrayList<GroupItem>();
        groups.add(new GroupItem("School",R.drawable.groupicon1,"10 Days Ago","10 Members"));
        groups.add(new GroupItem("Club",R.drawable.groupicon2,"5 Days Ago","7 Members"));
        groups.add(new GroupItem("Family",R.drawable.groupicon3,"20 Days Ago","4 Members"));
        groups.add(new GroupItem("Hangout",R.drawable.groupicon4,"3 Days Ago","5 Members"));
        groups.add(new GroupItem("School",R.drawable.groupicon1,"10 Days Ago","10 Members"));
        groups.add(new GroupItem("Club",R.drawable.groupicon2,"5 Days Ago","7 Members"));
        groups.add(new GroupItem("Family",R.drawable.groupicon3,"20 Days Ago","4 Members"));
        groups.add(new GroupItem("Hangout",R.drawable.groupicon4,"3 Days Ago","5 Members"));
        group_list.setAdapter(new GroupsAdapter(getContext(),groups));

        // Inflate the layout for this fragment
        return v;
    }

}
