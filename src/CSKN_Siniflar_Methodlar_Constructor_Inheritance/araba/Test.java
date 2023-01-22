package CSKN_Siniflar_Methodlar_Constructor_Inheritance.araba;

public class Test {
    public static void main(String[] args) {
        Araba araba1 = new Araba();
        araba1.renk = "Kirmizi";
        araba1.kapilar = 4;
        araba1.tekerlekler = 4;
        araba1.motor = "Dizel";
        araba1.model = "BMW";

        System.out.println("Arabanin modeli : " + araba1.model);
        System.out.println("Arabanin motoru : " + araba1.motor);
        System.out.println("Arabanin rengi : " + araba1.renk);
        System.out.println("Arabanin kapi sayisi : " + araba1.kapilar);
        System.out.println("Arabanin teker sayisi : " + araba1.tekerlekler);


    }
}
