package com.example.opening;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Potato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potato);
        WebView webView = findViewById(R.id.potato11);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(webView.SCROLLBARS_INSIDE_OVERLAY);
        webView.loadUrl("https://hgic.clemson.edu/factsheet/potato/");
    }
}
