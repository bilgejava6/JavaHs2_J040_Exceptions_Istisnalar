package com.muhammet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Runner_Checkes_UnChecked_Exceptions {
    public static void main(String[] args) {
        /**
         * Compiler Time: derleme zamanı, yani kodunuzu yazdınız ve çalıştırmak için derlemeniz
         * gerekli, yani kodun okunup syntax olarak doğruluğunun kontrol edilmesi ve byte code
         * a çevirilmesi gerekli bu işlem sürecine compiler time denir.
         * Runtime : Uygulamanız artık run edilmiş ve çalışır durumdadır. Uygulamanın kullanıl
         * dığı sürece denir.
         *
         * Cehecked Exception: compiler time da kodların özellikle kontrol edilmesini zorunlu
         * hale getirmek için kullanılır. Bu istisnalar kullanlar tarafından mutlaka irdelenmeli
         * ve kontrol edilmelidir.
         * Checked Exception ları nasıl yönetebiliriz?
         * 1. Yöntem: eğer kullandığımız method kodumuzun akışını kesiyor ve cevap vermemizi
         * zorlaştırıyor ise, bizde aynı istisnayı throws ile fırlatarak kullanırız.
         * 2. Yöntem: ilgili kodun try..catch ile kontrol altına alınması.
         */
        // Checked Exception
        try{
            getTime();
        }catch (Exception exception){
            System.err.println("Bir sorun oluştu");
        }

        System.out.println("Gelen İfade....: " + getIfade());

        /**
         * UnChecked Exception method hata fırlatabilir ancak bunun compiler time
         * da kontrol edilmesine gerek yoktur. Developer ın inisiyatifine bırakılmıştır.
         *
         */
        System.out.println("5 : 2 = "+ bolum(5,0));

    }

    private static Long getTime() throws InterruptedException{
        Long time = System.currentTimeMillis();
        // waiting
        Thread.sleep(2000L);

        Long elapsedTime = System.currentTimeMillis() - time;
        return elapsedTime;
    }
    private static String getIfade(){
        String defaultConnection = "Ankara";
        BufferedReader br;
        try{
            br = new BufferedReader(new FileReader("/Users/muhammetalikaya/BILGEADAM_DATAS/Java_Boost_HS2/Java_Temel_Konular/J040_Exceptions_Istisnalar/src/main/resources/connnectionAddress.txt"));
            String dv = br.readLine();
            br.close();
            defaultConnection = dv;
        }catch (FileNotFoundException exception){
            System.err.println("İlgili dosya yok.");
        }catch (IOException exception){
            System.err.println("Belge okunamadı.");
        }

        return defaultConnection;
    }

    private static int bolum(int s1, int s2) throws ArithmeticException{
        int sonuc = s1 / s2;
        return sonuc;
    }
}
