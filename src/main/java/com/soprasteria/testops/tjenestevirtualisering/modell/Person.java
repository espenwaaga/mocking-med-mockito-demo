package com.soprasteria.testops.tjenestevirtualisering.modell;

import com.soprasteria.testops.tjenestevirtualisering.modell.arbeidsforhold.Arbeidsforhold;
import com.soprasteria.testops.tjenestevirtualisering.modell.medlemsskap.Medlemsskap;

public class Person {

    private Navn navn;
    private Kjønn kjønn;
    private Fødselsnummer fødselsnummer;
    private Medlemsskap medlemsskap;
    private Arbeidsforhold arbeidsforhold;

    public Person(Navn navn, Kjønn kjønn, Fødselsnummer fødselsnummer, Medlemsskap medlemsskap, Arbeidsforhold arbeidsforhold) {
        this.navn = navn;
        this.kjønn = kjønn;
        this.fødselsnummer = fødselsnummer;
        this.medlemsskap = medlemsskap;
        this.arbeidsforhold = arbeidsforhold;
    }

    public Navn getNavn() {
        return navn;
    }

    public Kjønn getKjønn() {
        return kjønn;
    }

    public Fødselsnummer getFødselsnummer() {
        return fødselsnummer;
    }

    public Medlemsskap getMedlemsskap() {
        return medlemsskap;
    }

    public Arbeidsforhold getArbeidsforhold() {
        return arbeidsforhold;
    }
}
