package com.muhammet.banka;

public class Musteri {
    String ad;
    String soyad;
    String email;
    String userName;
    String password;

    public Musteri(String ad, String soyad, String email, String userName, String password) {
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Musteri{");
        sb.append("ad='").append(ad).append('\'');
        sb.append(", soyad='").append(soyad).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
