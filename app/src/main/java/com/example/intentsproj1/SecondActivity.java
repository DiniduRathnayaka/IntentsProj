package com.example.intentsproj1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {


    private Button add;
    private  Button sub;
    private Button mul;
    private Button div;
   private  TextView number1,number2,ansNo1,ansNo2,answer,sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        number1 =(TextView)findViewById(R.id.revNo1);
        number2 =(TextView)findViewById(R.id.revNo2);
        ansNo1=(TextView)findViewById(R.id.AnsNo1);
        ansNo2=(TextView)findViewById(R.id.AnsNo2);
        answer=(TextView)findViewById(R.id.Answer);
        sign=(TextView)findViewById(R.id.signBtn);

        add=(Button)findViewById(R.id.btnadd);
        sub=(Button)findViewById(R.id.btnsub);
        mul=(Button)findViewById(R.id.btnmul);
        div=(Button)findViewById(R.id.btndivide);

        Intent intent=getIntent();
        String Number1=intent.getStringExtra("number1");
        String Number2=intent.getStringExtra("number2");

        number1.setText(Number1);
        ansNo1.setText(Number1);
        number2.setText(Number2);
        ansNo2.setText(Number2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addValues();
                String message="Addition to numbers";
                Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subValues();
                String message=" Subtraction to numbers";
                Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mulValues();
                String message="  Multiplication to numbers";
                Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                divValues();
                String message=" Division to numbers";
                Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();

            }
        });

    }
    public void addValues(){
        int value1 =Integer.parseInt(number1.getText().toString());
        int value2 =Integer.parseInt(number2.getText().toString());
        int answerValues= value1+value2;
        answer.setText(String.valueOf(answerValues));
        sign.setText("+");
    }
    public void subValues(){
        int value1 =Integer.parseInt(number1.getText().toString());
        int value2 =Integer.parseInt(number2.getText().toString());
        int answerValues= value1-value2;
        answer.setText(String.valueOf(answerValues));
        sign.setText("-");

    }
    public void mulValues() {
        int value1 = Integer.parseInt(number1.getText().toString());
        int value2 = Integer.parseInt(number2.getText().toString());
        int answerValues = value1 * value2;
        answer.setText(String.valueOf(answerValues));
        sign.setText("*");
    }
    public void divValues() {
        int value1 = Integer.parseInt(number1.getText().toString());
        int value2 = Integer.parseInt(number2.getText().toString());
        float answerValues = (int)value1 /(float) value2;
        answer.setText(String.valueOf(answerValues));
        sign.setText("/");
    }
}
