package Grup4Calismalarimiz.Inheritance_Abstraction;

public class Cember extends Hesaplamalar {

    @Override
    public void alanHesapla() {
        double cemberAlan = this.PI * deger1 * deger1;
        System.out.println("Cemberin Alan = " + cemberAlan);

    }

    @Override
    public void cevreHesapla() {
        double cemberCevre = 2 * this.PI * deger1;
        System.out.println("Cember Cevresi = " + cemberCevre);

    }

    public Cember(double deger1, double deger2) {
        super(deger1, deger2);
    }
}
