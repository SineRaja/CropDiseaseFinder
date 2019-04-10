package com.example.opening;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Fruits extends AppCompatActivity {
   ImageView i1,i2,i3,i4,i5,i6,i7,i8,i9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        i1=findViewById(R.id.i1);
        i2=findViewById(R.id.i2);
        i3=findViewById(R.id.i3);
        i4=findViewById(R.id.i4);
        i5=findViewById(R.id.i5);
        i6=findViewById(R.id.i6);
        i7=findViewById(R.id.i7);
        i8=findViewById(R.id.i8);
        i9=findViewById(R.id.i9);

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Fruits.this,Rose.class);
                startActivity(intent);
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Fruits.this,Fuchsia.class);
                startActivity(intent);
            }
        });

        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Fruits.this,Orchids.class);
                startActivity(intent);
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Fruits.this,Plily.class);
                startActivity(intent);
            }
        });

        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Fruits.this,Amaryllis.class);
                startActivity(intent);
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Fruits.this,Cacti.class);
                startActivity(intent);
            }
        });
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Fruits.this,Bougainvillea.class);
                startActivity(intent);
            }
        });

        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Fruits.this,Kerria.class);
                startActivity(intent);
            }
        });
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Fruits.this,lily.class);
                startActivity(intent);
            }
        });





    }
}
