package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {
Button b1,b2,b3,b4,b5;
SharedPreferences mypreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        mypreferences=getSharedPreferences("login",MODE_PRIVATE);
        b1=(AppCompatButton) findViewById(R.id.adcourse);
        b2=(AppCompatButton) findViewById(R.id.adfac);
        b3=(AppCompatButton) findViewById(R.id.adex);
        b4=(AppCompatButton) findViewById(R.id.vweb);
        b5=(AppCompatButton) findViewById(R.id.logout);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor myedit=mypreferences.edit();
                myedit.clear();
                myedit.commit();

                Toast.makeText(getApplicationContext(), "logged out Successfully ", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);

            }
        });
b4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i=new Intent(getApplicationContext(),WebsiteActivity.class);
        startActivity(i);
    }
});
                b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),AddExam.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),AddFaculty.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),AddCourse.class);
                startActivity(i);
            }
        });
    }
}