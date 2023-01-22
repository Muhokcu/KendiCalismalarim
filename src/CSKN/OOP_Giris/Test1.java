package CSKN.OOP_Giris;

public class Test1 {
    public static void main(String[] args) {
        Araba araba1 = new Araba();
        //araba1.model = "BMW";
        //  System.out.println("araba1.model = " + araba1.model);
        araba1.setModel("Opel");
        System.out.println("araba1.getModel() = " + araba1.getModel());
        araba1.setKapilar(3);
        System.out.println("araba1.getKapilar() = " + araba1.getKapilar());
        araba1.setRenk("Siyah");
        System.out.println("araba1.getRenk() = " + araba1.getRenk());
        araba1.setTekerlekler(1);
        System.out.println("araba1.getTekerlekler() = " + araba1.getTekerlekler());
        araba1.setMotor("2.0 TDI");
        System.out.println("araba1.getMotor() = " + araba1.getMotor());

    }
}


