package metotlar_overloading;

public class AsalSayilar {
    public static void main(String[] args) {

        // 1 den 1000 e kadar olan asil sayilari ekrana yazdir

        for (int i = 2; i < 50; i++) {
            if (asalMi(i)) {
                System.out.println("asal sayi : " + i);
            }

        }


    }

    public static boolean asalMi(int sayi) {
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                return false;
            }

        }
        return true;


    }
}
