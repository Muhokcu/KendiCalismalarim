package Calismalar;

import java.util.Scanner;

public class AlisVerisListesi {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("= Listemiz = ");
        String[] eksikler = new String[3];

        System.out.println(" Eksikleri Yaziniz");
        for (int i = 0; i < eksikler.length; i++) {
            System.out.print(i + 1 + " . urun = ");
            eksikler[i] = sc.nextLine();

        }
        System.out.println(" = Sectiginiz Urun Listesi = ");
        for (int i = 0; i < eksikler.length; i++) {
            System.out.println("eksikler " + eksikler[i]);
        }
    }
}
