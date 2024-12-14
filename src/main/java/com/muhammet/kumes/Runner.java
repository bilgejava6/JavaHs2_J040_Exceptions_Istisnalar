package com.muhammet.kumes;

public class Runner {
    public static void main(String[] args) {
        KumesIslemleri kumesIslemleri = new KumesIslemleri();

        kumesIslemleri.hayvanSayisi(3);
        try{
            kumesIslemleri.yumurtanSayisi(3);
        }catch (Exception ex){

        }


    }
}
