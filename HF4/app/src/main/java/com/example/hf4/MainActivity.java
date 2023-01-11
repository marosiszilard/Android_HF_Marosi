package com.example.hf4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CurrencyInfo[] currencyInfos = {
                new CurrencyInfo("Euro","EUR",4.55,4.41,R.drawable.european_union),
                new CurrencyInfo("Dolar amrican","USD",4.145,3.975,R.drawable.united_states),
                new CurrencyInfo("Lira sterlina","GBP",6.355,6.125,R.drawable.united_kingdom),
                new CurrencyInfo("Dolar australian","AUD",3.06,2.96,R.drawable.australia),
                new CurrencyInfo("Dolar canadian","CAD",3.265,3.095,R.drawable.canada),
                new CurrencyInfo("Franc elvetian","CHF",4.33,4.23,R.drawable.switzerland),
                new CurrencyInfo("Coroana daneza","DKK",0.615,0.585,R.drawable.denmark),
                new CurrencyInfo("Forint maghiar","HUF",0.0146,0.0136,R.drawable.hungary)
        };
        ListView listView = findViewById(R.id.listView);
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, currencyInfos);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, CurrencyActivity.class);
                intent.putExtra("CURRENCY",currencyInfos[i]);

                MainActivity.this.startActivity(intent);
            }
        });

    }
}