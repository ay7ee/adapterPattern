package com.company;

public class Steam {

    public static void main(String[] args) {
	ISteam iSteam = new AdapterCsgoToSteam();
	iSteam.releaseGame();
	iSteam.updateGame();
	iSteam.deleteGame();
    }
}
