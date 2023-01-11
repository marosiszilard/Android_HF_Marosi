package com.example.hf4;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomArrayAdapter extends ArrayAdapter {

    private final Activity context;

    private final CurrencyInfo[] currencyInfos;

    public CustomArrayAdapter(Activity context, Object[] currencyInfos){
        super(context, R.layout.lista_item, currencyInfos);

        this.context=context;
        this.currencyInfos = (CurrencyInfo[]) currencyInfos;
    }
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.lista_item, null,true);

        TextView nev = rowView.findViewById(R.id.txtName);
        TextView shortName = rowView.findViewById(R.id.txtShort);
        TextView sellValue = rowView.findViewById(R.id.txtSellValue);
        TextView buyValue = rowView.findViewById(R.id.txtBuyValue);
        ImageView kep = rowView.findViewById(R.id.img);

        nev.setText(currencyInfos[position].getCurrencyName());
        shortName.setText(currencyInfos[position].getCurrencyShort());
        sellValue.setText(String.valueOf(currencyInfos[position].getSellValue()));
        buyValue.setText(String.valueOf(currencyInfos[position].getBuyValue()));
        kep.setImageResource(currencyInfos[position].getImageID());

        return rowView;
    }
}
