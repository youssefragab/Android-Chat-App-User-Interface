package com.software.youssf.chatapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static com.software.youssf.chatapp.R.id.chat;


/**
 * A simple {@link Fragment} subclass.
 */
public class Chats extends Fragment {

ListView chats_list;
    public Chats() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vi = inflater.inflate(R.layout.fragment_chats, container, false);
        chats_list = (ListView) vi.findViewById(R.id.chats_list);
      final ArrayList<ChatItem> chats = new ArrayList<ChatItem>();
        chats.add(new ChatItem("youssef","thank you",R.drawable.user1,"9:23"));
        chats.add(new ChatItem("omar","i will contact you",R.drawable.user2,"yesterday"));
        chats.add(new ChatItem("ragab","see you tomorrow",R.drawable.user3,"5:23"));
        chats.add(new ChatItem("khalied","we will see about that",R.drawable.user4,"10:01"));
        chats.add(new ChatItem("Ahmed","lets go",R.drawable.user5,"Monday"));
        chats.add(new ChatItem("Abdallah","what is the homework?",R.drawable.user6,"12/9/2017"));
        chats.add(new ChatItem("mohammed","sure why not",R.drawable.user7,"sunday"));
        chats.add(new ChatItem("youssef","thank you",R.drawable.user1,"9:23"));
        chats.add(new ChatItem("omar","i will contact you",R.drawable.user2,"yesterday"));
        chats.add(new ChatItem("ragab","see you tomorrow",R.drawable.user3,"5:23"));
        chats.add(new ChatItem("khalied","we will see about that",R.drawable.user4,"10:01"));
        chats.add(new ChatItem("Ahmed","lets go",R.drawable.user5,"Monday"));
        chats.add(new ChatItem("Abdallah","what is the homework?",R.drawable.user6,"12/9/2017"));
        chats.add(new ChatItem("mohammed","sure why not",R.drawable.user7,"sunday"));
        chats_list.setAdapter(new ChatsAdapter(getContext(),chats));

        return vi;
    }



}
