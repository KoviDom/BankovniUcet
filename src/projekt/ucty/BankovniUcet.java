package projekt.ucty;

//rodič
public abstract class BankovniUcet {

    private String cisloUctu;
    private int kodBanky;
    private double zustatek;
    private Zakaznik zakaznik;

    public BankovniUcet(String cisloUctu, int kodBanky, double zustatek, Zakaznik zakaznik) {
        this.cisloUctu = cisloUctu;
        this.kodBanky = kodBanky;
        this.zustatek = zustatek;
        this.zakaznik = zakaznik;
    }

    /**
     * vkládaní peněz na účet
     * @param castka
     */
    public abstract void vklad(double castka);
//        if (castka > 0) {
//            zustatek += castka;
//            System.out.println("Vložili jste: " + zustatek);
//        } else {
//            System.out.println("Částka musí být kladná");
//        }

    /**
     * výběr z účtu
     * @param castka
     */
    public abstract void vyber(double castka);
//        if (zustatek >= castka && castka > 0) {
//            zustatek -= castka;
//            System.out.println("Vybrali jste: " + castka);
//            System.out.println("Zůstatek: " + zustatek);
//        } else {
//            System.out.println("Částka musí být jak záporná, tak ne větší než zůstatek");
//        }

    /**
     * Převod peněz z původního na cílový účet
     * @param cilovyUcet
     * @param castka
     */
    public abstract void prevodNa(BankovniUcet cilovyUcet, double castka);
//        if (this.zustatek >= castka && castka > 0) {
//            this.zustatek -= castka; // Odečteme částku z tohoto účtu
//            cilovyUcet.zustatek += castka; // Přičteme částku na cílový účet
//            System.out.println("Převod " + castka + " CZK na účet " + cilovyUcet.cisloUctu + " úspěšný.");
//        } else {
//            System.out.println("Nedostatek peněz na účtě nebo neplatná částka.");
//        }
//    }

}
