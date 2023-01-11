package com.example.hf03part2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Product> products = new ArrayList<Product>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.list);
        recyclerView.setVisibility(View.GONE);

        ProductAdapter productAdapter = new ProductAdapter(products);
        recyclerView.setAdapter(productAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Button cancelBtn = findViewById(R.id.btnCancel);
        Button addBtn = findViewById(R.id.btnAdd);
        Button showBtn = findViewById(R.id.btnShowProduct);

        EditText codeEdtTxt = findViewById(R.id.edtTxtCode);
        EditText nameEdtTxt = findViewById(R.id.edtTxtName);
        EditText priceEdtTxt = findViewById(R.id.edtTxtPrice);

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                codeEdtTxt.setText("");
                nameEdtTxt.setText("");
                priceEdtTxt.setText("");
            }
        });

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameEdtTxt.getText().toString();
                String code = codeEdtTxt.getText().toString();
                String priceStr = priceEdtTxt.getText().toString();
                if(!name.isEmpty() || !code.isEmpty() || !priceStr.isEmpty()){
                    double price = Double.parseDouble(priceStr);
                    Product product = new Product(code,name,price);
                    products.add(product);
                    productAdapter.notifyDataSetChanged();
                }
            }
        });

        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                recyclerView.setVisibility(recyclerView.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
            }
        });
    }
}