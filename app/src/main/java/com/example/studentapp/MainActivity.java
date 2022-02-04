package com.example.studentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
EditText ed1,ed2;
AppCompatButton B1,B2;
String getUsername,getpassword;
SharedPreferences mypreferences;
String prefvalue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mypreferences=getSharedPreferences("login",MODE_PRIVATE);
        prefvalue=mypreferences.getString("login","");
        if (prefvalue==null||!prefvalue.isEmpty()){
            Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
            startActivity(i);

        }


        ed1=(EditText)findViewById(R.id.uname);
        ed2=(EditText)findViewById(R.id.pass);
        B1=(AppCompatButton) findViewById(R.id.loginbtn);
        B2=(AppCompatButton) findViewById(R.id.registerbtn);
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent i=new Intent(getApplicationContext(),RegisterActivity.class);
              startActivity(i);
            }
        });
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getUsername=ed1.getText().toString();
                getpassword=ed2.getText().toString();


                if (getUsername.equals("admin")&&(getpassword.equals("1234"))){
                    SharedPreferences.Editor myedit=mypreferences.edit();
                    myedit.putString("username","admin");
                    myedit.commit();
                     Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
                     startActivity(i);


                    }else{
                    Toast.makeText(getApplicationContext(),"invalid ", Toast.LENGTH_SHORT).show();

                }


            }
        });
    }
}