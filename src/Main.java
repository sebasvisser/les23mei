// Huiswerk Opdracht Dollar Euro Converter met input via Scanner
// Wisselkoers:

/*
Pseudo Stappen plan:
1Variabelen aanmaken: Koers, Euro amount, Dollar Amount, Input van Gebruiker
2 inpput van gebruiker opvragen
3 conversie functie
4 print functie


 */
public class Main {
    public static void main(String[] args) {
        // Dynamische Variabele voor functie aanmaken
        double dollarAmount;
        double euroAmount;
        double userAmount;
        // Constante Variabele aanmaken voor functie
        double euroToDollar = 1.09;

        // Scanner aanmaken voor bedrag
        Scanner scannerAmount = new Scanner(System.in);
        // Input van gebruiker vragen en toekennen aan variabele
        System.out.println("Welk bedrag wil je omrekenen?");
        userAmount = scannerAmount.nextDouble();
        scannerAmount.close();
        // Bevestiging van input
        System.out.println("Je hebt ingegeven dat je: " + userAmount + "wilt converteren.");

    }
}
