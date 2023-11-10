package Esercizio06enum;
public class Rettangolo extends Forma {
    private tipoForma tipo = tipoForma.RETTANGOLO;
    private int base;
    private int altezza;
    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        int area = base * altezza;
        System.out.println("Area rettangolo: " + area);
    }
}
