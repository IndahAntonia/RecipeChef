package com.example.recipechef;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.recipechef.indah.DataModel;
import com.example.recipechef.indah.DataModel2;

public class Detail2 extends AppCompatActivity {
    WebView webViewcake;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        DataModel2 dataModel = (DataModel2) bundle.getSerializable("dataModel");
        // setting judul bar
        setTitle(dataModel.getJudul2());


        //tampil data konten
        webViewcake = (WebView) findViewById(R.id.webView1cake);
        webViewcake.loadUrl("file:///android_asset/" + dataModel.getKonten2());
    }
}
