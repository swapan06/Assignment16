package com.acadview.registrationform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText Name,MobileNumber,Password;
    Button Submitt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Name = findViewById(R.id.editText);
        MobileNumber=findViewById(R.id.editText4);
        Password=findViewById(R.id.editText5);
        Submitt=findViewById(R.id.button4);

    }
}
