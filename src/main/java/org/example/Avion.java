package org.example;

public interface Avion {
    void sortirDuGarager(); //opération de transition d'etat
    void entrerAuGarage(); //opération de transition d'etat
    void decoller(); //opération de transition d'etat
    void atterir(); //opération de transition d'etat
    void doActivity(); //activité
}
