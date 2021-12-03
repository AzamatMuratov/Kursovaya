package com.company;

import java.util.Scanner;

public class depozit {
    public void depozit1() {
        double S;
        Scanner sc = new Scanner(System.in);
        System.out.print("vvedite na skolko let depozit -");
        double years = sc.nextDouble();
        System.out.print("vvedite procent v god -");
        double I = sc.nextDouble();
        int P;
        System.out.print("vvedite summu vklada -");
        P = sc.nextInt();
        System.out.print("vvedite ezhemesyachniy vklad -");
        int MonthPay = sc.nextInt();
        for (int i = 0; i < years * 12; i++) {
            P += MonthPay;
        }
        S = (P * I * (years * 365) / 365) / 100;
        System.out.println("dohod za vse vremya =" + S);
    }
}

