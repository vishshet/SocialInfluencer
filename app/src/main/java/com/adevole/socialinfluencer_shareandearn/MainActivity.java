package com.adevole.socialinfluencer_shareandearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static boolean isTrue(String bool){
        if(bool == null) return false;
        return bool.contains("true");
    }
}
