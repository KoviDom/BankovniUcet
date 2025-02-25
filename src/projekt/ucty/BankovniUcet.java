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

}
