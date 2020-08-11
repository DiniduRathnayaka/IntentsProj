package com.example.intentsproj1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {


    Button btn;
    EditText num1,num2;
    String message="You just clicked the OK button";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        ActionBar actionBar =getSupportActionBar();
        actionBar.setTitle("My Application");

        btn=(Button) findViewById(R.id.btnok);
        num1=(EditText) findViewById(R.id.no1);
        num2=(EditText) findViewById(R.id.no2);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecondActivity();
                Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();

                String no1 =num1.getText().toString();
                String no2 =num2.getText().toString();

                Intent intent =new Intent(getApplicationContext(),SecondActivity.class);
                intent.putExtra("number1",no1);
                intent.putExtra("number2",no2);
                startActivity(intent);
            }
        });

    }
    public void openSecondActivity(){
        Intent intent =new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}