// Huiswerk Opdracht Dollar Euro Converter met input via Scanner

// IMPORTS
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userCurrency = "";
        boolean validUserCurrency = false;
        String otherCurrency = "";
        boolean validOtherCurrency = false;

        // Scanner aanmaken voor bedrag
        Scanner scanner = new Scanner(System.in);

        // String userCurrency = getCurrency(scanner, "DOEL");
        // String otherCurrency = getCurrency(scanner, "START");

        // Eigen valuta opvragen tot geldige input komt
        while (!validUserCurrency){
            System.out.println("Welke valuta heb jij die je wilt omrekenen? Dollar, Euro, Pond, Yen of Bitcoin?");
            userCurrency = scanner.next();
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
                    userCurrency = "euro";
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
                    System.out.println("Ik snap niet wat je hebt. Maar toch fijn dat je er bent.");
                    break;
            }
        }

        // Doel valuta opvragen tot geldige input komt
        while (!validOtherCurrency){
            System.out.println("Welke valuta zou je graag willen? Dollar, Euro, Pond, Yen of Bitcoin?");
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
                case "bit":
                case "₿":
                    System.out.println("Je hebt om wilt rekenen naar BITCOIN.");
                    otherCurrency = "bitcoin";
                    validOtherCurrency = true;
                    break;
                default:
                    System.out.println("Ik snap niet wat je hebt. Maar toch fijn dat je er bent.");
                    break;
            }
        }

        // Bedrag (in eigen valuta) vragen tot geldige input via een mooie methode
        double userAmount = getUserAmount(scanner);

        // Scanner netjes sluiten
        scanner.close();

        // Eindbedrag berekenen
        double result = calculateAmount(userCurrency, otherCurrency, userAmount);
        // Waarom methode printResult? Omdat het kan..alles in methodes!!
        printResult(userCurrency, otherCurrency, userAmount, result);

    } //einde main methode

    /* Methode om bedrag om te zetten op basis van (1)begin valuta, (2)doel valuta en (3)bedrag in begin valuta.*/
    private static double calculateAmount(String userCurrency, String otherCurrency, double userAmount) {
        //resultaat variabele
        double calculatedAmount = 0.0;
        // Constante Variabele aanmaken voor valutakoersen
        double euroToDollar = 1.09;
        double pondToDollar = 1.26;
        double yenToDollar = 0.0074;
        double bitcoinToDollar = 28258.70;

        switch(userCurrency) {
            case "euro":
                switch(otherCurrency) {
                    case "dollar":
                        calculatedAmount = userAmount * euroToDollar;
                        break;
                    case "pond":
                        calculatedAmount = userAmount * euroToDollar / pondToDollar;
                        break;
                    case "yen":
                        calculatedAmount = userAmount * euroToDollar / yenToDollar;
                        break;
                    case "bitcoin":
                        calculatedAmount = userAmount * euroToDollar / bitcoinToDollar;
                        break;
                }
                break;
            case "dollar":
                switch(otherCurrency) {
                    case "euro":
                        calculatedAmount = userAmount / euroToDollar;
                        break;
                    case "pond":
                        calculatedAmount = userAmount / euroToDollar * pondToDollar;
                        break;
                    case "yen":
                        calculatedAmount = userAmount / euroToDollar * yenToDollar;
                        break;
                    case "bitcoin":
                        calculatedAmount = userAmount / euroToDollar * bitcoinToDollar;
                        break;
                }
                break;
            case "pond":
                switch(otherCurrency) {
                    case "dollar":
                        calculatedAmount = userAmount * pondToDollar;
                        break;
                    case "euro":
                        calculatedAmount = userAmount * pondToDollar / euroToDollar;
                        break;
                    case "yen":
                        calculatedAmount = userAmount * pondToDollar / yenToDollar;
                        break;
                    case "bitcoin":
                        calculatedAmount = userAmount * pondToDollar / bitcoinToDollar;
                        break;
                }
                break;

            case "yen":
                switch(otherCurrency) {
                    case "dollar":
                        calculatedAmount = userAmount * yenToDollar;
                        break;
                    case "euro":
                        calculatedAmount = userAmount * yenToDollar / euroToDollar;
                        break;
                    case "pond":
                        calculatedAmount = userAmount * yenToDollar / pondToDollar;
                        break;
                    case "bitcoin":
                        calculatedAmount = userAmount * yenToDollar / bitcoinToDollar;
                        break;
                }
                break;

            case "bitcoin":
                switch(otherCurrency) {
                    case "dollar":
                        calculatedAmount = userAmount * bitcoinToDollar;
                        break;
                    case "euro":
                        calculatedAmount = userAmount * bitcoinToDollar / euroToDollar;
                        break;
                    case "pond":
                        calculatedAmount = userAmount * bitcoinToDollar / pondToDollar;
                        break;
                    case "yen":
                        calculatedAmount = userAmount * bitcoinToDollar / yenToDollar;
                        break;
                }
                break;
        }
        return calculatedAmount;
    }
    /* Methode om resultaat in console te printen*/
    public static void printResult(String userCurrency, String otherCurrency, double userAmount, double result){
        // Output opbouwen
        System.out.println("=========\n=========\n"
                + userAmount
                + " "
                + userCurrency
                + " is "
                + result
                + " in "
                + otherCurrency
                + "\n=========\n=========\n");
    }

    /* Methode om bedrag op te vragen */
    private static double getUserAmount(Scanner scanner) {
        System.out.println("Voer het bedrag dat je wilt omzetten in:");
        while (true) {
            try {
                return Double.parseDouble(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Dit is geen geldig bedrag, probeer opnieuw.");
            }
        }
    }

    /* Methode om valuta op te vragen*/
    public static String getCurrency(Scanner scanner, String string){
            System.out.println("Voer in de valuta die je wilt gebruiken als "
                    + string
                    + ". \nJe kunt kiezen tussen Dollar, Euro, Pond, Yen of Bitcoin.");
            userCurrency = scanner.next();
            switch (string) {
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
                    userCurrency = "euro";
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
                    System.out.println("Ik snap niet wat je hebt. Maar toch fijn dat je er bent.");
                    break;
            }
        }



        return result;
    }


} // sluit haakje van main class
