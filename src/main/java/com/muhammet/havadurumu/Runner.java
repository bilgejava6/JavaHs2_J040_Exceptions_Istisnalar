package com.muhammet.havadurumu;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    private static List<HavaDurumu> havaDurumuList = new ArrayList<>();
    public static void main(String[] args) {
        init();
        /**
         * Kullanıcıdan hangi şehirde yaşadığın alan ve buna göre o şehire ait hava durumu
         * bilgilerini dönen bir method yazınız. Eğer kişi şehir adını yanlış  yazmış ise
         * hata fırlatın. checked olsun.
         */
    }

    private static void init(){
        havaDurumuList.add(new HavaDurumu("Ankara",-4,7));
        havaDurumuList.add(new HavaDurumu("İstanbul",0,13));
        havaDurumuList.add(new HavaDurumu("Antalya",8,15));
        havaDurumuList.add(new HavaDurumu("İzmir",1,9));
        havaDurumuList.add(new HavaDurumu("Hakkari",-14,-1));
        havaDurumuList.add(new HavaDurumu("Adana",9,17));
        havaDurumuList.add(new HavaDurumu("Artvin",-9,9));
    }
}
