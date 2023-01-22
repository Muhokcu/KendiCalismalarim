package Grup4Calismalarimiz.Inheritance_Abstraction;

public class Test {
    public static void main(String[] args) {

        Kare kare = new Kare(3, 5);
        kare.showInfo();
        kare.alanHesapla();
        kare.cevreHesapla();
        System.out.println("----------------------");
        Dikdortgen dikdortgen = new Dikdortgen(5, 10);
        dikdortgen.showInfo();
        dikdortgen.alanHesapla();
        dikdortgen.cevreHesapla();
        System.out.println("----------------------");
        Cember cember = new Cember(5, 6);
        cember.showInfo();
        cember.alanHesapla();
        cember.cevreHesapla();


    }
}
