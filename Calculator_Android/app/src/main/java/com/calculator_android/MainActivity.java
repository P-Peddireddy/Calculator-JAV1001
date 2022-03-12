package com.calculator_android;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    double val1 = 0, val2 = 0;
    TextView tv_Result;
    boolean Add, Sub, Multiply, Divide, Remainder, deci;
    Button button_0, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9, button_Add, button_Sub,
            button_Mul, button_Div, button_Equ, button_Del, button_Decimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_0 = (Button) findViewById(R.id.btn0);
        button_1 = (Button) findViewById(R.id.btn1);
        button_2 = (Button) findViewById(R.id.btn2);
        button_3 = (Button) findViewById(R.id.btn3);
        button_4 = (Button) findViewById(R.id.btn4);
        button_5 = (Button) findViewById(R.id.btn5);
        button_6 = (Button) findViewById(R.id.btn6);
        button_7 = (Button) findViewById(R.id.btn7);
        button_8 = (Button) findViewById(R.id.btn8);
        button_9 = (Button) findViewById(R.id.btn9);
        button_Decimal = (Button) findViewById(R.id.btn_decimal);
        button_Add = (Button) findViewById(R.id.btn_add);
        button_Sub = (Button) findViewById(R.id.btn_sub);
        button_Mul = (Button) findViewById(R.id.btn_mul);
        button_Div = (Button) findViewById(R.id.btn_div);
        button_Del = (Button) findViewById(R.id.buttonDel);
        button_Equ = (Button) findViewById(R.id.buttoneql);

        tv_Result = (TextView) findViewById(R.id.display);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_Result.setText(tv_Result.getText() + "1");
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_Result.setText(tv_Result.getText() + "2");
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_Result.setText(tv_Result.getText() + "3");
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_Result.setText(tv_Result.getText() + "4");
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_Result.setText(tv_Result.getText() + "5");
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_Result.setText(tv_Result.getText() + "6");
            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_Result.setText(tv_Result.getText() + "7");
            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_Result.setText(tv_Result.getText() + "8");
            }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_Result.setText(tv_Result.getText() + "9");
            }
        });

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_Result.setText(tv_Result.getText() + "0");
            }
        });

        button_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_Result.getText().length() != 0) {
                    val1 = Float.parseFloat(tv_Result.getText() + "");
                    Add = true;
                    deci = false;
                    tv_Result.setText(null);
                }
            }
        });

        button_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_Result.getText().length() != 0) {
                    val1 = Float.parseFloat(tv_Result.getText() + "");
                    Sub = true;
                    deci = false;
                    tv_Result.setText(null);
                }
            }
        });

        button_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_Result.getText().length() != 0) {
                    val1 = Float.parseFloat(tv_Result.getText() + "");
                    Multiply = true;
                    deci = false;
                    tv_Result.setText(null);
                }
            }
        });

        button_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_Result.getText().length() != 0) {
                    val1 = Float.parseFloat(tv_Result.getText() + "");
                    Divide = true;
                    deci = false;
                    tv_Result.setText(null);
                }
            }
        });

        button_Equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Add || Sub || Multiply || Divide || Remainder) {
                    val2 = Float.parseFloat(tv_Result.getText() + "");
                }

                if (Add) {

                    tv_Result.setText(val1 + val2 + "");
                    Add = false;
                }

                if (Sub) {

                    tv_Result.setText(val1 - val2 + "");
                    Sub = false;
                }

                if (Multiply) {
                    tv_Result.setText(val1 * val2 + "");
                    Multiply = false;
                }

                if (Divide) {
                    tv_Result.setText(val1 / val2 + "");
                    Divide = false;
                }
                if (Remainder) {
                    tv_Result.setText(val1 % val2 + "");
                    Remainder = false;
                }
            }
        });

        button_Del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_Result.setText("");
                val1 = 0.0;
                val2 = 0.0;
            }
        });

        button_Decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (deci) {
                } else {
                    tv_Result.setText(tv_Result.getText() + ".");
                    deci = true;
                }

            }
        });
    }
}
