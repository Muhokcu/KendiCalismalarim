package metotlar_overloading;

public class Methodlarda_Return {
    public static void main(String[] args) {

        System.out.println("toplam : " + toplama(1, 2, 3));

    }

    public static int toplama(int a, int b, int c) {// void oldugu icin  deger dondurmuyor sadece icene aldigi degerleri ekrana bastiriyor
        // ancak biz bu cikan degeri baska yerde kullanmak istiyorsak return yapmaliyiz

        return (a + b + c);


    }
}
