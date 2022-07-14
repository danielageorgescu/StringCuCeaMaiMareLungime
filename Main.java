package com.itfactory;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> cuvinte = new ArrayList<>();
        cuvinte.add("leu");
        cuvinte.add("elefant");
        cuvinte.add("crocodil");
        cuvinte.add("rinocer");
        cuvinte.add("tigru");
        cuvinte.add("jaguar");
        cuvinte.add("girafa");
        cuvinte.add("pantera");
        cuvinte.add("ras");
        cuvinte.add("lemur");
        cuvinte.add("koala");
        cuvinte.add("bizon");
        cuvinte.add("hipopotan" );

        String cuvantLung = cuvinte.get(2);
        for (String max : cuvinte) {
            if (max.length() > cuvantLung.length()) {
                cuvantLung= max;
                System.out.println(cuvantLung.length()+ " "+ max);
            }
       }
    }
}
