package com.muhammet.eticaret;

public class Urun {
    private String ad;
    private Double fiyat;
    private Integer indirim;
    private Integer stok;

    public Urun(String ad, Double fiyat, Integer indirim, Integer stok) {
        this.ad = ad;
        this.fiyat = fiyat;
        this.indirim = indirim;
        this.stok = stok;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Urun{");
        sb.append("ad='").append(ad).append('\'');
        sb.append(", fiyat=").append(fiyat);
        sb.append(", indirim=").append(indirim);
        sb.append(", stok=").append(stok);
        sb.append('}');
        return sb.toString();
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }

    public Integer getIndirim() {
        return indirim;
    }

    public void setIndirim(Integer indirim) {
        this.indirim = indirim;
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }
}
