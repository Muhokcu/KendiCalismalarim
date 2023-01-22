package Calismalar;

public class BelliHarfleBaslayanKelimeleriBulma {
    public static void main(String[] args) {
        String[] sehirler = {"Malatya", "Mus", "Adana", "Mardin", "Ankara", "Agri"};
        String ist = sehirler[0];

        for (String AileBaslayan : sehirler) {
            if (AileBaslayan.startsWith("A")) {

                System.out.println("A ile Baslayan = " + AileBaslayan);
            }

        }
        for (String MileBaslayan : sehirler) {
            if (MileBaslayan.startsWith("M")) {
                System.out.println("M ile Baslayan = " + MileBaslayan);
            }
        }


    }
}
