package j07_StringManipulation.Tasks;

public class Task06_equals_IgnoreCase {

    public static void main(String[] args) {



         /*  apple  olan  bir String oluşturun.
            String'in apple'a eşit olup olmadığını doğrulayın.
            Büyük harf veya küçük harf önemli değildir.    */

        //Kodu aşağıya yazınız.

        String str5 = "apple";

        String str6 = "Apple";
        System.out.println(str5.equalsIgnoreCase(str6));
        System.out.println("str5 = " + str5.toUpperCase());

        if (str5.equalsIgnoreCase(str6)) {
    System.out.println("eşit");
} else System.out.println("eşit değil");




         /*  Florida kelimesinden bir String oluşturun.
            Florida kelimesinin içindeki, sadece  'o'  harfinin bulunduğu indexini yazdırın.  */

        //Kodu aşağıya yazınız.



    }
}
