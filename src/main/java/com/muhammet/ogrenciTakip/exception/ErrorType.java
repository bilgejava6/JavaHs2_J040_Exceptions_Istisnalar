package com.muhammet.ogrenciTakip.exception;

public enum ErrorType {

    NOT_FOUND_OGRENCI(100, "Öğrenci Bulunamadı"),
    ZATEN_KAYITLI(101, "Öğrenci zaten kayıtlıdır"),
    BILGILER_HATALIDIR(102, "Girilen bilgiler hatalıdır."),
    BEKLENMEYEN_HATA(500, "Beklenmeyen bir hata oldu, lütfen iletişime geçin");

    private int code;
    private String message;

    ErrorType(int code, String message) {
        this.code = code;
        this.message = message;
    }
    public int getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }

}
