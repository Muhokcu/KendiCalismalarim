package Grup4Calismalarimiz.Inheritance_Abstraction;

public class Dikdortgen extends Hesaplamalar {


    @Override
    public void alanHesapla() {
        double alandikDortgen = deger1 * deger2;
        System.out.println("Dikdortgenin Alani = " + alandikDortgen);

    }

    @Override
    public void cevreHesapla() {
        double cevreDikdortgen = (2 * deger1) + (2 * deger2);
        System.out.println("Dikdortgenin Cevresi = " + cevreDikdortgen);

    }

    public Dikdortgen(double deger1, double deger2) {
        super(deger1, deger2);
    }
}
