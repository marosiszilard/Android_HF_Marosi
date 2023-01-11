package com.example.lab2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    private static final String CHECKBOX_KEY = "Checkbox_key";
    public static final String EDIT_TEXT_KEY = "Edit_text_key";

    EditText txt;
    CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        txt = findViewById(R.id.edtText);
        checkBox = findViewById(R.id.checkBox);

        if(savedInstanceState != null){
            txt.setText(savedInstanceState.getString(EDIT_TEXT_KEY));
            checkBox.setChecked(savedInstanceState.getBoolean(CHECKBOX_KEY));
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString(EDIT_TEXT_KEY, txt.getText().toString());
        outState.putBoolean(CHECKBOX_KEY, checkBox.isChecked());

        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Statusz:","MainActivity3: onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Statusz:","MainActivity3: onResstart()");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("Statusz:","MainActivity3: onPostResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Statusz:","MainActivity3: onPause()");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Statusz:","MainActivity3: onStop()");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Statusz:","MainActivity3: onDestroy()");

    }
}