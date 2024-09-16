package com.example.calculapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private StringBuilder firstNumber;
    private String secondNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView textView = findViewById(R.id.textView);
        Button button_0 = findViewById(R.id.button_0);
        button_0.setOnClickListener(view -> {
            if (firstNumber != null) {
                firstNumber.append("0");
            textView.setText(firstNumber.toString());
        }
        });
        Button button_1 = findViewById(R.id.button_1);
        button_1.setOnClickListener(view -> {
            if (firstNumber!=null){
                firstNumber.append("1");
            } else {
                firstNumber = new StringBuilder("1");
            }
            textView.setText(firstNumber.toString());
        });
        Button button_2 = findViewById(R.id.button_2);
        button_2.setOnClickListener(view -> {
            if (firstNumber!=null){
                firstNumber.append("2");
            } else {
                firstNumber = new StringBuilder("2");
            }
            textView.setText(firstNumber.toString());
        });
        Button button_3 = findViewById(R.id.button_3);
        button_3.setOnClickListener(view -> {
            if (firstNumber!=null){
                firstNumber.append("3");
            } else {
                firstNumber = new StringBuilder("3");
            }
            textView.setText(firstNumber.toString());
        });
        Button button_4 = findViewById(R.id.button_4);
        button_4.setOnClickListener(view -> {
            if (firstNumber!=null){
                firstNumber.append("4");
            } else {
                firstNumber = new StringBuilder("4");
            }
            textView.setText(firstNumber.toString());
        });
        Button button_5 = findViewById(R.id.button_5);
        button_5.setOnClickListener(view -> {
            if (firstNumber!=null){
                firstNumber.append("5");
            } else {
                firstNumber = new StringBuilder("5");
            }
            textView.setText(firstNumber.toString());
        });
        Button button_6 = findViewById(R.id.button_6);
        button_6.setOnClickListener(view -> {
            if (firstNumber!=null){
                firstNumber.append("6");
            } else {
                firstNumber = new StringBuilder("6");
            }
            textView.setText(firstNumber.toString());
        });
        Button button_7 = findViewById(R.id.button_7);
        button_7.setOnClickListener(view -> {
            if (firstNumber!=null){
                firstNumber.append("7");
            } else {
                firstNumber = new StringBuilder("7");
            }
            textView.setText(firstNumber.toString());
        });
        Button button_8 = findViewById(R.id.button_8);
        button_8.setOnClickListener(view -> {
            if (firstNumber!=null){
                firstNumber.append("8");
            } else {
                firstNumber = new StringBuilder("8");
            }
            textView.setText(firstNumber.toString());
        });
        Button button_9 = findViewById(R.id.button_9);
        button_9.setOnClickListener(view -> {
            if (firstNumber!=null){
                firstNumber.append("9");
            } else {
                firstNumber = new StringBuilder("9");
            }
            textView.setText(firstNumber.toString());
        });
    }
}