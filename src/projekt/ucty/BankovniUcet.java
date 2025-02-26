package projekt.ucty;

//rodič
public abstract class BankovniUcet {

    private String cisloUctu;
    private int kodBanky;
    private double zustatek;
    private String vlastnik;

    public BankovniUcet(String cisloUctu, int kodBanky, double zustatek, String vlastnik) {
        this.cisloUctu = cisloUctu;
        this.kodBanky = kodBanky;
        this.zustatek = zustatek;
        this.vlastnik = vlastnik;
    }

    //dodelat podminky jak vklad i vyber
    public void vklad(double castka) {
        System.out.println("Vložil jste: " + castka + zustatek);
    }

    public void vyber(double castka) {
        System.out.println("Vybrali jste: " + castka);
        System.out.println("Zůstatek: " + zustatek);
    }

    public void prevodNa(BankovniUcet cilovyUcet, double castka) {
        if (this.zustatek >= castka && castka > 0) {
            this.zustatek -= castka; // Odečteme částku z tohoto účtu
            cilovyUcet.zustatek += castka; // Přičteme částku na cílový účet
            System.out.println("Převod " + castka + " CZK na účet " + cilovyUcet.cisloUctu + " úspěšný.");
        } else {
            System.out.println("Nedostatek peněz na účtě nebo neplatná částka.");
        }
    }

}
