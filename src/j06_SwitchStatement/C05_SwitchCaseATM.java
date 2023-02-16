package j06_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCaseATM {

    public static void main(String[] args) {


      //  task ATM Bakiye 1000$ olan bir banka hesabı için bakiye öğrenme para çekme para yatırma ve çıkış
        //işlemlerinin yaplıdığı bir app kod create ediniz
        Scanner input = new Scanner(System.in);
        int bakiye = 1000;
        System.out.println("    ***    ");
        System.out.println("  $$$ JavaBANK ATM'ye Hoşgeldiniz $$$");


        System.out.println("hangi işlemi yapmak istersiniz :\nBakiye-> 1\nPara Yatırma-> 2\nPara Çekme-> 3\nÇıkış 4");
        int tercih = input.nextInt();
        switch (tercih) {
            case 1:
                System.out.println("Bakiyeniz" +bakiye);
                break;
                case 2:
                    System.out.println("Kaç dolar yatırmak istersiniz");
                    int yatırılanMiktar = input.nextInt();
                    bakiye+=yatırılanMiktar;
                    System.out.println("Bakiyeniz" +bakiye);
                    break;
                    case 3:
                        System.out.println("Ne Kadar Çekmek İstersiniz");
                        int cekilenMiktar = input.nextInt();
                        if (cekilenMiktar<=bakiye){
                            bakiye-=cekilenMiktar;
                            System.out.println("Bakiyeniz" +bakiye);
                        } else System.out.println("yetersiz bakiye");
                        break;
                        case 4:
                            System.out.println("iyi günler yine bekleriz");
                            break;
                            default:
                                System.out.println("hatalı giriş");




        }
        System.out.println("KOD BAŞARILI");









    }





}
