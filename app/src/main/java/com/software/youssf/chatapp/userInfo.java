package com.software.youssf.chatapp;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.software.youssf.chatapp.R.id.last_message;
import static java.security.AccessController.getContext;

public class userInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        // receiver intent
        Intent in = getIntent();
        Bundle data = in.getExtras();
        final String name = data.getString("name");
        int img = data.getInt("img");
        //
        TextView info_name = (TextView) findViewById(R.id.name);
        ImageView info_img = (ImageView) findViewById(R.id.user_image);
        info_img.setImageResource(img);
        info_name.setText(name);

        //
        ImageView return_bu = (ImageView) findViewById(R.id.return_bu);
        ImageView chat = (ImageView) findViewById(R.id.chat);
        return_bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(view.getContext(),MainActivity.class);
                startActivity(in);
            }
        });

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user_name = name;
                Intent conversation = new Intent(view.getContext(), conversation.class);
                conversation.putExtra("name",user_name);
                startActivity(conversation);
            }
        });
    }
}
