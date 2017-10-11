package pl.szczypka.blazej.lesson01;

import java.util.Scanner;

public class FirstClass {

    public static void main(String[] args) {


        //int age = Integer.parseInt(czytnik.nextLine());

        //aging();
        System.out.println("Przykładowy tekst");
        method();
        int s = 0;
        s = sum(2, 77);
        System.out.println(s);
    }

    public static void method() {
        System.out.println("Jestem metodą");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void aging() {
        Scanner czytnik = new Scanner(System.in);
        String text = czytnik.nextLine();
        System.out.println("Mat lat: " + text);
    }
}