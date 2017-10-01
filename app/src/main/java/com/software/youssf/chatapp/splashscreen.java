package com.software.youssf.chatapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Splash Screen Animation
        setContentView(R.layout.activity_splashscreen);
        YoYo.with(Techniques.Pulse)
                .duration(700)
                .repeat(10)
                .playOn(findViewById(R.id.splashicon));
        YoYo.with(Techniques.Flash)
               .duration(500)
               .repeat(10)
               .playOn(findViewById(R.id.lodingtext));
        // End of Text


        // Handle Timer to switch to Main Activity
        Thread loading = new Thread() {

            @Override
            public void run() {
                try {

                    sleep(3000); /* number of milliseconds which the app
                                  will wait to execute the instructions below */

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // create Intent
                Intent main = new Intent(getApplicationContext(),MainActivity.class);

                // start Intent
                startActivity(main);

                // destroy the activity so the user can not come back to it
                finish();

            }
        };

        // start Thread
        loading.start();

    }
}
