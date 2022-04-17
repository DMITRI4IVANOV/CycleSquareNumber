package ru.netology.sqr;

public class SQRService {
    public static void main(String[] args) {
        for (int i = 10;i <= 99; i ++) {
            // int j = i * i;
            if ( i * i >= 200 && i * i <=300) {
                System.out.println("Квадратный корень из числа " + i);
            }
        }
        System.out.println("Вы вышли из цикла");
    }
}