package com.muhammet.banka;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    private static List<Musteri> musteriList = new ArrayList<>();
    public static void main(String[] args) {
        init();
        /**
         * Kullanıcıdan userName ve Password bilgisini isteyin.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı adı ....: ");
        String userName = scanner.nextLine();
        System.out.print("Şifre adı ........: ");
        String password = scanner.nextLine();

    }
    // checked exc.
    private static Musteri doLogin(String userName, String password){
        return null;

    }

    private static void init(){
        musteriList.add(new Musteri("Murat","TAŞ","murat.tas@gmail.com","murat","1234"));
        musteriList.add(new Musteri("Hakan","TAŞ","hakan.tas@gmail.com","hkn","1234"));
        musteriList.add(new Musteri("Eylül","TAŞ","eylul.tas@gmail.com","eyll","1234"));
        musteriList.add(new Musteri("Esra","TAŞ","esra.tas@gmail.com","esr","1234"));
    }
}
