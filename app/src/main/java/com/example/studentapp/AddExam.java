package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddExam extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4;
AppCompatButton b1,b2;
String getsemester,getexamname,getexamdate,getremarks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_exam);
        ed1=(EditText)findViewById(R.id.sem);
        ed2=(EditText)findViewById(R.id.ename);
        ed3=(EditText)findViewById(R.id.edate);
        ed4=(EditText)findViewById(R.id.remark);
        b1=(AppCompatButton)findViewById(R.id.sub);
        b2=(AppCompatButton)findViewById(R.id.btdash);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getsemester=ed1.getText().toString();
                getexamname=ed2.getText().toString();
                getexamdate=ed3.getText().toString();
                getremarks=ed4.getText().toString();
                Toast.makeText(getApplicationContext(),getsemester, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getexamname, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getexamdate, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getremarks, Toast.LENGTH_SHORT).show();
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