package com.muhammet.rezervasyon;

import java.time.LocalDate;

public class Kiralama {
    private String odaAdi;
    private String musteriAdi;
    private LocalDate girisTarihi;
    private LocalDate cikisTarihi;

    public Kiralama(String odaAdi, String musteriAdi, LocalDate girisTarihi, LocalDate cikisTarihi) {
        this.odaAdi = odaAdi;
        this.musteriAdi = musteriAdi;
        this.girisTarihi = girisTarihi;
        this.cikisTarihi = cikisTarihi;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Kiralama{");
        sb.append("odaAdi='").append(odaAdi).append('\'');
        sb.append(", musteriAdi='").append(musteriAdi).append('\'');
        sb.append(", girisTarihi=").append(girisTarihi);
        sb.append(", cikisTarihi=").append(cikisTarihi);
        sb.append('}');
        return sb.toString();
    }

    public String getOdaAdi() {
        return odaAdi;
    }

    public void setOdaAdi(String odaAdi) {
        this.odaAdi = odaAdi;
    }

    public String getMusteriAdi() {
        return musteriAdi;
    }

    public void setMusteriAdi(String musteriAdi) {
        this.musteriAdi = musteriAdi;
    }

    public LocalDate getGirisTarihi() {
        return girisTarihi;
    }

    public void setGirisTarihi(LocalDate girisTarihi) {
        this.girisTarihi = girisTarihi;
    }

    public LocalDate getCikisTarihi() {
        return cikisTarihi;
    }

    public void setCikisTarihi(LocalDate cikisTarihi) {
        this.cikisTarihi = cikisTarihi;
    }
}
