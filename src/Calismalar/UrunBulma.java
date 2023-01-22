package Calismalar;

import java.util.Scanner;

public class UrunBulma {
    public static void main(String[] args) {
        // Kullanicidan bir urun alip, istenen urunun markette olup olmadigini bildiren bir program yaziniz

        String[] urunler = {"Ekmek", " Peynir", "Sucuk", "Kavun", "Nane", "Marul", "Erik", "Eier"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Istediginiz urunu giriniz = ");
        String talep = sc.nextLine();
        boolean flaq = false;

        for (int i = 0; i < urunler.length; i++) {
            if (urunler[i].equals(talep)) {
                flaq = true;
                break;
            }
        }

        if (flaq) {
            System.out.println("Aradiginiz urun mevcuttur");
        } else {
            System.out.println("Aradiginiz urun mevcut degildir");

        }

    }


}
