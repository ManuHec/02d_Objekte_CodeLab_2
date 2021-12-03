package com.cc.java;

public class App {

	public static void main(String[] args) {

		Mitarbeiter mitarbeiter1 = new Mitarbeiter("Mustermann", "Max", "Abteilungsleiter", "2000");

		output("Vorname:" + " " + mitarbeiter1.getInfo("#vorname"));
		output("Nachname:" + " " + mitarbeiter1.getInfo("#nachname"));
		output("Funktion:" + " " + mitarbeiter1.getInfo("#funktion"));
		output("Eintrittsjahr:" + " " + mitarbeiter1.getInfo("#eintrittsjahr"));

		output("<--------------------------------->");

		Mitarbeiter mitarbeiter2 = new Mitarbeiter("Freitag", "Lisa", "Personalleiterin", "2005");

		output("Vorname:" + " " + mitarbeiter2.getInfo("#vorname"));
		output("Nachname:" + " " + mitarbeiter2.getInfo("#nachname"));
		output("Funktion:" + " " + mitarbeiter2.getInfo("#funktion"));
		output("Eintrittsjahr:" + " " + mitarbeiter2.getInfo("#eintrittsjahr"));

		output("<--------------------------------->");

		Mitarbeiter mitarbeiter3 = new Mitarbeiter("Matern", "Maike", "Auszubildene", "2021");

		output("Vorname:" + " " + mitarbeiter3.getInfo("#vorname"));
		output("Nachname:" + " " + mitarbeiter3.getInfo("#nachname"));
		output("Funktion:" + " " + mitarbeiter3.getInfo("#funktion"));
		output("Eintrittsjahr:" + " " + mitarbeiter3.getInfo("#eintrittsjahr"));

		output("<--------------------------------->");

	}

	private static void output(String outStr) {
		System.out.println(outStr);
	}

};
