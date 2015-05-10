package com.example.chents.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class MainActivity extends ActionBarActivity {

    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        StringBuffer sb = new StringBuffer();
//        sb.append("a");


    }

    private void setThread() {
        new Thread() {
            public void run() {

            }
        }.start();
    }
}