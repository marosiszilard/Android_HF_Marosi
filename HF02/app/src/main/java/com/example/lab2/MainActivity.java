package com.example.lab2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent asd = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(asd);
            }
        });

        txt = findViewById(R.id.txtHello);

        if(savedInstanceState != null){
            txt.setText(savedInstanceState.getString("KEY"));
        }
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.append("\n Hello");
            }
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString("KEY", txt.getText().toString());

        super.onSaveInstanceState(outState);
    }
/*
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        txt.setText(savedInstanceState.getString("KEY"));
        super.onRestoreInstanceState(savedInstanceState);
    }*/

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Statusz:","MainActivity: onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Statusz:","MainActivity: onResstart()");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("Statusz:","MainActivity: onPostResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Statusz:","MainActivity: onPause()");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Statusz:","MainActivity: onStop()");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Statusz:","MainActivity: onDestroy()");

    }
}