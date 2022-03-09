package com.mycompany.methodoverloadinghesapmakinesi;

import java.util.Scanner;

public class Test {

    /*
    Method Overloading kullanak bir tane hesap makinesi tasarlamaya calisin.
    Toplama ve carpma metodlarini 2 veya 3 parametre alacak sekilde tasarlayin.

     */
    public static int cikarma(int a, int b) {

        return (a - b);

    }

    public static double bolme(int a, int b) {
        return ((double) a / b);

    }

    public static int toplama(int a, int b) {

        return (a + b);

    }

    public static int toplama(int a, int b, int c) {

        return (a + b + c);
    }

    public static int carpma(int a, int b) {

        return a * b;
    }

    public static int carpma(int a, int b, int c) {
        return a * b * c;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String islemler = "1. Toplama islemi\n"
                + "2. Cikarma islemi\n"
                + "3. Carpma islemi\n"
                + "4. Bolme islemi\n"
                + "Cikis icin q'ya basin.";
        System.out.println("****************************************");
        System.out.println(islemler);
        System.out.println("****************************************");

        while (true) {
            System.out.println("Islemi Seciniz : ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan cikiliyor...");
                break;
            } else if (islem.equals("1")) {
                System.out.println("Kac deger toplayacaksiniz ? (2 veya 3): ");
                int kacsayi = scanner.nextInt();

                if (kacsayi == 2) {
                    System.out.println("a:");
                    int a = scanner.nextInt();
                    System.out.println("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Girilen sayilarin toplamlari : " + (toplama(a, b)));

                } else if (kacsayi == 3) {
                    System.out.println("a:");
                    int a = scanner.nextInt();
                    System.out.println("b:");
                    int b = scanner.nextInt();
                    System.out.println("c:");
                    int c = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Girilen sayilarin toplamlari : " + (toplama(a, b, c)));

                } else {

                    System.out.println("Bunun icin uygun metod bulunmuyor...");
                }

            } else if (islem.equals("2")) {
                System.out.println("a:");
                int a = scanner.nextInt();
                System.out.println("b:");
                int b = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Girilen Sayilari Farklari : " + cikarma(a, b));

            } else if (islem.equals("3")) {
                System.out.println("Kac deger carpacaksiniz ? (2 veya 3): ");
                int kacsayi = scanner.nextInt();

                if (kacsayi == 2) {
                    System.out.println("a:");
                    int a = scanner.nextInt();
                    System.out.println("b:");
                    int b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Girilen sayilarin carpimlari : " + (carpma(a, b)));

                } else if (kacsayi == 3) {
                    System.out.println("a:");
                    int a = scanner.nextInt();
                    System.out.println("b:");
                    int b = scanner.nextInt();
                    System.out.println("c:");
                    int c = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Girilen sayilarin carpimlari : " + (carpma(a, b, c)));

                } else {

                    System.out.println("Bunun icin uygun metod bulunmuyor...");
                }

            } else if (islem.equals("4")) {
                System.out.println("a:");
                int a = scanner.nextInt();
                System.out.println("b:");
                int b = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Girilen Sayilarin Bolumu : " + bolme(a, b));

            } else {
                System.out.println("Gecersiz islem...");
            }

        }

    }

}
