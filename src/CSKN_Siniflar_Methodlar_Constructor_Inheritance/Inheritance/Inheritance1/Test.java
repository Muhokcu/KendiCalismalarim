package CSKN_Siniflar_Methodlar_Constructor_Inheritance.Inheritance.Inheritance1;

public class Test {
    public static void main(String[] args) {
        Yonetici yonetici1 = new Yonetici("Muhammet Okcu", 3000, "It", "Rabia");
        yonetici1.bilgileriGoster();
        yonetici1.zam_yap(200);
        yonetici1.calis();
        yonetici1.departman_degistir("Zuccaciye");

    }
}
