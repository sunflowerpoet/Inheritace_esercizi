package Esercizio05interface;

class Rettangolo implements Forma {
    private int base;
    private int altezza;
    public Rettangolo (int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public int calcolaArea() {
        int area = base * altezza;
        System.out.println("Area rettagolo: " + area);
        return area;
    }
}
