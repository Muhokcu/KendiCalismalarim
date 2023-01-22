package metotlar_overloading;

import java.util.Scanner;

public class Ebob {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayi : ");
        int birinci_sayi = scanner.nextInt();

        System.out.println("Ikinci sayi : ");
        int ikinci_sayi = scanner.nextInt();

        System.out.println("Iki sayinin ebobu : " + ebob(birinci_sayi, ikinci_sayi));


    }

    public static int ebob(int sayi1, int sayi2) {
        int ebob = 1;
        for (int i = 1; i <= sayi1 && i <= sayi2; i++) {
            if ((sayi1 % i == 0) && (sayi2 % i == 0)) {

                ebob = i;
            }
        }
        return ebob;

    }
}
