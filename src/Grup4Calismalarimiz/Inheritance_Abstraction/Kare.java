package Grup4Calismalarimiz.Inheritance_Abstraction;

public class Kare extends Hesaplamalar {


    @Override
    public void alanHesapla() {
        double AlanKare = deger1 * deger1;
        System.out.println("Karenin Alani = " + AlanKare);


    }

    @Override
    public void cevreHesapla() {
        double CevreKare = 4 * deger1;
        System.out.println("Karenin Cevresi  = " + CevreKare);

    }

    public Kare(double deger1, double deger2) {
        super(deger1, deger2);
    }
}
