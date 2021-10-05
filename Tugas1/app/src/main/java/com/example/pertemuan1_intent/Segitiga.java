package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Segitiga extends AppCompatActivity {
    EditText input_alas,input_tinggi,output_hasil;
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        input_alas = findViewById(R.id.input_alas);
        input_tinggi = findViewById(R.id.input_tinggi);
        output_hasil = findViewById(R.id.output_hasil);
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String Alas = input_alas.getText().toString().trim();
                String Tinggi = input_tinggi.getText().toString().trim();
                Double a = toDouble(Alas);
                Double t = toDouble(Tinggi);
                double luas = 0.5 * a * t;
                output_hasil.setText(String.valueOf(luas));
            }
        });
    }
    private Double toDouble(String value) {
        try {
            return Double.valueOf(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}