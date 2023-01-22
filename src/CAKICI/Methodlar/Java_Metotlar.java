package CAKICI.Methodlar;

public class Java_Metotlar {
    public static void main(String[] args) {
        System.out.println("(20*11) = " + benimMethodum(20, 11));
        System.out.println(topla(8, 10, " Mevlut"));

    }

    static int benimMethodum(int sayi1, int sayi2) {

        System.out.println("a+b = " + (sayi1 + sayi2));
        return sayi1 * sayi2;
    }

    static String topla(int rak1, int rak2, String isim) {
        int toplam = rak1 + rak2;
        return "Sonuc = " + toplam + "" + isim;

    }

}
