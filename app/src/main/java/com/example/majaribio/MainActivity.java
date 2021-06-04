package com.example.majaribio;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import java.math.*;
import android.widget.TextView;
import android.view.View;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    private  EditText editText1,editText2;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.num1);
        editText2 = (EditText) findViewById(R.id.num2);
        textView = (TextView) findViewById(R.id.result);
    }

    public void Addition(View view) {
        int n1 = Integer.parseInt(editText1.getText().toString());
        int n2 = Integer.parseInt(editText2.getText().toString());
        int sum= n1+n2;
        textView.setText(String.valueOf(sum));
    }

    public void minus(View view) {
        int n1 = Integer.parseInt(editText1.getText().toString());
        int n2 = Integer.parseInt(editText2.getText().toString());
        int sum= n1-n2;
        textView.setText(String.valueOf(sum));
    }

    public void times(View view) {
        int n1 = Integer.parseInt(editText1.getText().toString());
        int n2 = Integer.parseInt(editText2.getText().toString());
        int sum= n1*n2;
        textView.setText(String.valueOf(sum));
    }

    public void division(View view) {
        int n1 = Integer.parseInt(editText1.getText().toString());
        int n2 = Integer.parseInt(editText2.getText().toString());
        int sum= n1/n2;
        textView.setText(String.valueOf(sum));
    }

    public void modulus(View view) {
        int n1 = Integer.parseInt(editText1.getText().toString());
        int n2 = Integer.parseInt(editText2.getText().toString());
        int sum= n1%n2;
        textView.setText(String.valueOf(sum));
    }

    public void power(View view) {
        int n1 = Integer.parseInt(editText1.getText().toString());
        int n2 = Integer.parseInt(editText2.getText().toString());
        double sum= Math.pow(n1,n2);
        textView.setText(String.valueOf(sum));
    }
}