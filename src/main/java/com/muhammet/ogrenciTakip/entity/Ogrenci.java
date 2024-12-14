package com.muhammet.ogrenciTakip.entity;

import java.util.Random;

public class Ogrenci {
    Long id;
    String ad;
    String adres;
    Integer yas;

    public Ogrenci() {
        this.id = new Random().nextLong(5000,28_344_221);
    }

    public Ogrenci(String ad, String adres, Integer yas) {
        this();
        this.ad = ad;
        this.adres = adres;
        this.yas = yas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Ogrenci{");
        sb.append("id=").append(id);
        sb.append(", ad='").append(ad).append('\'');
        sb.append(", adres='").append(adres).append('\'');
        sb.append(", yas=").append(yas);
        sb.append('}');
        return sb.toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Integer getYas() {
        return yas;
    }

    public void setYas(Integer yas) {
        this.yas = yas;
    }
}
