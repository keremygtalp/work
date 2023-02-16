package j07_StringManipulation;

public class C01_Concatenation {

    public static void main(String[] args) {
        
        
        String qa = "Ali";
        String lead = "Kerem";

        System.out.println(qa.concat(lead)) ;// qa string sonunda lead string ile birleştirildi. alikerem


        
        // string metodları varıableyi kalıcı değil geçici değişiklik yapar stringte kalıcı değişiklik yapmak için
        //atama yapılır
        
        qa = qa.concat(lead);
        qa= lead.concat(qa);

        System.out.println(qa);

        
        /*
        concat metodu parametre olarak strig olarak bir daata ldığında üm dataları stirnge çevirip cocat eder.
        string, mürekkep gibi bulunduğu ortamda diğer dataları etkiler. bu özellik sadece concatta geçerli.
         */
        
        
        
        
        /*
        concat() -> methodu içinde parametre alığı String variable'yi çalşıtığı string sonuna ekler(birleştirir)
        Java '+' işleminde en az bir string ifade vars artimetik toplama değil birleştirme yapılır
         */
                //  DERS NOTLARI   //


//        String qa = "Safvet";
//        String lead = "Vedat";
//
//        System.out.println(qa.concat(lead));//qa String sonuna lead string birleştirildi.->SafvetVedat
//        System.out.println("ilk qa:" + qa);//Safvet ->qa.concat(lead) method'da  atama yapılmadı
//        /*
//        ahan da TRİCK-> String methodları variable'yi kalıcı değil geçici değişiklik yapar.
//        String'de kalıcı değişklik yapmak için atama yapılır...
//         */
//        qa = qa.concat(lead);
//        System.out.println("atamadan sonraki qa = " + qa);//SafvetVedat
//
//        qa = lead.concat(qa);
//        System.out.println("en son atamdan sonraki qa = " + qa);//VedatSafvetVedat
//
//        System.out.println(qa.concat("true"));//VedatSafvetVedattrue
//        System.out.println(lead.concat(true + "$"));//Vedattrue$
//        System.out.println(lead.concat(53 + "çay"));//Vedat53çay
//
//        /*
//        Trick-> concat methodu parametre olarak String harici tüm dataları Stringe çevirip concat eder.
//         String mürekkep gibi bulundugu ortamda diğer dataları etkiler.
//         */
//
        
        
    }
}
