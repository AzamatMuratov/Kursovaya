package com.company;

public class Main {
    public static void main(String[] args) {
        depozit aqsha = new depozit("Квартира");
        String Goal1 = aqsha.getName();
        System.out.println("Цель депозита - " + Goal1);
        credit aqsha1 = new credit("Машина");
        Interface d1 = new depozit("");
        Interface c1 = new credit("");
        d1.vyvod();
        aqsha.srok();
        aqsha.depozit1();
        c1.vyvod();
        String Goal = aqsha1.getName();
        System.out.println("Цель кредита - " + Goal);
        aqsha1.srok();
        aqsha1.credit1();
    }
}