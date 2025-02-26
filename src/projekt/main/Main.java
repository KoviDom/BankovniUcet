package projekt.main;

import projekt.ucty.BeznyUcet;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static BeznyUcet beznyUcet = new BeznyUcet();

    public static void main(String[] args) {

        System.out.println("-------------------");
        System.out.println("Vítejte, vyberte si prosím akci: ");
        System.out.println("-------------------");

        boolean pokracovat = true;

        while(pokracovat) {
            vypisMenu();
            int volba = Integer.parseInt(scanner.nextLine().trim());

            switch (volba) {
                case 1:
                    System.out.println("vklad");
                    break;
                case 2:
                    System.out.println("vyber");
                    break;
                case 3:
                    System.out.println("prevodNa");
                    break;
                case 4:
                    System.out.println("zobrazInfo");
                    break;
                case 5:
                    pokracovat = false;
                    System.out.println("Konec");
                default:
                    System.out.println("Neplatná volba. Zkuste to znovu.");
            }
        }
    }

    private static void vypisMenu() {
        System.out.println("1 - Vložit peníze");
        System.out.println("2 - Výběr peněz");
        System.out.println("3 - Převod na jiný účet");
        System.out.println("4 - Zobrazit informace ohledně účtu");
        System.out.println("5 - Konec");
    }

    //jak to udelat
    public void vklad(double castka) {
        if (castka > 0) {
            zustatek += castka;
            System.out.println("Vložili jste: " + zustatek);
        } else {
            System.out.println("Částka musí být kladná");
        }
    }

}
