package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddFaculty extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4;
AppCompatButton b1,b2;
String getfacultyname,getdep,getdesig,getmbno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_faculty);
        ed1=(EditText)findViewById(R.id.facultyname);
        ed2=(EditText)findViewById(R.id.dep);
        ed3=(EditText)findViewById(R.id.desig);
        ed4=(EditText)findViewById(R.id.mbno);
        b1=(AppCompatButton)findViewById(R.id.submit);
       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               getfacultyname=ed1.getText().toString();
               getdep=ed2.getText().toString();
               getdesig=ed3.getText().toString();
               getmbno=ed4.getText().toString();
               Toast.makeText(getApplicationContext(),getfacultyname, Toast.LENGTH_SHORT).show();
               Toast.makeText(getApplicationContext(),getdep, Toast.LENGTH_SHORT).show();
               Toast.makeText(getApplicationContext(),getdesig, Toast.LENGTH_SHORT).show();
               Toast.makeText(getApplicationContext(),getmbno, Toast.LENGTH_SHORT).show();
           }
       });
        b2=(AppCompatButton)findViewById(R.id.btdash);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
                startActivity(i);
            }
        });
    }
}