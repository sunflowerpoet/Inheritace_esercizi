package Esercizio02;

public class Rettangolo extends Forma {
    int base = 2;
    int altezza = 3;

    int area = base * altezza;

    @Override
    public String toString() {
        return "Rettangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                ", area=" + area +
                '}';
    }

    @Override
    public void calcolaArea() {
        System.out.println(area);
    }
}
