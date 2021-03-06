package com.gluespark.joker.gluespark.activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.gluespark.joker.gluespark.R;

public class SettingsActivity extends AppCompatActivity {
    private ListView listView;
    private TextView textView;
    private String[] listItem;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        listView= findViewById(R.id.listView);
        textView= findViewById(R.id.textView);
        listItem = getResources().getStringArray(R.array.array_setting);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, listItem);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String value=adapter.getItem(position);
                switch (position){
                    case 0:
                        Intent localIntent=new Intent(SettingsActivity.this,AccountActivity.class);
                        startActivity(localIntent);
                        break;
                        default: Toast.makeText(getApplicationContext(),value, Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}