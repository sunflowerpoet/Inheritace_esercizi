package Esercizio05interface;

public class Triangolo implements Forma {
    private int base;
    private int altezza;
    public Triangolo (int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public void calcolaArea() {
        int area = base * altezza / 2;
        System.out.println("Area triangolo: " + area);
    }
}
