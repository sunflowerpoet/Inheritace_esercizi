package Esercizio02;

public class Rettangolo extends Forma {
    private int base = 2;
    private int altezza = 3;

    public Rettangolo (int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public int calcolaArea() {
        int area = base * altezza;
        return area;
    }
}
