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

        double userAmount;
        boolean validUserAmount = false;
        String userCurrency;
        boolean validUserCurrency = false;
        String otherCurrency = "";
        boolean validOtherCurrency = false;

        // Constante Variabele aanmaken voor valutakoersen
        double euroToDollar = 1.09;
        double pondToDollar = 1.26;
        double yenToDollar = 0.0074;
        double bitcoinToDollar = 28258.70;

        // Berekende variabele aanmaken
        double calculatedAmount;

        // Scanner aanmaken voor bedrag
        Scanner scanner = new Scanner(System.in);
        // TODO WHILE LOOP TOT GOEDE INPUT
        // Input van gebruiker vragen en toekennen aan variabele
        System.out.println("Welk bedrag wil je omrekenen?");
        userAmount = scanner.nextDouble();
        // Bevestiging van input
        System.out.println("Je hebt ingegeven dat je: " + userAmount + " wilt converteren.");

        // Input van gebruiker vragen en toekennen aan variabele currency
        System.out.println("Welke valuta heb jij die je wilt omrekenen? Dollar, Euro, Pond, Yen of Bitcoin?");
        userCurrency = scanner.next();

        // Bevestiging van input
        switch (userCurrency) {
            case "d":
            case "dollar":
            case "D":
            case "Dollar":
            case "dolar":
            case "$":
                System.out.println("Je hebt ingegeven dat je DOLLAR hebt.");
                userCurrency = "dollar";
                validUserCurrency = true;
                break;
            case "e":
            case "euro":
            case "E":
            case "Euro":
            case "euo":
            case "€":
                System.out.println("Je hebt ingegeven dat je EURO hebt.");
                userCurrency = "dollar";
                validUserCurrency = true;
                break;
            case "p":
            case "pond":
            case "P":
            case "Pond":
            case "pound":
            case "Pound":
            case "£":
                System.out.println("Je hebt ingegeven dat je POND hebt.");
                userCurrency = "pond";
                validUserCurrency = true;
                break;
            case "y":
            case "yen":
            case "Y":
            case "Yen":
            case "jen":
            case "Jen":
            case "¥":
                System.out.println("Je hebt ingegeven dat je YEN hebt.");
                userCurrency = "yen";
                validUserCurrency = true;
                break;
            case "b":
            case "btc":
            case "B":
            case "Bitcoin":
            case "bitcoin":
            case "BTC":
            case "₿":
                System.out.println("Je hebt ingegeven dat je BITCOIN hebt.");
                userCurrency = "bitcoin";
                validUserCurrency = true;
                break;
            default:
                System.out.println("Ik snap niet wat je hebt. Maar toch fijn dat je er bent. Doei.");
                break;
        }
        // Input van gebruiker vragen en toekennen aan variabele
        System.out.println("Welke valuta heb jij die je wilt omrekenen? Dollar, Euro, Pond, Yen of Bitcoin?");
        otherCurrency = scanner.next();
        switch (otherCurrency) {
            case "d":
            case "dollar":
            case "D":
            case "Dollar":
            case "dolar":
            case "$":
                System.out.println("Je hebt om wilt rekenen naar DOLLAR.");
                otherCurrency = "dollar";
                validOtherCurrency = true;
                break;
            case "e":
            case "euro":
            case "E":
            case "Euro":
            case "euo":
            case "€":
                System.out.println("Je hebt om wilt rekenen naar EURO.");
                otherCurrency = "euro";
                validOtherCurrency = true;
                break;
            case "p":
            case "pond":
            case "P":
            case "Pond":
            case "pound":
            case "Pound":
            case "£":
                System.out.println("Je hebt ingegeven dat je POND.");
                otherCurrency = "pond";
                validOtherCurrency = true;
                break;
            case "y":
            case "yen":
            case "Y":
            case "Yen":
            case "jen":
            case "Jen":
            case "¥":
                System.out.println("Je hebt om wilt rekenen naar YEN.");
                otherCurrency = "yen";
                validOtherCurrency = true;
                break;
            case "b":
            case "btc":
            case "B":
            case "Bitcoin":
            case "bitcoin":
            case "BTC":
            case "₿":
                System.out.println("Je hebt om wilt rekenen naar BITCOIN.");
                otherCurrency = "bitcoin";
                validOtherCurrency = true;
                break;
            default:
                System.out.println("Ik snap niet wat je hebt. Maar toch fijn dat je er bent. Doei.");
                break;
        }
        scanner.close();
        // TODO calculatedAmount nog afronden tot 2 decimalen om mooier te maken
        calculatedAmount = userAmount * euroToDollar;
        if (otherCurrency != ""){
            System.out.println(userAmount
                    + " in "
                    + userCurrency
                    + " is "
                    + calculatedAmount
                    + " in "
                    + otherCurrency);
        } else {
            System.out.println("Doei");
        }
    }
}
