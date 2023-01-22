package Kodlama_Vakti.Methodlar;

public class D1Giris {
    public static void main(String[] args) {
        //f(x) = (x + 2) * 6;
        f(4);
        //System.out.println("Ikinci method");
        f(9);

        power(2, 3);
        power(5, 2);
    }

    static void f(int x) {
        int result = (x + 2) * 6;
        // System.out.println("1. result sonucu = " + result);
        //System.out.println("2. result sonucu = " + result);

    }

    static void power(int number1, int number2) {//USLU SAYI HESAPLAMA
        int result = 1;
        for (int i = 1; i <= number2; i++) {
            result *= number1;

        }
        System.out.println("Uslu ifadenin sonucu : " + result);

    }

}
