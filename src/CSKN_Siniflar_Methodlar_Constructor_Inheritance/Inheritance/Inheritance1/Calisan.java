package CSKN_Siniflar_Methodlar_Constructor_Inheritance.Inheritance.Inheritance1;

public class Calisan {// superveya base class deniyor

    private String isim;
    private int maas;
    private String departman;

    public Calisan(String isim, int maas, String departman) {
        this.isim = isim;
        this.departman = departman;
        this.maas = maas;
    }

    public void calis() {
        System.out.println("Calisan calisiyor");
    }

    public void bilgileriGoster() {
        System.out.println("Isim : " + isim);
        System.out.println("maas : " + maas);
        System.out.println("departman : " + departman);

    }

    public void departman_degistir(String departman_degistir) {
        System.out.println("Departman Degistiriliyor......");
        this.departman = departman_degistir;
        System.out.println("Yeni departman = " + this.departman);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
