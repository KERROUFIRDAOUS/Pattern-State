package org.example;

public abstract class State{
    protected AvionImpl avion;

    public State(AvionImpl avion) {
        this.avion = avion;
    }

    abstract void executeSortirDuGarager(); //opération de transition d'etat
    abstract void executeEntrerAuGarage(); //opération de transition d'etat
    abstract void executeDecoller(); //opération de transition d'etat
    abstract void executeAtterir(); //opération de transition d'etat
    abstract void executeDoActivity(); //activité
}