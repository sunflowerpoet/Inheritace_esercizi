package Esercizio02;

import java.text.Normalizer;

/*Scrivere un programma che contenga una classe chiamata Forma
ed un metodo chiamato calcolaArea() che stampi l'area della forma.
Crea poi una sottoclasse chiamata Rettangolo che fa override del
metodo calcolaArea() per calcolare l'area del rettangolo.*/
public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo();

        forma.calcolaArea();
        System.out.println("Formula area rettangolo: " + rettangolo.base + " * " + rettangolo.altezza);
        System.out.print("Area di un rettangolo: ");
        rettangolo.calcolaArea();
    }
}
