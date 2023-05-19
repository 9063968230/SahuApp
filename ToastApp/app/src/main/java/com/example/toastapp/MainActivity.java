package com.example.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button toast;
    private Button toast1;
    private EditText et_name;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast= findViewById(R.id.toast_btn);
        toast1= findViewById(R.id.intent_btn);
        et_name=(EditText)findViewById(R.id.et_name);
        textView=(TextView) findViewById(R.id.textView);




        toast1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainActivity2= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(MainActivity2);
            }

        });

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast= Toast.makeText(getApplicationContext(),"Click on the button nowwwwwwww",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}