package Grup4Calismalarimiz.Inheritance_Abstraction;

public abstract class Hesaplamalar {
    double deger1;
    double deger2;
    final double PI = 3.14;


    public Hesaplamalar(double deger1, double deger2) {
        this.deger1 = deger1;
        this.deger2 = deger2;


    }

    public abstract void alanHesapla();


    public abstract void cevreHesapla();


    public void showInfo() {
        System.out.println("deger1 = " + deger1);
        System.out.println("deger2 = " + deger2);

    }


}
