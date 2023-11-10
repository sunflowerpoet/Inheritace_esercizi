package Esericizo08stringhe;

public class Character {
    private String inputString;
    private int index;

    public Character(String inputString, int index) {
        this.inputString = inputString;
        this.index = index;
    }

    public String getUnicodeAtIndex () {
        if (index < 0 || index >= inputString.length()) {
            return "Errore: Indice non valido";
        }

        char charAtIndex = inputString.charAt(index);
        int unicodeValue = charAtIndex;

        StringBuilder result = new StringBuilder();
        result.append("The character in the position ").append(index);
        result.append(" in the string '").append(inputString).append("'");
        result.append(" is '").append(charAtIndex).append("'");
        result.append(" and it's Unicode value is ").append(unicodeValue);

        return result.toString();
    }
}
