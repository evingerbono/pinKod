package pinkod;

import java.util.Scanner;

public class Pinkod {

    static int pin;
    static int belepesiKod;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        pinProgram();
    }

    private static void pinProgram() {
        pinBekeres();
        kodbekeres();
        ellenorzes(); 
    }

    private static void pinBekeres() {
        System.out.print("Kód megadása: ");
        String kod = sc.next();
        while (kod.length() < 4 || kod.length() > 6) {
            System.out.println("Nem megfelelő a formátum, minimum 4 maximum 6 szám legyen!");
            System.out.print("Kód megadása: ");
            kod = sc.next();
        }
        System.out.println("Pin elmentve!");
        pin=Integer.parseInt(kod);  
    }

    private static void kodbekeres() {
        System.out.print("Kérem a belépési kódot: ");
        String kod= sc.next();
        belepesiKod=Integer.parseInt(kod);
    }

    private static void ellenorzes() {
        int db=0;
        for (int i = 1; i < 3; i++) {
            if (pin!=belepesiKod) {
                System.out.println("Hibas pin kód!");
                kodbekeres();
                db++;
            }
        }
        if (db<=2) {
            System.out.println("Rendben, sikeres belépés");
        }else{
            System.out.println("Belépés megtagadva!");
        }

    }
}
