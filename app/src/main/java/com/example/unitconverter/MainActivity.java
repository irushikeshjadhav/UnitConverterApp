package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView output;
    EditText EnterNum;
    Button miles;
    Button meters;
    Button kilometers;
    Button Centimeters;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.textView2);
        EnterNum = findViewById(R.id.editTextNumberDecimal);
        miles = findViewById(R.id.button3);

        kilometers = findViewById(R.id.button4);
        Centimeters = findViewById(R.id.button2);

        Centimeters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                double Centimeters = (number*100);
                output.setText("Value in Centimeters : "+Centimeters);
            }
        });
        kilometers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                double kilometers = (number/1000);
                output.setText("Value in Kilometers : "+kilometers);
            }
        });
        miles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                double miles = (number/1.609);
                output.setText("Value in miles : "+miles);
            }
        });
    }
}