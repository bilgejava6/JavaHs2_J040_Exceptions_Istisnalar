package com.muhammet;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Runner_SpesifikCatch {
    public static void main(String[] args) {
        /**
         * Uygulamalarda hatalar tespit edilir ve bunlara önlemler alınır. Ancak, bir sistemde
         * bir çok istisna olabilir bunlar tek tek ele alınması gereklidir.
         * !!! DİKKAT !!!
         * istisnalar sadece uygulamanın hata vermesini önlemek için değil uygulamay geliştirmek için de
         * önemlidir. Beklenmeyen ya da belenen istisnalar, tümüyle LOG lanır. yani oluşan sorunlar
         * bir yerde depolanır. Böylece uygulamada oluşan sorunları kaynakları tespit edilerek
         * uygulamanın gelitirilmesi ve yeni versiyonların ya da gelitirme update lerinin
         * çıkartılması sağlanır.
         */
        List<String> kullanicilar = List.of("Ahmet", "Demet","Canan","Hakan","Aynur","Beyza");
        System.out.println("""
                *** Kullanıcı Seç ****
                """);
        Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen kullanıcı numarasını giriniz....: ");
        try{
            int no = scanner.nextInt(); // istisna türü: java.util.InputMismatchException
            String bulunan = kullanicilar.get(no); // istisna türü: java.lang.ArrayIndexOutOfBoundsException
            System.out.println("bulunan : " + bulunan);
            int s1 = 56, s2 = 0;
            int bolum = s1 / s2;
            System.out.println("sonuç...: "+ bolum);
        }catch (InputMismatchException ex){
            System.err.println("Girdiğiniz değer sayılsal bir değer değil. lütfen sayı giriniz");
        }catch (ArrayIndexOutOfBoundsException ex){
            System.err.println("Girdiğiniz değer dizini sınırlarınız aşıyor lütfen [0 - "+(kullanicilar.size()-1)+" ] aralıkta bir değer giriniz.");
        }catch (Exception exception){
            System.err.println("Beklenmeyen bir hata oldu. Lütfen bizimle iletişime geçin HataKodu: "+ exception.getMessage());
            System.err.println("Hata detay....: "+ exception);
            System.err.println("oluşma zamanı....: "+ System.currentTimeMillis());
            System.err.println("Kullanıcı.....: Ali Veli");
        }

    }
}
