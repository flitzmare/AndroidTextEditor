package com.example.flitzmare21.nyobatexteditor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main2);

//        WebView webView = (WebView) findViewById(R.id.webView);
        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadData(getIntent().getExtras().getString("code"), "text/html", "utf-8");
//        webView.loadUrl("file:///android_asset/testing.html");
        setContentView(webView);
    }
}
