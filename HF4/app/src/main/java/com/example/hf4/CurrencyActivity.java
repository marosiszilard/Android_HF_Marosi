package com.example.hf4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CurrencyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        CurrencyInfo currentCurrency = (CurrencyInfo) getIntent().getSerializableExtra("CURRENCY");

        TextView name = findViewById(R.id.txtNameInfo);
        TextView shortName = findViewById(R.id.txtInfoShort);
        TextView sell = findViewById(R.id.txtSellInfo);
        TextView buy = findViewById(R.id.txtBuyInfo);
        ImageView img = findViewById(R.id.imageView);

        name.setText(currentCurrency.getCurrencyName());
        shortName.setText(currentCurrency.getCurrencyShort());
        sell.setText(String.valueOf(currentCurrency.getSellValue()));
        buy.setText(String.valueOf(currentCurrency.getBuyValue()));
        img.setImageResource(currentCurrency.getImageID());
    }
}