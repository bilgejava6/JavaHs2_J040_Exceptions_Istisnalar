package com.muhammet;

import java.util.Scanner;

public class Runner_Ornek1 {
    public static void main(String[] args) {
        /**
         * Hesap İşlemleri
         */
        System.out.println("""
                *** Hesap İşlemleri ***
                1- Toplama
                2- Çıkartma
                3- Çarpma
                4- Bölme
                0- ÇIKIŞ
                """);

        int  input = select();
        switch (input){
            case 1: toplama(); break;
            case 2: cikartma();break;
            case 3: carpma();break;
            case 4: bolme();break;
            case 0:
                System.out.println("ÇIKIŞ");break;
            default:
                System.out.println("Hatalı Seçim");break;
        }
    }

    private static int select(){
        int secim = 0;
        boolean correct = false;
        do{
            Scanner scanner = new Scanner(System.in);
            try{
                System.out.print("Lütfen seçiniz....: ");
                secim = scanner.nextInt();
                correct = true;
            }catch (Exception ex){
                System.out.println("lütfen geçerli bir sayısal değer giriniz");
            }
        }while (!correct);
        return secim;
    }

    private static void toplama(){
        System.out.println("Toplama işlemi yapıldı");
    }
    private static void cikartma(){
        System.out.println("Çıkartma işlemi yapıldı");
    }
    private static void carpma(){
        System.out.println("ÇArpma işlemi yapıldı");
    }
    private static void bolme(){
        System.out.println("Bölme işlemi yapıldı");
    }

}
