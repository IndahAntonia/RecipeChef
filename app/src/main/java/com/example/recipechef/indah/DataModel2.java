package com.example.recipechef.indah;

import java.io.Serializable;

public class DataModel2 implements Serializable {
    private Integer viewType2;
    private String Judul2;
    private String konten2;
    private String gambar2;

    public Integer getViewType2() {
        return viewType2;
    }

    public void setViewType2(Integer viewType2) {
        this.viewType2 = viewType2;
    }

    public String getJudul2() {
        return Judul2;
    }

    public void setJudul2(String judul2) {
        Judul2 = judul2;
    }

    public String getKonten2() {
        return konten2;
    }

    public void setKonten2(String konten2) {
        this.konten2 = konten2;
    }

    public String getGambar2() {
        return gambar2;
    }

    public void setGambar2(String gambar2) {
        this.gambar2 = gambar2;
    }
}
