package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddCourse extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4;
AppCompatButton b1,b2;
String getcoursename,getdescription,getduration,getremarks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_course);

        ed1=(EditText) findViewById(R.id.cname);
        ed2=(EditText) findViewById(R.id.des);
        ed3=(EditText) findViewById(R.id.duration);
        ed4=(EditText) findViewById(R.id.remarks);

        b1=(AppCompatButton) findViewById(R.id.sub);
        b2=(AppCompatButton) findViewById(R.id.btdash);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getcoursename=ed1.getText().toString();
                getdescription=ed2.getText().toString();
                getduration=ed3.getText().toString();
                getremarks=ed4.getText().toString();


                Toast.makeText(getApplicationContext(),getcoursename, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getdescription, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getduration, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getremarks, Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
                startActivity(i);
            }
        });

            }


    }
