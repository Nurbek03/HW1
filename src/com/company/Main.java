package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String myFavoritefood = "";
        final int nam = 2;
        String word = "Food";
        myFavoritefood= nam+word;

        System.out.println(myFavoritefood+" "+nam+" " +word);
        if (nam < 0) {
            System.out.println("Вы сохранил отрицтвельное число");
        } else {
            System.out.println("Вы сохранили положитеьное число");
        }

    }
}