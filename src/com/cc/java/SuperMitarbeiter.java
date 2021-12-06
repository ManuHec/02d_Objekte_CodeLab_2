package com.cc.java;

public class SuperMitarbeiter {

    public String nachname;
    public String vorname;
    public String funktion;
    public String eintrittsjahr;

    public SuperMitarbeiter(String nachname, String vorname, String funktion, String eintrittsjahr) {
        this.nachname = nachname;
        this.vorname = vorname;
        this.funktion = funktion;
        this.eintrittsjahr = eintrittsjahr;
    }

    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public String getFunktion() {
        return funktion;
    }

    public String getEintrittsjahr() {
        return eintrittsjahr;
    }

    public String getInfo(String flag) {
        switch (flag) {
            case "#vorname":
                return vorname;
            case "#nachname":
                return nachname;
            case "#funktion":
                return funktion;
            case "#eintrittsjahr":
                return eintrittsjahr;
            default:
                return "!2345fhj";
        }

    }
}
