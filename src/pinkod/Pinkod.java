package pinkod;

import java.util.Random;
import java.util.Scanner;

public class Pinkod {

    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();
    static int pin;
    static int belepesiKod;
    static String[] panelSzamok = {"0","1","2","3","4","5","6","7","8","9"};
    
    public static void main(String[] args) {

        pinProgram();
    }

    private static void pinProgram() {
        pinBekeres();
        kodBekeres();
        ellenorzes();
        panelKeveres();
    }

    private static void pinBekeres() {
        System.out.print("Kód megadása: ");
        String kod = sc.next();
        while (kod.length() < 4 || kod.length() > 6) {
            System.out.println("Nem megfelelő a formátum, minimum 4 maximum 6 szám legyen!");
            System.out.print("Kód megadása: ");
            kod = sc.next();
        }
        int db=0;
        for (int i = 0; i < panelSzamok.length; i++) {
            System.out.printf(panelSzamok[i]," \t");
            if (db==3) {
                System.out.println("\n}");
                db=1;
            }
            db++;
        }
        
        pin = Integer.parseInt(kod);
        System.out.println("Pin elmentve!");
    }

    private static void kodBekeres() {
        System.out.print("Kérem a belépési kódot: ");
        String kod = sc.next();
        belepesiKod = Integer.parseInt(kod);
    }

    private static void ellenorzes() {
        int db = 0;
        for (int i = 1; i < 3; i++) {
            if (pin != belepesiKod) {
                System.out.println("Hibas pin kód!");
                kodBekeres();
                db++;
            }
        }
        if (db <= 2) {
            System.out.println("Rendben, sikeres belépés");
        } else {
            System.out.println("Belépés megtagadva!");
        }

    }

    private static void panelKeveres() {
        for (int i = 0; i < panelSzamok.length; i++) {
            panelSzamok[i]=panelSzamok[9-(i*3)];
        }
    }
}
