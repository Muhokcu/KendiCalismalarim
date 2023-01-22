package Calismalar;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] sehirler = {"Istanbul", "Trabzon", "Adana", "Hatay", "Ankara", "Erzurum"};
        System.out.println("Arrays.toString(sehirler) = " + Arrays.toString(sehirler));
        for (String sehir : sehirler) {
            System.out.println("sehir = " + sehir);
        }
        int[] sayilar = {100, 2, 5, 100, 20, 30, 40, 100, 150};
        System.out.println("Arrays.toString(sayilar) = " + Arrays.toString(sayilar));
        for (int sayi : sayilar) {
            System.out.println("sayilar = " + sayi);

        }
        int i= 0;
        for (String sehir : sehirler){
            i++;
        }
        System.out.println("i = " + i);
        System.out.println("sehirler.length = " + sehirler.length);
        int sayac= 0;
        for (int n : sayilar){// sayilarin arrayin icindeki 25 den veya istedigimiz degerden kucuk sayilari buluyoruz
            if (n<25){
                System.out.println("n = " + n);
                sayac++;
            }

        }

    }
}
