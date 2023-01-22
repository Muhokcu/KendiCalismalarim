package metotlar_overloading;

public class Toplama {
    public static void main(String[] args) {
        toplama(3, 4, 5);
        toplama(30, 40, 50);


    }

    public static void toplama(int a, int b, int c) {
        System.out.println("Toplam sonuc : " + (a + b + b));

    }
}
