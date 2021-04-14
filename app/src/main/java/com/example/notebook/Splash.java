
package com.example.notebook;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler()
                .postDelayed(new Runnable() {
                    @Override
                    public void run() {
                     startHomeActivity();
                    }
                },2000);
    }

    public void startHomeActivity(){
        Intent intent= new Intent(this,HomeActivity.class);
        startActivity(intent);
        finish();
    }
}
