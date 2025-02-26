package projekt.ucty;

public class BeznyUcet extends BankovniUcet{

    //Konstruktor
    public BeznyUcet(String cisloUctu, int kodBanky, double zustatek, Zakaznik zakaznik) {
        super(cisloUctu, kodBanky, zustatek, zakaznik);
    }

    @Override
    public void vklad(double castka) {
        if (castka > 0) {
            zustatek += castka;
            System.out.println("Vložili jste: " + zustatek);
        } else {
            System.out.println("Částka musí být kladná");
        }
    }

    @Override
    public void vyber(double castka) {
        if (zustatek >= castka && castka > 0) {
            zustatek -= castka;
            System.out.println("Vybrali jste: " + castka);
            System.out.println("Zůstatek: " + zustatek);
        } else {
            System.out.println("Částka musí být jak záporná, tak ne větší než zůstatek");
        }
    }

    @Override
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
