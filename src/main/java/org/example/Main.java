package org.example;

public class Main {
    public static void main(String[] args) {
        Avion avion = new AvionImpl();
        avion.doActivity();
        System.out.println("-------------");
        avion.sortirDuGarager();
        System.out.println("-------------");
        avion.doActivity();
        System.out.println("-------------");
        avion.entrerAuGarage();
        System.out.println("-------------");
        avion.doActivity();
        System.out.println("-------------");
        avion.decoller();
        avion.atterir();
        avion.sortirDuGarager();
        avion.doActivity();
        avion.decoller();
        avion.doActivity();
        avion.entrerAuGarage();
        avion.decoller();
    }
}