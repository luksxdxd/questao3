package com.example.imparoupar;

import androidx.appcompat.app.AppCompatActivity;

import android.text.TextPaint;
import android.view.View;
import android.widget.*;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtPI, txtDouble, txtRaiz;
    EditText edtNumber;
    Button btnCalculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPI = findViewById(R.id.txtPI);
        txtDouble = findViewById(R.id.txtDouble);
        txtRaiz = findViewById(R.id.txtRaiz);
        edtNumber = findViewById(R.id.edtNumber);
        btnCalculo = findViewById(R.id.btnCalculo);

        btnCalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double num1 = Double.parseDouble(edtNumber.getText().toString());
                Double total = num1;

                if ((total %2) == 0 )
                    txtPI.setText(num1 + " é Par.");
                else
                    txtPI.setText(num1 + " é Impar.");

                total = num1*2;
                txtDouble.setText("Seu dobro é: "+ total);

                total = Math.sqrt(num1);
                txtRaiz.setText("Sua raiz é: " + total);

            }
        });

    }
}