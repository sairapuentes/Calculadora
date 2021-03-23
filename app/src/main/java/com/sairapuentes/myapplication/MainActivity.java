package com.sairapuentes.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Tablero,almacenar;
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,
            buttonPunto,buttonLimpia,buttonIgual,buttonSuma,buttonResta,buttonMultiplicacion,buttonDivision;
    double numero1,numero2,resultado;
    String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonPunto = (Button) findViewById(R.id.buttonPunto);
        buttonLimpia = (Button) findViewById(R.id.buttonLimpia);
        buttonIgual = (Button) findViewById(R.id.buttonIgual);
        buttonSuma = (Button) findViewById(R.id.buttonSuma);
        buttonResta = (Button) findViewById(R.id.buttonResta);
        buttonMultiplicacion = (Button) findViewById(R.id.buttonMultiplicacion);
        buttonDivision = (Button) findViewById(R.id.buttonDivision);
        EditText Tablero = (EditText) findViewById(R.id.Tablero);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                almacenar = (EditText) findViewById(R.id.Tablero);
                Tablero.setText((almacenar.getText().toString() + "0"));
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                almacenar = (EditText) findViewById(R.id.Tablero);
                Tablero.setText((almacenar.getText().toString() + "1"));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                almacenar = (EditText) findViewById(R.id.Tablero);
                Tablero.setText((almacenar.getText().toString() + "2"));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                almacenar = (EditText) findViewById(R.id.Tablero);
                Tablero.setText((almacenar.getText().toString() + "3"));
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                almacenar = (EditText) findViewById(R.id.Tablero);
                Tablero.setText((almacenar.getText().toString() + "4"));
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                almacenar = (EditText) findViewById(R.id.Tablero);
                Tablero.setText((almacenar.getText().toString() + "5"));
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                almacenar = (EditText) findViewById(R.id.Tablero);
                Tablero.setText((almacenar.getText().toString() + "6"));
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                almacenar = (EditText) findViewById(R.id.Tablero);
                Tablero.setText((almacenar.getText().toString() + "7"));
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                almacenar = (EditText) findViewById(R.id.Tablero);
                Tablero.setText((almacenar.getText().toString() + "8"));
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                almacenar = (EditText) findViewById(R.id.Tablero);
                Tablero.setText((almacenar.getText().toString() + "9"));
            }
        });
        buttonPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                almacenar = (EditText) findViewById(R.id.Tablero);
                Tablero.setText((almacenar.getText().toString() + "."));
            }
        });
        buttonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "+";
                almacenar = (EditText) findViewById(R.id.Tablero);
                numero1 = Double.parseDouble((almacenar.getText().toString()));
                Tablero.setText("");
            }
        });
        buttonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "-";
                almacenar = (EditText) findViewById(R.id.Tablero);
                numero1 = Double.parseDouble((almacenar.getText().toString()));
                Tablero.setText("");
            }
        });
        buttonMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "*";
                almacenar = (EditText) findViewById(R.id.Tablero);
                numero1 = Double.parseDouble((almacenar.getText().toString()));
                Tablero.setText("");
            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "/";
                almacenar = (EditText) findViewById(R.id.Tablero);
                numero1 = Double.parseDouble((almacenar.getText().toString()));
                Tablero.setText("");
            }
        });
        buttonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                almacenar = (EditText) findViewById(R.id.Tablero);
                numero2 =Double.parseDouble((almacenar.getText().toString()));

                if (operador.equals("+")){
                    Tablero.setText("");
                    resultado= numero1 + numero2;
                }
                if (operador.equals("-")){
                    Tablero.setText("");
                    resultado= numero1 - numero2;
                }
                if (operador.equals("*")){
                    Tablero.setText("");
                    resultado= numero1 * numero2;
                }
                if (operador.equals("/")){
                    Tablero.setText("");
                    if (numero2!=0) {
                        resultado = numero1 / numero2;
                    }
                }

                Tablero.setText(String.valueOf(resultado));
            }
        });
        buttonLimpia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = 0;
                numero2 = 0;
                Tablero.setText("");
            }
        });



    }

}