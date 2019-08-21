package com.example.recipechef;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.recipechef.indah.DataModel3;

public class Detail3 extends AppCompatActivity {
    WebView webViewtradisional;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail3);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        DataModel3 dataModel = (DataModel3) bundle.getSerializable("dataModel");
        // setting judul bar
        setTitle(dataModel.getJudul3());


        //tampil data konten
        webViewtradisional = (WebView) findViewById(R.id.webView1tradisional);
        webViewtradisional.loadUrl("file:///android_asset/" + dataModel.getKonten3());
    }
}
