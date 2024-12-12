package com.muhammet;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        /**
         * Exceptions - İstisnalar
         * Bazen uygulamlarınızın beklenmeyen durumlarla karşılaşmasını engelleyemezsiniz. Siz istemesenizde
         * beklenmeyen şeyler olur. Bu nedenle bu istisnai durumları yakalayacak(catch) kodlamalar yapmalısınız.
         * Exception kavramı bu beklenmeyen durumları ifade eder ve bunları nasıl yöneteceğimizi tanımlar.
         * İstisnaların yönetmek:
         * try{ // dene
         *     // olası sorun teşkil edecek kodlarınızı buraya yazın.
         * } catch(Exception ex){ // olası sorunu yakala
         *     // sorun olduğunda yapılacak kodu yazınız.
         * }
         */

        try{ // deneme
            Scanner scanner = new Scanner(System.in);
            System.out.print("1. sayıyı girini....:  ");
            int sayi = scanner.nextInt();
            System.out.print("2. sayıyı girini....:  ");
            int sayi2 = scanner.nextInt();
            int bolum = sayi / sayi2;

            System.out.println("İki sayının bir birine bölümü...: "+ bolum);
        }catch (Exception ex){ // sorun olursa yakalar
            System.err.println("Beklenmeyen bir durum oluştu. Lütfen kontrol ederek tekrar deneyin.");
        }



    }
}
