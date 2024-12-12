package com.muhammet;

public class Runner_Throw_Kullanimi {
    public static void main(String[] args) {
        try{
            String gizlenmisSifre =  securePassword("muh*?");
            System.out.println("gizli şifre....: "+ gizlenmisSifre);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
    /**
     * Girilen şifrenini kriptolanarak dönmesini sağlar
     * @param password - 8-16 karakter aralığında bir şifre giriniz.
     * @return kriptolanmış değer String olarak dönülür
     */
    private static String securePassword(String password) throws Exception {
        if(password.length()<8 || password.length()>16) {
            // sorunlu bir durum şifre kriptolanamaz.
            // checked exception
            throw new Exception("Şifre 8-16 arası karaktere sahip olmalıdır.");
        }else if(!password.contains("*") && !password.contains("?")) {
            throw  new Exception("şifre de özel karakter bulunmalıdır");
        }else{
            return "'^+fcsdffTGHGHHF(9764";
        }
    }


}
