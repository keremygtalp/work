package j07_StringManipulation;

public class C13_RageksCharacters {

    public static void main(String[] args) {

        //(Regular Expressions)
        //   \\s bosluk (
        //   \\S bosluk disindaki tum karakterler
        //   \\w harfler ve rakamlar (a z A Z, 0 9)
        //   \\W harfler ve rakamlar disindaki tum karakterler
        //   \\d rakamlar 0 9
        //   \\D rakamlar disindaki tum karakterler


        //Write code here

        String b = "Java 1235 ?!@$_";

        // \\d ifadesi tum rakamlari(digit) temsil eder.
        System.out.println(b.replaceAll("\\d","*"));//
        System.out.println(b);
// ===>  \\D rakamlardisindaki hersey
        System.out.println(b.replaceAll("\\D","*"));// *****1235*****

//==> \\S space disindaki hersey
        System.out.println(b.replaceAll("\\S","*")); // **** **** *****

//==> \\s space ifadesidir.
        System.out.println(b.replaceAll("\\s","*")); //Java*1235*?!@$_
// replace ile yapma *************************************************************************
        System.out.println(b.replace(" ","*"));  //Java*1235*?!@$_

//==>  \\w ifadesi (word->kelime ve hadf) a-z A-Z 0-9 _  bunlari kapsar
        System.out.println(b.replaceAll("\\w","*")); //**** **** ?!@$*

//==>  \\W ifadesi a-z A-Z 0-9 _ disindakileri kapsar

        System.out.println(b.replaceAll("\\W","*")); // Java*1235*****_










    }
}