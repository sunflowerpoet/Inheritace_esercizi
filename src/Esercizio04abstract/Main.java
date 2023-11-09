package Esercizio04abstract;

import Esercizio03.Triangolo;

/*Scrivere un programma che contenga una classe astratta chiamata Forma ed un metodo astratto chiamato calcolaArea().
Crea poi due sottoclassi Rettangolo e Triangolo che estendono Forma ed implementano il metodo per il calcolo dell'area
in maniera specifica.*/
public class Main {
    public static void main (String[] args) {

        System.out.println("CALCOLO AREE FORME:");

        Esercizio04abstract.Rettangolo rettangolo = new Esercizio04abstract.Rettangolo(2, 3);
        int areaRettangolo = rettangolo.calcolaArea();
        System.out.println("Area rettangolo: " + areaRettangolo);

        Esercizio04abstract.Triangolo triangolo = new Esercizio04abstract.Triangolo(3, 2);
        int areaTriangolo = triangolo.calcolaArea();
        System.out.println("Area triangolo: " + areaTriangolo);
    }
}
