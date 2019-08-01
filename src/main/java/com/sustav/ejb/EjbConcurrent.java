package com.sustav.ejb;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import javax.ejb.AccessTimeout;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;

@Singleton
@AccessTimeout(20)
public class EjbConcurrent {
    private int i;

    @Lock(LockType.READ)
    public int getI() {
        return i;
    }

    @Lock(LockType.WRITE)
    public int setI(int i) {
        return  this.i = i;
    }

    public int increate() {
        return ++i;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                URLConnection urlConnection = null;
                try {
                    urlConnection = new URL("http://localhost:8081/tomeetest/ejbcon").openConnection();
                    Scanner scanner = new Scanner(urlConnection.getInputStream());
                    while (scanner.hasNext()) {
                        System.out.println(scanner.next());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
