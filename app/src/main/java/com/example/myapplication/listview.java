package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
public class listview extends AppCompatActivity {

    public static void setOnClickListener() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        setTitle("Songs");

        List<String> dataList = new ArrayList<String>();
        dataList.add("Psalm");
        dataList.add("You by my side");
        dataList.add("LoVE");
        dataList.add("See");
        dataList.add("laugh");

        ListView listView = (ListView)findViewById(R.id.listViewExample);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, dataList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int index, long l) {
                Object clickItemObj = adapterView.getAdapter().getItem(index);
                Toast.makeText(listview.this, "You clicked " + clickItemObj.toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
