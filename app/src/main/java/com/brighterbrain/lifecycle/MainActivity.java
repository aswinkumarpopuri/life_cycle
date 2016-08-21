package com.brighterbrain.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText lblmsg;


    public static final String MY_LOG = "FT_Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblmsg = (EditText) findViewById(R.id.lblmsg);
        Log.d(MY_LOG, "onCreate");
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent();
        i.putExtra("mK", lblmsg.getText().toString());
        setResult(RESULT_OK, i);

        super.onBackPressed();

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(MY_LOG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(MY_LOG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(MY_LOG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(MY_LOG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(MY_LOG, "onDestroy");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 747) {
            if (resultCode == RESULT_OK) {
                lblmsg.setText(data.getStringExtra("mK"));
            }
        }
    }
}







