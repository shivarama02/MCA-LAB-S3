package com.example.program3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    ListView l;
    Button b;
    String arr[]={"Gokul","abhishek","anandu","yadhu","shivarama"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        l=(ListView) findViewById(R.id.list);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);
        l.setAdapter(adapter);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity4.this, "Name Clicked: "+adapter.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });
        b=(Button) findViewById(R.id.yt);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com"));
                startActivity(intent);
                Toast.makeText(MainActivity4.this, "Redirecting to Youtube", Toast.LENGTH_SHORT).show();
            }
        });
    }
}