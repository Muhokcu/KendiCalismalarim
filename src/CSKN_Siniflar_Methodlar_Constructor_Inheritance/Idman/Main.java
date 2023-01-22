package CSKN_Siniflar_Methodlar_Constructor_Inheritance.Idman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Idman programina hos geldiniz...");
        String idmanlar = "Gecerli Hareketler...\n"
                + "Burpee\n"
                + "Pushup(Sinav\n"
                + "Situp(Mekik)\n"
                + "Squat";
        System.out.println(idmanlar);
        System.out.println("Bir idman olusturun");
        System.out.println("Burpee Sayisi : ");
        int burpee = scanner.nextInt();
        System.out.println("Pushup Sayisi : ");
        int pushup = scanner.nextInt();
        System.out.println("Situp Sayisi : ");
        int situp = scanner.nextInt();
        System.out.println("Squat Sayisi : ");
        int squat = scanner.nextInt();
        scanner.nextLine();


        Idman1 idman1 = new Idman1(burpee, pushup, situp, squat);
        System.out.println("Idmanininiz basliyor");

        while (idman1.idmanBittiMi() == false) {
            System.out.println("Hareket Turu (Burpee, Pushup,Situp,Squat) : ");
            String tur = scanner.nextLine();
            System.out.println("Bu hareketten kac tane yapilacak : ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman1.hareketYap(tur, sayi);


        }

    }
}
