package com.styx.activitylifecycletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LauncherActivity extends AppCompatActivity {

    public  static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"oncreate");
        setContentView(R.layout.activity_launcher);


        Button startNormalActivity = (Button) findViewById(R.id.start_normal_activity);
        Button startDialogActivity = (Button) findViewById(R.id.start_dialog_activity);

        startNormalActivity.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View v) {
                Intent intent = new Intent(LauncherActivity.this, NormalActivity.class);
                startActivity(intent);
            }
        });

        startDialogActivity.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View v)
            {
                Intent intent = new Intent(LauncherActivity.this, DialogActivity.class);
                startActivity(intent);
            }
        });
    }

    protected void onStart()
    {
        super.onStart();
        Log.d(TAG,"onstart");
    }

    protected void onResume()
    {
        super.onResume();
        Log.d(TAG,"onresume");
    }

    protected void onPause()
    {
        super.onPause();
        Log.d(TAG,"onpause");
    }

    protected void onStop()
    {
        super.onStop();
        Log.d(TAG,"onstop");
    }

    protected void onDestory()
    {
        super.onDestroy();
        Log.d(TAG,"ondestory");
    }

    protected void onRestart()
    {
        super.onRestart();
        Log.d(TAG,"onRestart");
    }
}
