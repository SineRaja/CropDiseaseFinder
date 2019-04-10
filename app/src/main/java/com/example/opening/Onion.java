package com.example.opening;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Onion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onion);
        WebView webView = findViewById(R.id.onion11);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(webView.SCROLLBARS_INSIDE_OVERLAY);
        webView.loadUrl("https://hgic.clemson.edu/factsheet/onion-leek-shallot-garlic/");
    }
}
