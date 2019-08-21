package com.example.recipechef;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.recipechef.indah.DataModel;
import com.example.recipechef.indah.DataModel2;

public class Detail extends AppCompatActivity {
    WebView webViewmod;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        DataModel dataModel = (DataModel) bundle.getSerializable("dataModel");

        // setting judul bar
        setTitle(dataModel.getJudul());


        //tampil data konten
        webViewmod = (WebView) findViewById(R.id.webView1mod);
        webViewmod.loadUrl("file:///android_asset/" + dataModel.getKonten());



    }
}
