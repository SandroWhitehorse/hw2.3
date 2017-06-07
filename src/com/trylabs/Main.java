package com.trylabs;

import java.util.Scanner;

public class Main {
     static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
System.out.println("Нужно ввести сумму покупки без скидки чтобы узнать сколько будет со скидкой:");
double sum = scanner.nextDouble();
if (sum > 1000){
sum=sum-(sum/100)*5;
System.out.println("У вас 5-ти процентная скидка!");
System.out.printf("Сумма со скидкой = %.2f",sum);}
else if (sum>500){
    sum=sum-(sum/100)*3;
    System.out.println("У вас 3-х процентная скидка!");
    System.out.printf("Сумма со скидкой = %.2f",sum);
}
else {System.out.println("Сумма ="+sum); }

    }
}
