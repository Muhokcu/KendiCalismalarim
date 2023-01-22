package metotlar_overloading;

public class Method_Overloading {
    public static void main(String[] args) {
        System.out.println(toplama(10, 11));

        System.out.println(toplama(10, 10, 10));
    }

    public static int toplama(int a, int b) {

        return (a + b);

    }

    public static int toplama(int a, int b, int c) {

        return (a + b + c);


    } //   BURAYI ANLAMADIM TEKRAR ET
}

