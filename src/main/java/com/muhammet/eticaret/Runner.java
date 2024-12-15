package com.muhammet.eticaret;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Runner {
    private static List<Urun> urunList = new ArrayList<>();
    public static void main(String[] args) {
        init();
        System.out.println("""
                *** Ürün Listesi ***
                """);
        urunList.forEach(System.out::println);
        System.out.println("""
                *** Ürün Satışı Yapıldı ***
                """);
        urunSat("Çay",24);
        System.out.println("""
                *** Ürün Listesi ***
                """);
        urunList.forEach(System.out::println);
    }

    private static void urunSat(String urunAdi, Integer satisAdedi){
        Optional<Urun> urunOptional = urunList.stream().filter(x-> x.getAd().equalsIgnoreCase(urunAdi)).findFirst();
        if(urunOptional.isEmpty()) throw new RuntimeException("Ürün bulunamadı");
        if(satisAdedi<1 || satisAdedi>urunOptional.get().getStok()) throw new RuntimeException("Ürün Stoğu Yetersizdir");
        urunOptional.get().setStok(urunOptional.get().getStok()-satisAdedi);
    }

    private static void init(){
        urunList.add(new Urun("Şeker",249d,20,100));
        urunList.add(new Urun("Su",8d,5,100));
        urunList.add(new Urun("Çay",95d,15,100));
        urunList.add(new Urun("Un",50d,25,100));
        urunList.add(new Urun("Yağ",1_249d,10,100));
    }
}
