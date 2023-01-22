package CSKN_Siniflar_Methodlar_Constructor_Inheritance.Inheritance.Inheritance1;

public class Yonetici extends Calisan {
    private String sorumlu_kisi;

    public Yonetici(String isim, int maas, String departman, String sorumlu_kisi) {
        super(isim, maas, departman);
        this.sorumlu_kisi=sorumlu_kisi;

    }
    public void zam_yap(int zam_miktari){
        System.out.println("Calisanlara " + zam_miktari + " tl zam yapildi");
    }
    public void bilgileriGoster(){
//        System.out.println("getIsim() = " + getIsim());
//        System.out.println("getDepartman() = " + getDepartman());
//        System.out.println("getMaas() = " + getMaas());
        super.bilgileriGoster();

       System.out.println("this.sorumlu_kisi = " + this.sorumlu_kisi);


    }


}
