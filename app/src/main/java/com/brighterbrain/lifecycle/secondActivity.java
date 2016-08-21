package com.brighterbrain.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
    TextView lblmsg;

    public static final String MY_LOG ="FT_Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView lglmsg = (TextView) findViewById(R.id.lblmsg);
        int onCreate = Log.d(MY_LOG, "onCreate");
        Intent i = getIntent();
        lblmsg.setText(i.getStringExtra("mTP"));

    }

    public void onGOTO2(View view) {
        Intent i = new Intent(this, secondActivity.class);
        startActivity(i);
    }

        @Override
        protected void onStart(){
            super.onStart();
            Log.d(MY_LOG, "onStart");
        }

        @Override
        protected void onResume(){
            super.onResume();
            Log.d(MY_LOG, "onResume");
        }

        @Override
        protected void onPause(){
            super.onPause();
            Log.d(MY_LOG, "onPause");
        }

        @Override
        protected void onStop(){
            super.onStop();
            Log.d(MY_LOG, "onStop");
        }

        @Override
        protected void onDestroy(){
            super.onDestroy();
            Log.d(MY_LOG, "onDestroy");
        }


    }

