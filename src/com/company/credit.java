package com.company;
import java.util.Scanner;

public class credit extends depozit implements Interface{
    private String goal;

    public credit(String goal){
        super("Mashina");
        this.goal = goal;
    }

    public void srok(){
        System.out.print("Введите срок кредита в годах - ");
    }
    public void credit1() {
        double S;
        double mesyachnaya_pereplata;
        Scanner sc = new Scanner(System.in);
        double years = sc.nextDouble();
        if (years <= 0) {
            System.out.println("Срок не может быть меньше или равен нулю.");
            System.out.println("Начните заново!");
            return;
        }
        years *= 12;
        System.out.print("Введите процентную ставку -");
        double I = sc.nextDouble();
        if (I <= 0) {
            System.out.println("Процентная ставка не может быть меньше или равна нулю.");
            System.out.println("Начните заново!");
            return;
        }
        I /= 100;
        System.out.print("Введите сумму кредита -");
        int P = sc.nextInt();
        if (years <= 0) {
            System.out.println("Сумма кредита не может быть меньше или равна нулю.");
            System.out.println("Начните заново!");
            return;
        }
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
    public String getName() {
        return goal;
    }

    public void setName(String name) {
        this.goal = goal;
    }

}