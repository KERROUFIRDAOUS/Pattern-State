package org.example;

public class EtatAuGarage extends State{
    public EtatAuGarage(AvionImpl avion) {
        super(avion);
    }

    @Override
    void executeSortirDuGarager() {
        System.out.println("Transition d'état de garage => Piste");
        avion.state = new EtatEnPiste(avion);
    }

    @Override
    void executeEntrerAuGarage() {
        System.out.println("Impossible, je suis déjà au garage");
    }

    @Override
    void executeDecoller() {
        System.out.println("Impossible de décoller, je suis au garage");
    }

    @Override
    void executeAtterir() {
        System.out.println("Impossible d'éttérir, je suis déjà au garage");
    }

    @Override
    void executeDoActivity() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Activité de l'état Au garage ...");
        }
    }
}