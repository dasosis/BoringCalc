package com.example.boringcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, buttonDec, buttonEqual, buttonC;
    EditText value_text;

    float val1, val2;
    boolean add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.button12);
        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonDec = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.button13);
        buttonSub = (Button) findViewById(R.id.button14);
        buttonMul = (Button) findViewById(R.id.button15);
        buttonDivision = (Button) findViewById(R.id.button16);
        buttonC = (Button) findViewById(R.id.button18);
        buttonEqual = (Button) findViewById(R.id.button11);
        value_text = (EditText) findViewById(R.id.textbox);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_text.setText(value_text.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_text.setText(value_text.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_text.setText(value_text.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_text.setText(value_text.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_text.setText(value_text.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_text.setText(value_text.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_text.setText(value_text.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_text.setText(value_text.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_text.setText(value_text.getText() + "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_text.setText(value_text.getText() + "0");
            }
        });
        buttonDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_text.setText(value_text.getText() + ".");
            }
        });
    }
}