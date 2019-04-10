package com.example.opening;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Bougainvillea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bougainvillea);
        WebView webView = findViewById(R.id.i7);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(webView.SCROLLBARS_INSIDE_OVERLAY);
        webView.loadUrl("https://hgic.clemson.edu/factsheet/bougainvillea-2/");
    }
    }

