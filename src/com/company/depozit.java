package com.company;

import java.util.Scanner;

public class depozit implements Interface {
    public void srok(){
        System.out.print("Введите срок в годах - ");
    }
    public void depozit1() {
        double S;
        Scanner sc = new Scanner(System.in);
        double years = sc.nextDouble();
        if (years <= 0) {
            System.out.println("Срок не может быть меньше нуля");
            return;
        }
        System.out.print("Введите процентную ставку - ");
        double I = sc.nextDouble();
        if (I <= 0) {
            System.out.println("Процентная ставка не может быть меньше нуля");
            return;
        }
        int P;
        System.out.print("Введите первоначальный вклад - ");
        P = sc.nextInt();
        if (P <= 1000) {
            System.out.println("Первоначальный вклад должен быть не меньше 1000тг");
            return;
        }
        System.out.print("Введите ежемесячный вклад - ");
        int MonthPay = sc.nextInt();
        for (int i = 0; i < years * 12; i++) {
            P += MonthPay;
        }
        S = (P * I * (years * 365) / 365) / 100;
        System.out.println("Доход за все время = " + S);
    }
    public void vyvod(){
        System.out.println("Начинается код депозита!");
    }

}
