package alanvecevrehesabi;

import java.util.Scanner;

public class AlanveCevreHesabi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int kenar1, kenar2, taban, yukseklik, yaricap;
        Scanner giris = new Scanner(System.in, "ISO-8859-9");
        System.out.print("Hesaplamak İstediğiniz Şekli Yazınız ( Daire / Dikdörtgen / Üçgen ): ");
        String sekil = giris.nextLine();

        switch (sekil) {
            case "Daire" :
                DaireAlan d = new DaireAlan();
                System.out.print("Dairenin Yarıçapını Giriniz: ");
                yaricap = giris.nextInt();
                d.setYaricap(yaricap);
                d.daireAlan(d.getYaricap());
                d.daireCevre(d.getYaricap());
            break;

            case "Dikdörtgen" :
                DikdortgenAlan dik = new DikdortgenAlan();
                System.out.print("Dikdörtgenin Uzun Kenarını Giriniz: ");
                kenar1 = giris.nextInt();
                System.out.print("Dikdörtgenin Kısa Kenarını Giriniz: ");
                kenar2 = giris.nextInt();
                dik.setKenar1(kenar1);
                dik.setKenar2(kenar2);                
                dik.dikdortgenAlan(dik.getKenar1(), dik.getKenar2());
                dik.dikdortgenCevre(dik.getKenar1(), dik.getKenar2());
            break;


            case "Üçgen" :
                UcgenAlan u = new UcgenAlan();
                System.out.print("Üçgenin Tabanını Giriniz: ");
                taban = giris.nextInt();
                System.out.print("Üçgenin Yüksekliğini Giriniz: ");
                yukseklik = giris.nextInt();
                u.setTaban(taban);
                u.setYukseklik(yukseklik);
                u.ucgenAlan(u.getTaban(), u.getYukseklik());
                u.ucgenCevre(u.getTaban());
            break;

           
            default : System.out.println("Geçersiz Şekil Girdiniz.");
        }
    }
    
}
