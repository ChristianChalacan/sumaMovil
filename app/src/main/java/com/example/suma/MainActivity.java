package com.example.suma;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText fnumber, snumber;
    private TextView resultado, mens;
    private Button calcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fnumber=(EditText) findViewById(R.id.firstnumberinput);
        snumber=(EditText) findViewById(R.id.secondnumberinput);
        resultado=(TextView) findViewById(R.id.resulttxt);
        mens = (TextView) findViewById(R.id.messagetxt);
        calcular = (Button) findViewById(R.id.calcularbtn);
        calcular.setOnClickListener((View.OnClickListener) this);


    }
    public void onClick(View view){
        double valor1=Double.parseDouble(fnumber.getText().toString());
        double valor2=Double.parseDouble(snumber.getText().toString());
        double res=valor1+valor2;
        String result = String.valueOf(res);
        resultado.setText(result);

    }

}