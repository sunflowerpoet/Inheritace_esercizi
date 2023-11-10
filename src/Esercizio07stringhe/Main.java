package Esercizio07stringhe;
/*Scrivi un programma Java che abbia un metodo che prenda due stringhe e le compari lessico-graficamente.
Il metodo dovrà restituire "Le due stringhe sono uguali" o "Le due stringhe sono differenti" basandosi sul risultato del confronto.
Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder*/
public class Main {
    public static void main(String[] args) {
        String string1 = "Hello, my name is Anna.";
        String string2 = "Hello, my name is Anna.";

        String result = confrontStrings(string1, string2);

        System.out.println(result);
    }
    public static String confrontStrings(String string1, String string2) {

        int confront = string1.compareTo(string2);

        StringBuilder result = new StringBuilder("The two strings are ");

        if (confront == 0) {
            result.append("identical.");
        } else {
            result.append("different.");
        }
        return result.toString();
    }
}




