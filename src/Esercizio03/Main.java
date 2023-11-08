package Esercizio03;

/*A partire dal programma creato precedentemente in cui si richiedeva il calcolo dell'area aggiungere
una ulteriore classe chiamata Triangolo supportando poi il calcolo dell'area per quest'ultima figura*/
public class Main {
    public static void main(String[] args) {
        Esercizio03.Forma forma = new Forma();
        int areaForma = forma.calcolaArea();
        System.out.println("Area forma: " + areaForma);

        Esercizio03.Rettangolo rettangolo = new Esercizio03.Rettangolo(2, 3);
        int areaRettangolo = rettangolo.calcolaArea();
        System.out.println("Area rettangolo: " + areaRettangolo);

        Triangolo triangolo = new Triangolo(3, 2);
        int areaTriangolo = triangolo.calcolaArea();
        System.out.println("Area triangolo: " + areaTriangolo);
    }
}
