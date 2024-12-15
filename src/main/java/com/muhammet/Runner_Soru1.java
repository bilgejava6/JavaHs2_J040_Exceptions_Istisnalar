package com.muhammet;

import java.util.Scanner;

public class Runner_Soru1 {
    public static void main(String[] args) {
        /**
         * Soru-1
         * bir restoran uygulamasında müşterilere çıkarrtılan hesabın ortaklaşa ödeneceği
         * bilinmektedir. bu nedenle ödeme tutarının ve müşteri sayısının verildiği bir method
         * yazınız bu method kişi başı ödenecek tutarı dönsün. ancak girilen parametreler de
         * sorun olursa ve ücreti hesalayamaz ise hata fırlatsın bunu da özelleştirerek
         * gerçekleştirin.
         *
         * Soru-2
         * Alışveriş Listesi
         *
         * Soru-3
         * Hava Durumu Kontrolü
         *
         * Soru-4
         * Banka Uygulaması, giriş işlemi
         *
         * Ödev-1
         * E-Ticaret Uygulaması
         * ürün entity si yazın (ad, fiyat, indirim, stok)
         * ürün listesi oluşturun 4-5 ürün girişi yapınız.
         * ürün satış adında bir meethod olsun bu method void olacak, ürün adını ve satın alınmak istenilen
         * adedi isteyecek.
         * herşey yolunda ise ürün satışı yapılacak ve listeden ürünün kendisi bulunup stok adedi azaltılacak
         * eğer satın alınmak istenilen adet stok miktarından fazla ise hata fırlatılacak ya da (stok yok)
         * satın alınmak istenilen ürün adı listede yok ise yine farklı bir şekilde hata fırlatılacak (ürün bulunamadı)
         *
         * Ödev-2
         * Rezervasyon Sistemi,
         * iki odamız var ve kiralamak istiyoruz. kiralama adında bir entity oluşturun
         * (oda adı, musteri adi, giris tarihi, cikis tarihi)
         * bir kiralama listesi olacak burada kiralaması yapılan odaların bilgileri tutulacak. mesela;
         * ODA-1, Ahmet, 12/12/2024 - 16/12/2024
         * ODA-1, Deniz, 20/12/2024 - 01/01/2025
         * ODA-2, Hakan, 13/12/2024 - 14/12/20242
         *
         * kiralamaYap(oda adı, musteri adi, giris tarihi, konaklama suresi) adında bir method yazınız.
         * bu method kiralama işlemi yapacak, eğer ilgili tarihlerde oda dolu ise hata fırlatacak.
         * (bu tarihler arasında ilgili oda doludur.)
         *
         */

        String[] alisverisListesi = new String[5];
        alisverisListesi[0] = "Ekmek";
        alisverisListesi[1] = "Su";
        alisverisListesi[2] = "Şeker";
        alisverisListesi[3] = "Çay";
        alisverisListesi[4] = "Peynir";

        System.out.print("hangi ürünü görüntüleyeceksin? ");
        int urunIndex = new Scanner(System.in).nextInt();



    }


}
