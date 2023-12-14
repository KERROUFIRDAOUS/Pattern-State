package org.example;

public class AvionImpl implements Avion {

    protected State state;

    public AvionImpl() {
        state = new EtatEnPiste(this);
    }

    @Override
    public void sortirDuGarager() {
        state.executeSortirDuGarager();
    }

    @Override
    public void entrerAuGarage() {
        state.executeEntrerAuGarage();
    }

    @Override
    public void decoller() {
        state.executeDecoller();
    }

    @Override
    public void atterir() {
        state.executeAtterir();
    }

    @Override
    public void doActivity() {
        state.executeDoActivity();
    }




}
