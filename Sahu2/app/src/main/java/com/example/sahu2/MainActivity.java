package com.example.sahu2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button button;
private EditText edittext;
private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button);
        edittext=(EditText) findViewById(R.id.edittext);
        textView=(TextView) findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name= edittext.getText().toString();
                if (name.length()>0){
                    textView.setText("Hello "  +name+ " Welcome to Gvp");
                }else{
                    Toast toast= Toast.makeText(getApplicationContext(),"name should not be null", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

    }
}