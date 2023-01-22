package Hersey;

public class HarfAyiklama {
    public static void main(String[] args) {
        //verilen String iceisindeki harfleri ayiklayarak anlamli bir metin olusturan method yaziniz
        //"(((S&a**_mp24i7y3||/o--n= %B%^*9e[s]}i!@$,,<k>**$%t<@£$ %a>>>$s@777.||}{";

        String metin = "(((s&a**_mp24i7y3||/on--= %G%a^*9l[a]t}as!@$,,<>*a*$%<@£$%>>>$@r777a.|y| o}l{u&&r@@";

        System.out.println("Umarim " + harfleriAyikla(metin));

    }

    public static String harfleriAyikla(String metin) {
        String newStr = "";
        for (int i = 0; i < metin.length(); i++) {
            if (Character.isAlphabetic(metin.charAt(i)) || metin.charAt(i) == ' ') {
                newStr += metin.charAt(i);


            }
        }
        return newStr;

    }

}
