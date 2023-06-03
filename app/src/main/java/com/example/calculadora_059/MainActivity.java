package com.example.calculadora_059;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// conecto xml con Java por medio de findViewid
        TextView editText1= findViewById(R.id.edit1);
        TextView editText2= findViewById(R.id.edit2);
        TextView rst= findViewById(R.id.Rst);

        Button button1 = findViewById(R.id.btn1);
        Button button2 = findViewById(R.id.btn2);
        Button button3 = findViewById(R.id.btn3);
        Button button4 = findViewById(R.id.btn4);

        // proceso

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String num1 = editText1.getText().toString();

                if(editText1.getText().toString().isEmpty()){
                    Toast mytoast= Toast.makeText(getApplicationContext(),"INGRESE LOS VALORES",Toast.LENGTH_LONG);
                      mytoast.setGravity(Gravity.CENTER_HORIZONTAL,0,80);
                   mytoast.show();
                }
                String num2 = editText2.getText().toString();

                if(editText1.getText().toString().isEmpty()){
                    Toast mytoast= Toast.makeText(getApplicationContext(),"INGRESE LOS VALORES",Toast.LENGTH_LONG);
                    mytoast.setGravity(Gravity.CENTER_HORIZONTAL,0,80);
                    mytoast.show();
                }

                int resul = Integer.parseInt(num1)+Integer.parseInt(num2);
                 rst.setText("El resultado es "+resul);
                 editText1.setText("");
                 editText2.setText("");
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String num1 = editText1.getText().toString();

                if(editText1.getText().toString().isEmpty()){
                    Toast mytoast= Toast.makeText(getApplicationContext(),"INGRESE LOS VALORES",Toast.LENGTH_LONG);
                    mytoast.setGravity(Gravity.CENTER_HORIZONTAL,0,80);
                    mytoast.show();
                }
                String num2 = editText2.getText().toString();

                if(editText1.getText().toString().isEmpty()){
                    Toast mytoast= Toast.makeText(getApplicationContext(),"INGRESE LOS VALORES",Toast.LENGTH_LONG);
                    mytoast.setGravity(Gravity.CENTER_HORIZONTAL,0,80);
                    mytoast.show();
                }

                int resul = Integer.parseInt(num1)-Integer.parseInt(num2);
                rst.setText("El resultado es "+resul);
                editText1.setText("");
                editText2.setText("");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String num1 = editText1.getText().toString();

                if(editText1.getText().toString().isEmpty()){
                    Toast mytoast= Toast.makeText(getApplicationContext(),"INGRESE LOS VALORES",Toast.LENGTH_LONG);
                    mytoast.setGravity(Gravity.CENTER_HORIZONTAL,0,80);
                    mytoast.show();
                }
                String num2 = editText2.getText().toString();

                if(editText1.getText().toString().isEmpty()){
                    Toast mytoast= Toast.makeText(getApplicationContext(),"INGRESE LOS VALORES",Toast.LENGTH_LONG);
                    mytoast.setGravity(Gravity.CENTER_HORIZONTAL,0,80);
                    mytoast.show();
                }

                int resul = Integer.parseInt(num1)/Integer.parseInt(num2);
                rst.setText("El resultado es "+resul);
                editText1.setText("");
                editText2.setText("");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String num1 = editText1.getText().toString();

                if(editText1.getText().toString().isEmpty()){
                    Toast mytoast= Toast.makeText(getApplicationContext(),"INGRESE LOS VALORES",Toast.LENGTH_LONG);
                    mytoast.setGravity(Gravity.CENTER_HORIZONTAL,0,80);
                    mytoast.show();
                }
                String num2 = editText2.getText().toString();

                if(editText1.getText().toString().isEmpty()){
                    Toast mytoast= Toast.makeText(getApplicationContext(),"INGRESE LOS VALORES",Toast.LENGTH_LONG);
                    mytoast.setGravity(Gravity.CENTER_HORIZONTAL,0,80);
                    mytoast.show();
                }

                int resul = Integer.parseInt(num1)*Integer.parseInt(num2);
                rst.setText("El resultado es "+resul);
                editText1.setText("");
                editText2.setText("");
            }
        });


    }
}