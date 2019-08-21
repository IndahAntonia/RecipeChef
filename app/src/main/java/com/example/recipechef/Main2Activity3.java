package com.example.recipechef;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recipechef.indah.DataApdater3;
import com.example.recipechef.indah.DataModel3;

import java.util.ArrayList;

public class Main2Activity3 extends AppCompatActivity {
    public DataApdater3 dataAdapter;
    public RecyclerView recyclerView;
    public ArrayList<DataModel3> dataModelArrayList=new ArrayList<DataModel3>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);

        inputData("Bestik sapi tradisional","artikeltradisional_1.html","https://img-global.cpcdn.com/003_recipes/6067c215accd0964/1502x1064cq70/bestik-sapi-tradisional-foto-resep-utama.jpg");
        inputData("Cap Jay Goreng Tradisional","artikeltradisional_2.html","https://img-global.cpcdn.com/003_recipes/a0e2f730703c3e8a/1502x1064cq70/cap-jay-goreng-ndeso-ala-pasar-tradisional-foto-resep-utama.jpg");
        inputData("Asem-Asem Bandeng","artikeltradisional_3.html","https://img-global.cpcdn.com/003_recipes/e018063b7f69208c/1502x1064cq70/asem-asem-bandeng-tradisional-foto-resep-utama.jpg");
        inputData("Gudeg Khas Yogyakarta","artikeltradisional_4.html","https://cdns.klimg.com/merdeka.com/i/w/news/2019/03/26/1065359/670x335/resep-gudeg-nangka-nikmat-ala-jogja.jpg");
        inputData("kerak telur","artikeltradisional_5.html","https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/vCUuXgXtWs.jpg");
        inputData("lupis","artikeltradisional_6.html","https://img-global.cpcdn.com/003_recipes/331cfefb9eff91c3/1502x1064cq70/lupis-tradisional-foto-resep-utama.jpg");
        inputData("Pempek","artikeltradisional_7.html","https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/g4z6tMPKGw.jpg");
        inputData("pepes tahu jamur","artikeltradisional_8.html","https://img-global.cpcdn.com/003_recipes/3e05207f681c6b46/1502x1064cq70/pepes-tahu-jamur-foto-resep-utama.jpg");
        inputData("rawon","artikeltradisional_9.html","https://img-global.cpcdn.com/003_recipes/3e05207f681c6b46/1502x1064cq70/pepes-tahu-jamur-foto-resep-utama.jpg");
        inputData("Rendang ayam","artikeltradisional_10.html","https://img-global.cpcdn.com/003_recipes/3e05207f681c6b46/1502x1064cq70/pepes-tahu-jamur-foto-resep-utama.jpg");
        inputData("serabi","artikeltradisional_11.html","https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/f8hvcE7moF.jpg");
        inputData("Urap-Urap tradisional","artikeltradisional_12.html","https://img-global.cpcdn.com/003_recipes/c2db58e988b23f74/1502x1064cq70/urap-urap-tradisional-foto-resep-utama.jpg");
        inputData("Ikam Asin pete pedas","artikeltradisional_13.html","https://img-global.cpcdn.com/003_recipes/038e6a5d969aceb3/1502x1064cq70/sambal-ikan-asin-pete-pedas-foto-resep-utama.jpg");
        inputData("Semur jengkol pedes nampol","artikeltradisional_14.html","https://img-global.cpcdn.com/003_recipes/2c31b9740dd25c8f/1502x1064cq70/semur-jengkol-pedes-nampol-foto-resep-utama.jpg");
        inputData("Combro isi sambal tempe","artikeltradisional_15.html","https://img-global.cpcdn.com/003_recipes/2e33407349d0ff9c/1502x1064cq70/combro-isi-sambal-tempe-foto-resep-utama.jpg");
        inputData("  Ayam Taliwang ","artikeltradisional_16.html","https://img-global.cpcdn.com/003_recipes/b38d26640c368c66/1502x1064cq70/ayam-taliwang-foto-resep-utama.jpg");



        recyclerView = (RecyclerView) findViewById(R.id.RecyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        dataAdapter = new DataApdater3(this,dataModelArrayList);
        recyclerView.setAdapter(dataAdapter);

        //menambahakan header
        DataModel3 headerModel = new DataModel3();
        headerModel.setViewType3(2);
        dataModelArrayList.add(0,headerModel);

        //menambahkan footer
        DataModel3 footerModel = new DataModel3();
        footerModel.setViewType3(3);
        dataModelArrayList.add(footerModel);
    }

    //fungsi input
    public void inputData(String judul,String konten, String gambar){
        DataModel3 dataModel = new DataModel3();
        dataModel.setJudul3(judul);
        dataModel.setKonten3(konten);
        dataModel.setViewType3(1);
        dataModel.setGambar3(gambar);

        dataModelArrayList.add(dataModel);
    }
    }

