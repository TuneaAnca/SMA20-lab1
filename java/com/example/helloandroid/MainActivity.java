package com.example.helloandroid;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;


import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    EditText eName;
    Button bClick;
    TextView tName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            eName = (EditText) findViewById(R.id.editText);
            bClick = (Button) findViewById(R.id.button2);
            tName = (TextView) findViewById(R.id.textView2);


        } catch (NullPointerException e) {
            throw new IllegalStateException("This is not possible", e);
        }

        bClick.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                tName.setText("Hello " + eName.getText());

            }

        });




    }
}