package com.example.hf05;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> list = new ArrayList<>();
    ArrayAdapter<String> myAdapter;
    ListView myList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list.add("Hetfo");
        list.add("Kedd");
        list.add("Szerda");
        list.add("Csutortok");
        list.add("Pentek");
        list.add("Szombat");
        list.add("Vasarnap");
        myList = findViewById(R.id.lista);
        myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,list);
        myList.setAdapter(myAdapter);
        registerForContextMenu(myList);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu,menu);
    }
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();

        View v = myList.getChildAt(info.position);
        switch (item.getItemId()){
            case R.id.piros:
                v.setBackgroundColor(Color.RED);
                return true;
            case R.id.zod:
                v.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.sarga:
                v.setBackgroundColor(Color.YELLOW);
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.torol:
                list.clear();
                myAdapter.notifyDataSetChanged();
                return true;
            case R.id.rendez:
                Collections.sort(list);
                myAdapter.notifyDataSetChanged();

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}