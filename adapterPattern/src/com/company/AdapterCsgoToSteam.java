package com.company;

public class AdapterCsgoToSteam extends Csgo implements ISteam{
    @Override
    public void releaseGame() {
        releaseCsgo();
    }

    @Override
    public void updateGame() {
        updateCsgo();
    }

    @Override
    public void deleteGame() {
        deletecsgo();
    }
}
