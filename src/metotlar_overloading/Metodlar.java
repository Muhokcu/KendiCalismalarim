package metotlar_overloading;

public class Metodlar {

    public static void selamlama(String isim) {


        System.out.println("Selamlar... " + isim);
    }

    public static void main(String[] args) {

        selamlama("Murat");
        selamlama("Muhammet");

    }
}
