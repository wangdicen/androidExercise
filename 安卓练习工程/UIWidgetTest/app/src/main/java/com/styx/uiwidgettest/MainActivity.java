package com.styx.uiwidgettest;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        imageView = (ImageView) findViewById(R.id.image_view);
        editText = (EditText) findViewById(R.id.edit_text);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);


        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setTitle("This is Dialog");
        dialog.setMessage("Something important");
        dialog.setCancelable(false);
        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int which)
            {

            }
        });
        dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int which)
            {

            }
        });

        dialog.show();
    }

    private  boolean IS_ICON_ONE = true;

    public void onClick(View v){
        switch (v.getId()){
            case R.id.button:
                String inputText = editText.getText().toString();
                Toast.makeText(MainActivity.this, inputText,Toast.LENGTH_SHORT).show();

                if (IS_ICON_ONE) {
                    imageView.setImageResource(R.drawable.icon2);
                    IS_ICON_ONE = false;
                }
                else
                {
                    imageView.setImageResource(R.drawable.icon);
                    IS_ICON_ONE = true;
                }

               int progress = progressBar.getProgress();
                progress = progress + 10;
                progressBar.setProgress(progress);


                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("this is progressdialog");
                progressDialog.setMessage("loading...");
                progressDialog.setCancelable(true);
                progressDialog.show();

                break;
            default:
                break;
        }
    }
}
