package alanvecevrehesabi;

class UcgenAlan extends AlanveCevre {

    public void ucgenAlan(int taban, int yukseklik) {
        System.out.print("Üçgenin Alanı: "+((taban * yukseklik)/2)+" ");
    }

    public void ucgenCevre(int taban) {
        System.out.print("Üçgenin Çevresi: "+(3 * taban)+" ");
    }
}