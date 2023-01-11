package com.example.hf01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText EdtNum1,EdtNum2;
    Button BtnPlus, BtnMinus, BtnMult, BtnDiv;
    TextView TxtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EdtNum1 = findViewById(R.id.EdtNum1);
        EdtNum2 = findViewById(R.id.EdtNum2);

        BtnPlus = findViewById(R.id.BtnPlus);
        BtnMinus = findViewById(R.id.BtnMinus);
        BtnMult = findViewById(R.id.BtnMult);
        BtnDiv = findViewById(R.id.BtnDiv);

        BtnPlus.setOnClickListener(this);
        BtnMinus.setOnClickListener(this);
        BtnMult.setOnClickListener(this);
        BtnDiv.setOnClickListener(this);

        TxtResult = findViewById(R.id.Result);
    }

    @Override
    public void onClick(View view) {
        try {
            switch (view.getId()){
                case R.id.BtnPlus:
                    TxtResult.setText(DoOperation("+").toString());
                    break;
                case R.id.BtnMinus:
                    TxtResult.setText(DoOperation("-").toString());
                    break;
                case R.id.BtnMult:
                    TxtResult.setText(DoOperation("*").toString());
                    break;
                case R.id.BtnDiv:
                    TxtResult.setText(DoOperation("/").toString());
                    break;
            }
        }
        catch (Exception e){
            TxtResult.setText(e.getMessage());
        }

    }

    protected Double DoOperation(String opType) throws Exception {
        try {
            Double num1 = Double.parseDouble(EdtNum1.getText().toString());
            Double num2 = Double.parseDouble(EdtNum2.getText().toString());
            switch (opType){
                case "+": return num1+num2;
                case "-": return num1-num2;
                case "*": return num1*num2;
                case "/":
                    if (num2 != 0) return num1/num2;
                default:
                    throw new Exception("Inavlid operation");
            }
        }
        catch (Exception e){
            throw new Exception("Inavlid input");
        }
    }
}

