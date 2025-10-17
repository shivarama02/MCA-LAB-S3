package com.example.program3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView r;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        r=(TextView) findViewById(R.id.result);
        b1=(Button) findViewById(R.id.btn);
        b2=(Button) findViewById(R.id.list);

        String name = getIntent().getStringExtra("name");
        String age = getIntent().getStringExtra("age");
        String gender = getIntent().getStringExtra("gender");
        String lang = getIntent().getStringExtra("language");

        String details = "Name: "+name+"\n"
                +"Age: "+age+"\n"
                +"Gender: "+gender+"\n"
                +"Languages known: "+lang;

        r.setText(details);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent=new Intent(MainActivity3.this, MainActivity.class);
            startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intent);
            }
        });

    }
}