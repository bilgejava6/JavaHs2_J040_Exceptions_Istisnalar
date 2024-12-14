package com.muhammet.ogrenciTakip.exception;

public class OgrenciTakipException extends RuntimeException{

    public OgrenciTakipException(ErrorType errorType){
        super(errorType.getMessage());
    }

}
