package Grup4Calismalarimiz.Grup4_devam;

public class Personel {

    String ad;
    String soyAd;
    private String email;
    private int dogumYili;
    private int kilo;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public void setDogumYili(int dogumYili) {
        this.dogumYili = dogumYili;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public Personel(String ad, String soyAd, String email, int dogumYili, int kilo) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.email = email;
        this.dogumYili = dogumYili;
        this.kilo = kilo;




    }
}

