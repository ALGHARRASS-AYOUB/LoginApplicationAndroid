package com.example.mylogginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username=findViewById(R.id.username);
        TextView password=findViewById(R.id.password);
        MaterialButton login_button=findViewById(R.id.login_button);
        TextView forget_password=findViewById(R.id.forget_password);
        ImageView gmail_icon=findViewById(R.id.gmail_icon);
        ImageView facebook_icon=findViewById(R.id.facebook_icon);
        ImageView twitter_icon=findViewById(R.id.twitter_icon);

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESFULL", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "LOGIN FAILD !! try an other time", Toast.LENGTH_SHORT).show();
                    username.setText("");
                    password.setText("");
                }
            }
        });

    }
}