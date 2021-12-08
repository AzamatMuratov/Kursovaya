package com.company;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class credit extends depozit implements Interface{
    public void srok(){
        System.out.print("Введите срок кредита в годах - ");
    }
    public void credit1() {
        double S;
        double mesyachnaya_pereplata;
        Scanner sc = new Scanner(System.in);
        double years = sc.nextDouble();
        years *= 12;
        System.out.print("Введите процентную ставку -");
        double I = sc.nextDouble();
        I /= 100;
        System.out.print("Введите сумму кредита -");
        int P = sc.nextInt();
        double MonthPay;
        MonthPay = (P + (P * I)) / years;
        System.out.println("Ежемесячная оплата = " + MonthPay);
        S = ((years * MonthPay) * I) + (years * MonthPay) - P;
        System.out.println("Вы переплачиавете - " + S + " тенге");
        mesyachnaya_pereplata = S / years;
        System.out.println("Месячная переплата = " + mesyachnaya_pereplata);

    }
    public void vyvod(){
        System.out.println("Код Депозита закончился.");
        System.out.println("Начинается код про кредит!");
    }
}