package com.styx.uiwidgettest;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;


/**
 * Created by xiehaojie on 2017/7/22.
 */

public class TitleLayout extends LinearLayout {

    public TitleLayout(Context context, AttributeSet attrs)
    {
        super(context,attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);

        Button titleBack = (Button) findViewById(R.id.titl_back);
        titleBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
//                ((Activity) getContext()).finish();

                Toast.makeText(getContext(),"you clicked",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
