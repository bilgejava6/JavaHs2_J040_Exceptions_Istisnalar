package com.muhammet.rezervasyon;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    private static List<Kiralama> kiralamas = new ArrayList<>();
    public static void main(String[] args) {
        kiralamaYap("ODA1","Ahmet", LocalDate.of(2024,12,12),4);
        kiralamaYap("ODA1","Deniz", LocalDate.of(2024,12,20),12);
        kiralamaYap("ODA2","Hakan", LocalDate.of(2024,12,13),1);

        kiralamaYap("ODA1","Demet", LocalDate.of(2024,12,13),1);

        System.out.println("""
                *** Kiralama Listesi ***
                """);
        kiralamas.forEach(System.out::println);
    }

    private static void kiralamaYap(String odaAdi, String musteriAdi, LocalDate girisTarihi, Integer sure){
        LocalDate cikisTarihi = girisTarihi.plusDays(sure);
        boolean eslesmeVarMi = kiralamas.stream().anyMatch(x->
                x.getOdaAdi().equalsIgnoreCase(odaAdi) &&
                        (
                        (x.getGirisTarihi().isBefore(girisTarihi) && x.getCikisTarihi().isAfter(girisTarihi)) &&
                        (x.getGirisTarihi().isBefore(cikisTarihi) && x.getCikisTarihi().isAfter(cikisTarihi))
                        )
        );
        if(eslesmeVarMi) throw new RuntimeException("Oda Seçinlen tarihlerde doludur");
        kiralamas.add(new Kiralama(odaAdi,musteriAdi,girisTarihi,cikisTarihi));
    }
}
