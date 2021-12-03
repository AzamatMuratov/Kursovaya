package com.company;
import java.util.Scanner;

public class credit{
    public void credit1(){
        double S;
        double mesyachnaya_pereplata;
        Scanner sc = new Scanner(System.in);
        System.out.print("vvedite na skolko let kredit -");
        double years = sc.nextDouble();
        years*=12;
        System.out.print("vvedite procent -");
        double I = sc.nextDouble();
        I/=100;
        System.out.print("vvedite skolko berete -");
        int P = sc.nextInt();
        System.out.print("vvedite ezhemesyachnuy oplatu -");
        int MonthPay = sc.nextInt();
        S = ((years * MonthPay) * I) + (years* MonthPay) - P;
        System.out.println("pereplachivaete na - " + S + " tenge");
        mesyachnaya_pereplata=S/years;
        System.out.println("mesyachnaya pereplata = " + mesyachnaya_pereplata);
    }
}
