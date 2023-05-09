// Huiswerk Opdracht Dollar Euro Converter met input via Scanner

/*
Pseudo Stappen plan:
1Variabelen aanmaken: Koers, Euro amount, Dollar Amount, Input van Gebruiker
2 inpput van gebruiker opvragen
3 conversie functie
4 print functie
*/
// IMPORTS
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Dynamische Variabele voor functie aanmaken
        double dollarAmount;
        double euroAmount;
        double userAmount;
        String userCurrency;
        // Constante Variabele aanmaken voor functie
        double euroToDollar = 1.09;

        // Scanner aanmaken voor bedrag
        Scanner scanner = new Scanner(System.in);
        // Input van gebruiker vragen en toekennen aan variabele
        System.out.println("Welk bedrag wil je omrekenen?");
        userAmount = scanner.nextDouble();
        // Bevestiging van input
        System.out.println("Je hebt ingegeven dat je: " + userAmount + "wilt converteren.");

        // Input van gebruiker vragen en toekennen aan variabele
        System.out.println("Welke valuta heb jij die je wilt omrekenen? Dollar of Euro?");
        userCurrency = scanner.next();
        scanner.close();
        // Bevestiging van input
        switch (userCurrency) {
            case "d":
            case "dollar":
            case "D":
            case "Dollar":
            case "dolar":
                System.out.println("Je hebt ingegeven dat je DOLLAR hebt en wilt omzetten naar EURO.");
                break;
            case "e":
            case "euro":
            case "E":
            case "Euro":
            case "euo":
                System.out.println("Je hebt ingegeven dat je EURO hebt en wilt omzetten naar DOLLAR.");
                break;
            default:
                System.out.println("Ik snap niet wat je hebt. Maar toch fijn dat je er bent. Doei.");
                break;
        }
    }
}
