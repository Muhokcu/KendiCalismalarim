package metotlar_overloading;

import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {
        //method overloading kullanarak hesap makinasi yapin
        // toplama ve carpma methodlarini 2 veya 3 parametre kullanarak yapin

        Scanner scanner = new Scanner(System.in);
        String islemler = "1. Cikarma Islemi\n"
                + "2. Toplama Islemi\n"
                + "3. Carpma Islemi\n"
                + "4. Bolme Islemi\n"
                + "Islem yapmak istemiyorsaniz q ya basin";
        System.out.println("Muhammetin Hesap Makinasina Hos Geldiniz");
        System.out.println("Lutfen yapmak istediginiz islemin sayi numarasini giriniz");
        System.out.println(islemler);
      //  System.out.println("********************************************");
        while (true) {
            System.out.println("Islemi seciniz : ");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("Programdan Cikiliyor");
                break;

            } else if (islem.equals("1")) {
                System.out.println("Kac deger Toplayacaksiniz ? (2 veya 3 olmali)");
                int kacSayi = scanner.nextInt();
                if (kacSayi == 2) {
                    System.out.println("a : ");
                    int a = scanner.nextInt();
                    System.out.println("b : ");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girililen sayilarin toplamlari : " + (toplama(a, b)));


                } else if (kacSayi == 3) {
                    System.out.println("a : ");
                    int a = scanner.nextInt();
                    System.out.println("b : ");
                    int b = scanner.nextInt();
                    System.out.println("c : ");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girlilen sayilarin toplamlari : " + (toplama(a, b, c)));


                } else {
                    System.out.println("Bunun icin uygu  method bulunmamaktadir");
                }

            } else if (islem.equals("2")) {
                System.out.println("a : ");
                int a = scanner.nextInt();
                System.out.println("b : ");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Girilen sayilarin Farklari : " + cikarma(a, b));

            } else if (islem.equals("3")) {
                System.out.println("Kac Deger Carpacaksiniz? 2 veya 3 olabilir");

                int kacSayi = scanner.nextInt();
                if (kacSayi == 2) {
                    System.out.println("a : ");
                    int a = scanner.nextInt();
                    System.out.println("b : ");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girlilen sayilarin carpimi : " + (carpma(a, b)));

                } else if (kacSayi == 3) {
                    System.out.println("a : ");
                    int a = scanner.nextInt();
                    System.out.println("b : ");
                    int b = scanner.nextInt();
                    System.out.println("c : ");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girlilen sayilarin carpimlari : " + (carpma(a, b, c)));


                }
            } else if (islem.equals("4")) {
                System.out.println("a : ");
                int a = scanner.nextInt();
                System.out.println("b : ");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Girilen sayilarin bolumu : " + bolme(a, b));


            } else {
                System.out.println("Gecersiz islem\n" +
                        "Lutfen 5 ten kucuk bir sayi giriniz");

            }
        }
    }

    public static int cikarma(int a, int b) {
        return (a - b);

    }

    public static int toplama(int a, int b) {
        return (a + b);

    }

    public static int toplama(int a, int b, int c) {
        return (a + b + c);

    }

    public static int carpma(int a, int b) {
        return ((int) a * b);

    }

    public static int carpma(int a, int b, int c) {
        return ((int) a * b * c);
    }

    public static double bolme(int a, int b) {
        return ((double) a / b);

    }


}
