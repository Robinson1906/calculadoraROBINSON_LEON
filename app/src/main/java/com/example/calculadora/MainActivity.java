package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView n1,n2,resultado;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,borrar,bpor,bmas,bmenos,bdiv;
    int escribiendo=0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);
        resultado=findViewById(R.id.resultado);
        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        borrar=findViewById(R.id.borrar);
        bpor=findViewById(R.id.bpor);
        bmas=findViewById(R.id.bmas);
        bdiv=findViewById(R.id.bdiv);
        bmenos=findViewById(R.id.bmenos);

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1.setHint("");
                escribiendo=0;
            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n2.setHint("");
                escribiendo=1;
            }
        });
        //para cada uno de los numeros
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (escribiendo == 0) {
                    n1.setText(n1.getText() + "1");
                } else {
                    n2.setText(n2.getText() + "1");
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (escribiendo == 0) {
                    n1.setText(n1.getText() + "2");
                } else {
                    n2.setText(n2.getText() + "2");
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                if (escribiendo == 0) {
                    n1.setText(n1.getText() + "3");
                } else {
                    n2.setText(n2.getText() + "3");
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (escribiendo == 0) {
                    n1.setText(n1.getText() + "4");
                } else {
                    n2.setText(n2.getText() + "4");
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (escribiendo == 0) {
                    n1.setText(n1.getText() + "5");
                } else {
                    n2.setText(n2.getText() + "5");
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (escribiendo == 0) {
                    n1.setText(n1.getText() + "6");
                } else {
                    n2.setText(n2.getText() + "6");
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (escribiendo == 0) {
                    n1.setText(n1.getText() + "7");
                } else {
                    n2.setText(n2.getText() + "7");
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (escribiendo == 0) {
                    n1.setText(n1.getText() + "8");
                } else {
                    n2.setText(n2.getText() + "8");
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (escribiendo == 0) {
                    n1.setText(n1.getText() + "9");
                } else {
                    n2.setText(n2.getText() + "9");
                }
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (escribiendo == 0) {
                    n1.setText(n1.getText() + "0");
                } else {
                    n2.setText(n2.getText() + "0");
                }
            }
        });


        //para las operaciones
        bmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero1, numero2;
                if (n1.getText()==""){
                    numero1=0;
                }else{
                    numero1=Integer.parseInt(n1.getText().toString());
                }
                if (n2.getText()==""){
                    numero2=0;
                }else{
                    numero2=Integer.parseInt(n2.getText().toString());
                }

                resultado.setText(String.valueOf(numero1+numero2));
            }
        });
        bmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero1, numero2;
                if (n1.getText()==""){
                    numero1=0;
                }else{
                    numero1=Integer.parseInt(n1.getText().toString());
                }
                if (n2.getText()==""){
                    numero2=0;
                }else{
                    numero2=Integer.parseInt(n2.getText().toString());
                }

                resultado.setText(String.valueOf(numero1-numero2));
            }
        });
        bpor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero1, numero2;
                if (n1.getText()==""){
                    numero1=0;
                }else{
                    numero1=Integer.parseInt(n1.getText().toString());
                }
                if (n2.getText()==""){
                    numero2=0;
                }else{
                    numero2=Integer.parseInt(n2.getText().toString());
                }

                resultado.setText(String.valueOf(numero1*numero2));
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero1, numero2;
                if (n1.getText()==""){
                    numero1=0;
                }else{
                    numero1=Integer.parseInt(n1.getText().toString());
                }
                if (n2.getText()==""){
                    numero2=0;
                }else{
                    numero2=Integer.parseInt(n2.getText().toString());
                }

                if (numero2==0) {
                    resultado.setText("Division0");
                }else{
                resultado.setText(String.valueOf(numero1/numero2));}
            }
        });

        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText("0");
                n1.setText("");
                n1.setHint("Inserte numero");
                n2.setText("");
                n2.setHint("Inserte numero");
            }
        });






    }



}