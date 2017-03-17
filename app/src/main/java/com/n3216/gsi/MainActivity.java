package com.n3216.gsi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();

        //リンクをタップしたときに標準ブラウザを起動させない
        webView.setWebViewClient(new WebViewClient());

//        webView.loadUrl("http://www.yahoo.co.jp/");
        webView.loadUrl("file:///android_asset/map_leaflet.html");
        //javascriptを許可する
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
//        webView.setInitialScale(1);
//        webView.clearCache(true);

    }

    protected void findViews()
    {
        // activity_main.xmlには、webViewというIDで配置
        webView = (WebView) findViewById(R.id.webView);
    }
}
