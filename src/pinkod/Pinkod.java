package pinkod;

import java.util.Scanner;

public class Pinkod {

    static String pin;
    static String kod;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        pinBekeres();
        kodbekeres();
        ellenorzes();
    }

    private static void pinBekeres() {
        System.out.print("Kód megadása: ");
        pin = sc.next();
        while (pin.length() < 4 || pin.length() > 6) {
            System.out.print("Kód megadása: ");
            pin = sc.next();
        }
        System.out.println("Pin elmentve!");
    }

    private static void kodbekeres() {
        System.out.print("Kérem a belépési kódot: ");
        kod = sc.next();
    }

    private static void ellenorzes() {
        int db=0;
        for (int i = 0; i < pin.length(); i++) {
            if (pin.charAt(i)!=kod.charAt(i)) {
                System.out.println("Hibas pin kód!");
                kodbekeres();
            }
        }
        if (db<3) {
            System.out.println("Rendben, sikeres belépés");
        }

    }
}
