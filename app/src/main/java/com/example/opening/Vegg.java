package com.example.opening;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Vegg extends AppCompatActivity {
    ImageView tomato11,pumpkin11,carrot11,beans11,brinjal11,capcicum11,potato11,onion11,cucumber11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegg);

        tomato11=findViewById(R.id.tomato);
        pumpkin11=findViewById(R.id.pumpkin);
        carrot11=findViewById(R.id.carrot);
        beans11=findViewById(R.id.bean);
        brinjal11=findViewById(R.id.eff);
        capcicum11=findViewById(R.id.capcicum);
        potato11=findViewById(R.id.potato);
        onion11=findViewById(R.id.onion);
        cucumber11=findViewById(R.id.cucumber);

        tomato11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Vegg.this,Tomato.class);
                startActivity(intent);
            }
        });
        pumpkin11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Vegg.this,Pumpkin.class);
                startActivity(intent1);
            }
        });
        carrot11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Vegg.this,Carrot.class);
                startActivity(intent2);
            }
        });
        beans11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(Vegg.this,Beans.class);
                startActivity(intent3);
            }
        });
        brinjal11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(Vegg.this,Brinjal.class);
                startActivity(intent4);
            }
        });
        capcicum11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(Vegg.this,Capcicum.class);
                startActivity(intent5);
            }
        });
        potato11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6=new Intent(Vegg.this,Potato.class);
                startActivity(intent6);
            }
        });
        onion11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7=new Intent(Vegg.this,Onion.class);
                startActivity(intent7);
            }
        });
        cucumber11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8=new Intent(Vegg.this,Cucumber.class);
                startActivity(intent8);
            }
        });

    }
}
