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
    boolean add, sub, mul, div, dec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = findViewById(R.id.button12);
        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonDec = findViewById(R.id.button10);
        buttonAdd = findViewById(R.id.button13);
        buttonSub = findViewById(R.id.button14);
        buttonMul = findViewById(R.id.button15);
        buttonDivision = findViewById(R.id.button16);
        buttonC = findViewById(R.id.button18);
        buttonEqual = findViewById(R.id.button11);
        value_text = findViewById(R.id.text_box);
        final boolean[] hasDecimal = {false};


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
                if (hasDecimal[0])
                        return;
                hasDecimal[0] = true;
                value_text.setText(value_text.getText() + ".");
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                value_text.setText("");
                hasDecimal[0] = false;}
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (value_text == null) {
                    value_text.setText("");
                } else {
                    val1 = Float.parseFloat(value_text.getText() + "");
                     add = true;
                    value_text.setText(null);
                    hasDecimal[0] = false;
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(value_text.getText() + "");
                sub = true;
                value_text.setText(null);
                hasDecimal[0] = false;
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(value_text.getText() + "");
                mul = true;
                value_text.setText(null);
                hasDecimal[0] = false;
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(value_text.getText() + "");
                div = true;
                value_text.setText(null);
                hasDecimal[0] = false;
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val2 = Float.parseFloat(value_text.getText() + "");

                if ( add == true) {
                    value_text.setText(val1 + val2 + "");
                     add = false;
                }

                if (sub == true) {
                    value_text.setText(val1 - val2 + "");
                    sub = false;
                }

                if (mul == true) {
                    value_text.setText(val1 * val2 + "");
                    mul = false;
                }

                if (div == true) {
                    value_text.setText(val1 / val2 + "");
                    div = false;
                }
            }
        });
    }
}

