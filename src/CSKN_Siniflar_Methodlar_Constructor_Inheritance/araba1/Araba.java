package CSKN_Siniflar_Methodlar_Constructor_Inheritance.araba1;


public class Araba {
    private String renk;
    private int kapilar;
    private int tekerlekler;
    private String motor;
    private String model;

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public void setKapilar(int kapilar) {
        if (kapilar < 0) {
            System.out.println("Kapi sayisi 0 dan kucuk olamaz");
        } else {
            this.kapilar = kapilar;
        }

    }

    public void setTekerlekler(int tekerlekler) {
        if (tekerlekler < 0) {
            System.out.println("Tekerlekler 0 dan kucuk olamaz");
        } else {
            this.tekerlekler = tekerlekler;
        }
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getRenk() {
        return renk;
    }

    public int getKapilar() {
        return kapilar;
    }

    public int getTekerlekler() {
        return tekerlekler;
    }

    public String getMotor() {
        return motor;
    }

    public void setModel(String model) {
        this.model = model;


    }

    public String getModel() {
        return this.model;
    }
}