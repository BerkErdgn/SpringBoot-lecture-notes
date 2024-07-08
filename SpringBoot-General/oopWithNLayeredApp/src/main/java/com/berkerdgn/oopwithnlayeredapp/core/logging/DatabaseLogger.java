package com.berkerdgn.oopwithnlayeredapp.core.logging;

public class DatabaseLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Veritanabına loglandı: " + data);
    }
}
