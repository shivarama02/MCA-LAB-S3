package com.example.program3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button submit;
    EditText usrname,usrage;
    RadioGroup rg;
    RadioButton male,female;
    CheckBox eng,hin,mal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        submit=(Button) findViewById(R.id.submit);
        usrname=(EditText) findViewById(R.id.name);
        usrage=(EditText) findViewById(R.id.age);
        rg=(RadioGroup) findViewById(R.id.rg);
        male=(RadioButton) findViewById(R.id.male);
        female=(RadioButton) findViewById(R.id.female);
        eng=(CheckBox) findViewById(R.id.eng);
        hin=(CheckBox) findViewById(R.id.hin);
        mal=(CheckBox) findViewById(R.id.mal);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = usrname.getText().toString();
                String age = usrage.getText().toString();

                String gender ="";
                int selectid = rg.getCheckedRadioButtonId();
                if(selectid == R.id.male){
                    gender = "male";
                }
                else if(selectid == R.id.female){
                    gender = "female";
                }

                StringBuilder lang = new StringBuilder();
                if(eng.isChecked()) {
                    lang.append("English\n");
                }
                if(hin.isChecked()){
                    lang.append("Hindi\n");
                }
                if(mal.isChecked()){
                    lang.append("Malayalam\n");
                }

                if(lang.length() > 0) {
                    lang.setLength(lang.length() - 1);
                }

                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("name",name);
                intent.putExtra("age",age);
                intent.putExtra("gender",gender);
                intent.putExtra("language",lang.toString());
                startActivity(intent);
            }
        });

    }
}