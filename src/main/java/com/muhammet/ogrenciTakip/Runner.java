package com.muhammet.ogrenciTakip;

import com.muhammet.ogrenciTakip.entity.Ogrenci;
import com.muhammet.ogrenciTakip.exception.ErrorType;
import com.muhammet.ogrenciTakip.exception.OgrenciTakipException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Runner {
    private static List<Ogrenci> ogrenciList = new ArrayList<>();

    public static void main(String[] args) {
        init();
        Ogrenci ogrenci = findByName("Muhammet");
        System.out.println("Öğrenci.....: "+ ogrenci);
        System.out.println(ogrenciList);
        addOgrenci(new Ogrenci("Kenan","Ankara",15));
        System.out.println(ogrenciList);
        addOgrenci(new Ogrenci("Muhammet","Ankara",15));
    }

    /**
     * Bu method öğrenci listesinden öğrenciyi olup dönüş yapar.
     * 1. durum öğrenci bulunur ve dönülür.
     * 2. öğrenci yoktur, ne dönecek?
     */
    private static Ogrenci findByName(String name){
      Optional<Ogrenci> ogrenci = ogrenciList.stream().filter(x-> x.getAd().equalsIgnoreCase(name)).findFirst();
      // 1. durum öğrenciyi bulamadı ise, istisna fırlatmalısınız.
      if(ogrenci.isEmpty()) throw new OgrenciTakipException(ErrorType.NOT_FOUND_OGRENCI);
      // 2. durum birinci durum gerçekleşmemiştir yani öğrenciyi bulmuştur
      return ogrenci.get();
    }

    private static void addOgrenci(Ogrenci ogrenci){
        boolean ogrencivarMi = ogrenciList.stream().anyMatch(x-> x.getAd().equalsIgnoreCase(ogrenci.getAd()));
        if (ogrencivarMi) throw  new OgrenciTakipException(ErrorType.ZATEN_KAYITLI);
        ogrenciList.add(ogrenci);
    }

    private static void init(){
        ogrenciList.add(new Ogrenci("Muhammet","Ankara", 15));
        ogrenciList.add(new Ogrenci("Deniz","Ankara", 12));
        ogrenciList.add(new Ogrenci("Aynur","İzmir", 14));
        ogrenciList.add(new Ogrenci("Beyhan","Bursa", 14));
        ogrenciList.add(new Ogrenci("Elif","Samsun", 13));
        ogrenciList.add(new Ogrenci("Zeynep","Trabzon", 13));
        ogrenciList.add(new Ogrenci("Hakan","Konya", 12));
    }
}
