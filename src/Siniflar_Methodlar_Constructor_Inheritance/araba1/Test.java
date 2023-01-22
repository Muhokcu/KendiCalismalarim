package Siniflar_Methodlar_Constructor_Inheritance.araba1;

public class Test {
    public static void main(String[] args) {
        Araba araba1 = new Araba();

        araba1.setModel("Mercedes");
        System.out.println("Arabanin Modeli : " + araba1.getModel());
        araba1.setKapilar(4);
        System.out.println("Arabanin kapi sayisi : " + araba1.getKapilar());
        araba1.setTekerlekler(3);
        System.out.println("Arabanin lastik sayisi : " + araba1.getTekerlekler());
        araba1.setRenk("Siyah");
        System.out.println("Arabanin Rengi : " + araba1.getRenk());
        araba1.setMotor("Benzinli");
        System.out.println("Arabanin Motoru : " + araba1.getMotor());


    }
}
