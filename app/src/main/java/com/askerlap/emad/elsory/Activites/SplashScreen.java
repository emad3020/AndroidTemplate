package com.askerlap.emad.elsory.Activites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.askerlap.emad.elsory.R;
import com.askerlap.emad.elsory.UI.LoginActivity;

public class SplashScreen extends AppCompatActivity {
    private final int SPLASH_OUT_TIME=300;
    private final int totalProgress=100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        assert getSupportActionBar() !=null;
        getSupportActionBar().hide();
        Thread tt=new Thread(){
            public void run() {
                int jumpTime = 0;
                while (jumpTime < totalProgress) {
                    try {
                        sleep(SPLASH_OUT_TIME);
                        jumpTime += 5;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                startActivity(new Intent(SplashScreen.this, LoginActivity.class));

            }
        };
        tt.start();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
