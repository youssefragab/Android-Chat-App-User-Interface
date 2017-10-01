package com.software.youssf.chatapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;




/**
 * A simple {@link Fragment} subclass.
 */
public class Friends extends Fragment {


    public Friends() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_friends, container, false);
        ListView friends_list = (ListView) v.findViewById(R.id.friends_list);
        ArrayList<FriendItem> lista = new ArrayList<FriendItem>();
        lista.add(new FriendItem("youssef",R.drawable.user1,R.drawable.user_big_1));
        lista.add(new FriendItem("omar",R.drawable.user2,R.drawable.user_big_2));
        lista.add(new FriendItem("ragab",R.drawable.user3,R.drawable.user_big_3));
        lista.add(new FriendItem("khalied",R.drawable.user4,R.drawable.user_big_4));
        lista.add(new FriendItem("Ahmed",R.drawable.user5,R.drawable.user_big_1));
        lista.add(new FriendItem("Abdallah",R.drawable.user6,R.drawable.user_big_2));
        lista.add(new FriendItem("mohammed",R.drawable.user7,R.drawable.user_big_3));
        friends_list.setAdapter(new FriendsAdapter(getContext(),lista));

        return v;
    }

}
