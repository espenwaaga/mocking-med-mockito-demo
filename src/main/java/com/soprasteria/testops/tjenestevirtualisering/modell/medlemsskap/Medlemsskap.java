package com.soprasteria.testops.tjenestevirtualisering.modell.medlemsskap;

import java.util.ArrayList;
import java.util.List;

public class Medlemsskap {

    private List<Medlemsskapsperiode> medlemsskapsperiode = new ArrayList<>();

    public Medlemsskap() {
        // TBC
    }

    public List<Medlemsskapsperiode> getMedlemsskapsperiode() {
        return medlemsskapsperiode;
    }
}
