package org.example;

public class EtatEnAir extends State{

    public EtatEnAir(AvionImpl avion) {
        super(avion);
    }

    @Override
    void executeSortirDuGarager() {
        System.out.println("Impossible, je suis déjà je air");
    }

    @Override
    void executeEntrerAuGarage() {
        System.out.println("Impossible, je suis en air");
    }

    @Override
    void executeDecoller() {
        System.out.println("Impossible, je suis déjà en air");
    }

    @Override
    void executeAtterir() {
        System.out.println("Transition d'état de en l'air => Piste");
        avion.state = new EtatEnPiste(avion);
    }

    @Override
    void executeDoActivity() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Activité de l'état en l'air ...");
        }
    }
}