package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String text;
        final int num = 10;
        String word = "clown ";
        text = num + word;

        System.out.println(text);

        if (num < 0){
            System.out.println("Вы сохранили отрицательное число");
        } else {
            System.out.println("Вы сохранили положительное число");

        }
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите ваше имя:");
        String name = in.next();

        System.out.println("Привет " + name);

        /*if (Objects.equals(name, "Clown")){
            System.out.println("Привет " + name);
        }*/

    }
}
