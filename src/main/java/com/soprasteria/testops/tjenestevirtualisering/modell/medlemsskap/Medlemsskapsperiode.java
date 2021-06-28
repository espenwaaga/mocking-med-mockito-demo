package com.soprasteria.testops.tjenestevirtualisering.modell.medlemsskap;

import java.time.LocalDate;

public class Medlemsskapsperiode {

    private Landskode landskode;
    private LocalDate fom;
    private LocalDate tom;

    public Medlemsskapsperiode(Landskode landskode, LocalDate fom, LocalDate tom) {
        this.landskode = landskode;
        this.fom = fom;
        this.tom = tom;
    }

    public Landskode getLandskode() {
        return landskode;
    }

    public LocalDate getFom() {
        return fom;
    }

    public LocalDate getTom() {
        return tom;
    }
}
