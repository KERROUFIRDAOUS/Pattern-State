package org.example;

public class EtatEnPiste extends State{
    public EtatEnPiste(AvionImpl avion) {
        super(avion);
    }

    @Override
    void executeSortirDuGarager() {
        System.out.println("Impossible de sortir du garage, je suis déjà en piste");
    }

    @Override
    void executeEntrerAuGarage() {
        System.out.println("Transition d'état en piste => Garage");
        avion.state = new EtatAuGarage(avion);
    }

    @Override
    void executeDecoller() {
        System.out.println("Transition d'état en piste => Décollage");
        avion.state = new EtatEnAir(avion);
    }

    @Override
    void executeAtterir() {
        System.out.println("Impossible, je suis déjà en Piste");
    }

    @Override
    void executeDoActivity() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Activité de l'état en piste ...");
        }
    }
}