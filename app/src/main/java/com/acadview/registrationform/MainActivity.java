package com.acadview.registrationform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    EditText Name,MobileNumber,Password;
    Button Submitt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name=findViewById(R.id.editText11);
        MobileNumber=findViewById(R.id.editText9);
        Password=findViewById(R.id.editText10);
        Submitt = findViewById(R.id.button3);
       Submitt.setOnClickListener(new View.OnClickListener() {
           @Override

           public void onClick(View v) {
               Intent intent=new Intent(MainActivity.this,Main2Activity.class);
               Toast.makeText(MainActivity.this,"Submitted" , Toast.LENGTH_SHORT).show();
               startActivity(intent);


           }
       });


        }

    }



