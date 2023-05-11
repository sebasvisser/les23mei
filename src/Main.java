// Huiswerk Opdracht Dollar Euro Converter met input via Scanner

// IMPORTS
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scanner aanmaken voor bedrag
        Scanner scanner = new Scanner(System.in);

        //doel valuta opvragen
        String userCurrency = getCurrency(scanner, "Wat is de gewenste DOEL valuta?"
                + "\nJe kunt kiezen tussen Euro, Dollar, Yen en Bitcoin");
        // begin valuta opvragen
        String otherCurrency = getCurrency(scanner, "Wat is jouw START valuta?"
                + "\nJe kunt kiezen tussen Euro, Dollar, Yen en Bitcoin");

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

    /* Methode om valuta op te vragen
    * TODO default is nu bitcoin, maar eigenlijk is het netste als het opnieuw gaat.
    *  */
    public static String getCurrency(Scanner scanner, String string){
            System.out.println(string);
            String userCurrency = scanner.next();
            switch (userCurrency) {
                case "d":
                case "dollar":
                case "D":
                case "Dollar":
                case "dolar":
                case "$":
                    return "dollar";
                case "e":
                case "euro":
                case "E":
                case "Euro":
                case "euo":
                case "€":
                    return "euro";
                case "p":
                case "pond":
                case "P":
                case "Pond":
                case "pound":
                case "Pound":
                case "£":
                    return "pond";
                case "y":
                case "yen":
                case "Y":
                case "Yen":
                case "jen":
                case "Jen":
                case "¥":
                    return "yen";
                case "b":
                case "btc":
                case "B":
                case "Bitcoin":
                case "bitcoin":
                case "BTC":
                case "₿":
                    return "bitcoin";
                default:
                    System.out.println("Ik snap niet wat je hebt. Maar toch fijn dat je er bent.\n"
                    + "Om te zorgen dat je met de tijd meegaat doe ik netalsof je voor Bitcoin hebt gekozen.");
                    return "bitcoin";
            }
        }


} // sluit haakje van main class
