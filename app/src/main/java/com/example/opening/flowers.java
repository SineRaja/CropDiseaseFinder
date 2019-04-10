package com.example.opening;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class flowers extends AppCompatActivity {
    ImageView apple,banana,blackberry,blueberry,strawberry,sweetcorn,grapes,orange,pomegranate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flowers);

        apple=findViewById(R.id.apple);
        banana=findViewById(R.id.banana);
        blackberry=findViewById(R.id.blackberry);
        blueberry=findViewById(R.id.blueberry);
        strawberry=findViewById(R.id.strawberry);
        sweetcorn=findViewById(R.id.sweetcorn);
        grapes=findViewById(R.id.grapes);
        orange=findViewById(R.id.orange);
        pomegranate=findViewById(R.id.pomegranate);

        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(flowers.this,apple.class);
                startActivity(intent);
            }
        });

        banana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(flowers.this,Banana.class);
                startActivity(intent);
            }
        });

       blackberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(flowers.this,Blackberry.class);
                startActivity(intent);
            }
        });
        blueberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(flowers.this,Blueberry.class);
                startActivity(intent);
            }
        });
        grapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(flowers.this,Grapes.class);
                startActivity(intent);
            }
        });
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(flowers.this,orange.class);
                startActivity(intent);
            }
        });
        pomegranate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(flowers.this,Pomegranate.class);
                startActivity(intent);
            }
        });
        sweetcorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(flowers.this,Sweetcorn.class);
                startActivity(intent);
            }
        });
        strawberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(flowers.this,Strawberry.class);
                startActivity(intent);
            }
        });


    }
}
