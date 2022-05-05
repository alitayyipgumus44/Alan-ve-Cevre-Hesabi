package alanvecevrehesabi;

class DikdortgenAlan extends AlanveCevre {

    public void dikdortgenAlan(int kenar1, int kenar2) {
        System.out.print("Dikdörtgenin Alanı: "+(kenar1 * kenar2)+" ");
    }

    public void dikdortgenCevre(int kenar1, int kenar2) {
        System.out.print("Dikdörtgenin Çevresi: "+(2 * (kenar1 + kenar2))+" ");
    }
}
