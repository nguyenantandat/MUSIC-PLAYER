package com.example.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {
private ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getSupportActionBar().hide();
        setContentView(R.layout.activity_splash);
        iv = (ImageView) findViewById(R.id.iv);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.myanimation);
        iv.startAnimation(myanim);
        final Intent i = new Intent(this,LoginActivity.class);
        Thread timer = new Thread(){
            public  void run (){
                try {
                    sleep(5000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                        startActivity(i);
                        finish();
                    }
            }
        };
        timer.start();
    }
}