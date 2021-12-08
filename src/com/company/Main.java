package com.company;

public class Main {
    public static void main(String[] args) {
        depozit aqsha = new depozit();
        credit aqsha1 = new credit();
        Interface d1 = new depozit();
        Interface c1 = new credit();
        d1.vyvod();
        aqsha.srok();
        aqsha.depozit1();
        c1.vyvod();
        aqsha1.srok();
        aqsha1.credit1();
    }
}