package com.example.program3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity5 extends AppCompatActivity {
    Spinner sp;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        sp=(Spinner) findViewById(R.id.sp);
        t1=(TextView) findViewById(R.id.t1);
        ArrayList <String> al=new ArrayList<String>();
        al.add("Mango");
        al.add("apple");
        al.add("banana");
        al.add("pineapple");

        ArrayAdapter adapter=new ArrayAdapter<>(this,androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,al);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                t1.setText("Selected Fruit: "+al.get(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                t1.setText("Select a fruit");
            }
        });
    }
}