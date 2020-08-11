package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button plus , minus , multi , divide ;
    TextView text;
    EditText number1 , number2 ;
    double num1 , num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        num1 = intent.getDoubleExtra("number1" , 0);
        num2 = intent.getDoubleExtra("number2" , 0);

        plus = findViewById(R.id.btnPlus);
        minus = findViewById(R.id.btnMinus);
        multi = findViewById(R.id.btnMulti);
        divide = findViewById(R.id.btnDivision);

        number1 = findViewById(R.id.editTextNumber1);
        number2 = findViewById(R.id.editTextNumber2);

        text = findViewById(R.id.text);

        number1.setText(num1 + "");
        number2.setText(num2 + "");

    }

    @Override
    protected void onResume() {
        super.onResume();

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.setText(num1 + " + " + num2 +" = " + (num1 + num2) + "");

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.setText(num1 + " - " + num2 +" = " + (num1 - num2) + "");

            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.setText(num1 + " * " + num2 +" = " + (num1 * num2) + "");

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.setText(num1 + " / " + num2 +" = " + (num1 / num2) + "");

            }
        });
    }
}