package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeAactivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_aactivity);
        button1=(Button) findViewById(R.id.button12);
        button2=(Button) findViewById(R.id.button13);
        button3=(Button) findViewById(R.id.button14);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityNote();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityToDoList();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityCalculator();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityGuessTheNum();
            }
        });
    }


    public void openActivityNote(){
        Intent intent=new Intent(this, NoteActivity.class);
        startActivity(intent);
    }
    public void openActivityToDoList(){
        Intent intent=new Intent(this, ToDOListActivity.class);
        startActivity(intent);
    }
    public void openActivityCalculator(){
        Intent intent=new Intent(this, CalculatorActivity.class);
        startActivity(intent);
    }
    public void openActivityGuessTheNum(){
        Intent intent=new Intent(this,GuessTheNumActivity.class);
        startActivity(intent);
    }
}