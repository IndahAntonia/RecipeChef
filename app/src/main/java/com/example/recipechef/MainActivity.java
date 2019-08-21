package com.example.recipechef;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recipechef.indah.DataApdater;
import com.example.recipechef.indah.DataModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public DataApdater dataAdapter;
    public RecyclerView recyclerView;
    public ArrayList<DataModel> dataModelArrayList=new ArrayList<DataModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputData("Ayam Bakar Bumbu Bali","artikel_1.html","https://img-global.cpcdn.com/003_recipes/6a1431864f80f96c/640x640sq70/photo.jpg");
        inputData("Sate Ayam Srepeh","artikel_2.html","https://img-global.cpcdn.com/003_recipes/4cb13eb00ffebe91/640x640sq70/photo.jpg");
        inputData("Pizza Sosis Jumbo (Tanpa Ulen)","artikel_3.html","https://img-global.cpcdn.com/003_recipes/bcecd4e3f236feef/640x640sq70/photo.jpg");
        inputData("Nasgor Mawut (Mawut Sayur)","artikel_4.html","https://img-global.cpcdn.com/003_recipes/485af0215d24389f/640x640sq70/photo.jpg");
        inputData("Fuyung Hai ala Chef Lidya","artikel_5.html","https://img-global.cpcdn.com/003_recipes/3c898da67ba28c6e/640x640sq70/photo.jpg");
        inputData("Lobster bumbu Padang","artikel_6.html","https://img-global.cpcdn.com/003_recipes/a248bbc7e0294934/640x640sq70/photo.jpg");
        inputData("Sop Iga Sapi Enak Sedep Banget","artikel_7.html","https://img-global.cpcdn.com/003_recipes/b967e9683dadcefd/640x640sq70/photo.jpg");
        inputData("Opor Ayam Kampung","artikel_8.html","https://img-global.cpcdn.com/003_recipes/66e7b65ed61b9751/640x640sq70/photo.jpg");
        inputData("Bebek Goreng Sambel Ijo","artikel_9.html","https://img-global.cpcdn.com/003_recipes/13c6e1c1332ef691/640x640sq70/photo.jpg");
        inputData("Soto Ayam Kampung","artikel_10.html","https://img-global.cpcdn.com/003_steps/57e684ee3adf0fcd/640x640sq70/photo.jpg");
        inputData("Bakso Ayam","artikel_11.html","https://img-global.cpcdn.com/003_recipes/ab179a20450ae7ae/640x640sq70/photo.jpg");
        inputData("Ikan Gurame Bakar","artikel_12.html","https://img-global.cpcdn.com/003_recipes/5f19b764446d6be1/640x640sq70/photo.jpg");
        inputData("Pisang Bakar Coklat Keju","artikel_13.html","https://img-global.cpcdn.com/003_recipes/62092e6238cd1060/640x640sq70/photo.jpg");
        inputData("Keto Martabak Terang Bulan","artikel_14.html","https://img-global.cpcdn.com/003_recipes/aca529064f25211a/640x640sq70/photo.jpg");
        inputData("Ingkung Ayam Kampung","artikel_15.html","https://img-global.cpcdn.com/003_recipes/d67c093a07fd0e3f/640x640sq70/photo.jpg");
        inputData("  Bumbu Pecel yang Enak ","artikel16.html","https://cdns.klimg.com/merdeka.com/i/w/news/2019/03/13/1060401/670x335/cara-membuat-bumbu-pecel-yang-enak-dan-tahan-lama-disimpan.jpg");





        recyclerView = (RecyclerView) findViewById(R.id.RecyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        dataAdapter = new DataApdater(this,dataModelArrayList);
        recyclerView.setAdapter(dataAdapter);

        //menambahakan header
        DataModel headerModel = new DataModel();
        headerModel.setViewType(2);
        dataModelArrayList.add(0,headerModel);

        //menambahkan footer
        DataModel footerModel = new DataModel();
        footerModel.setViewType(3);
        dataModelArrayList.add(footerModel);
    }

    //fungsi input
    public void inputData(String judul,String konten, String gambar){
        DataModel dataModel = new DataModel();
        dataModel.setJudul(judul);
        dataModel.setKonten(konten);
        dataModel.setViewType(1);
        dataModel.setGambar(gambar);

        dataModelArrayList.add(dataModel);
    }

}



