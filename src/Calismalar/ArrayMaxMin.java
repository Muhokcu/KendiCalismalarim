package Calismalar;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] sayilar = {100, 195, 225, 14, 2, 5, 100, 20, 30, 40, 100, 150};
        int toplam = 0;
        int max = sayilar[0];
        int min = sayilar[0];
        for (int sayi : sayilar) {
            if (sayi > max) {
                max = sayi;
            }
        }
        System.out.println("max = " + max);

        for (int sayi : sayilar) {
            if (sayi < min) {
                min = sayi;
            }
        }
        System.out.println("min = " + min);
        for (int sayi : sayilar) {
            toplam = sayi + toplam;
            System.out.println("toplam = " + toplam);

        }
       // System.out.println("toplam = " + toplam);
    }
}
