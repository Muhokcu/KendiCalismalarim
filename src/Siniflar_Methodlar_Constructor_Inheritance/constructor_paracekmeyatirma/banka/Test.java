package Siniflar_Methodlar_Constructor_Inheritance.constructor_paracekmeyatirma.banka;

public class Test {
    public static void main(String[] args) {
        Account account1 = new Account();


        account1.setHesapNo("123456");
        // account1.setBakiye(1000);
        account1.setIsim("Muhammet Okcu");
        System.out.println("Hesap Ismi = " + account1.getIsim());
        System.out.println("Hesap Numarasi = " + account1.getHesapNo());
        account1.setEmail("muhokcu@gmail.com");
        account1.setTelefonNo("01791546466");
        // System.out.println("Bakiye " + account1.getBakiye());


        Account account2 = new Account("12345678", 10000, "Muhammet Okcu", "muhokcu@gmail.com", "0179341633");

        account2.paraYatir(5500);
        account2.paraCekme(100);
        account2.paraYatir(2500);
        account2.paraCekme(1600);
        account2.paraYatir(5500);
        account2.paraYatir(575);
        account2.paraCekme(1000);


    }


}
