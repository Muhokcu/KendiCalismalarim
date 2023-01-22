package CSKN_Siniflar_Methodlar_Constructor_Inheritance.Inheritance.Inheritance2;

public class Kopek extends Hayvan {
    private int disSayisi;

    public Kopek(String isim, int boy, int kilo, int bacakSayisi, int i) {
        super(isim, boy, kilo, bacakSayisi);
        this.disSayisi = disSayisi;

    }

    public void kos(int hiz) {
        System.out.println("Kopek kosuyor");

        hareketeGec(hiz);// burda override ediyoruz
    }

    public int getDisSayisi() {
        return disSayisi;
    }

    public void setDisSayisi(int disSayisi) {
        this.disSayisi = disSayisi;



    }

}
