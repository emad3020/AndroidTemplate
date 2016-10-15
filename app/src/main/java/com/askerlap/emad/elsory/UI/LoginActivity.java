package com.askerlap.emad.elsory.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.askerlap.emad.elsory.Activites.MainActivity;
import com.askerlap.emad.elsory.R;

public class LoginActivity extends AppCompatActivity {
    Button login,register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        assert getSupportActionBar() !=null;
        getSupportActionBar().hide();
        login=(Button)findViewById(R.id.btn_account_login);
        register=(Button)findViewById(R.id.login_btn_signup);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,Registeration.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
