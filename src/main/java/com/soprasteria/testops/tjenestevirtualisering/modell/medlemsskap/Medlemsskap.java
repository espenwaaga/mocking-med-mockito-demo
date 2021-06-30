package com.soprasteria.testops.tjenestevirtualisering.modell.medlemsskap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Medlemsskap {

    private List<Medlemsskapsperiode> medlemsskapsperiode = new ArrayList<>();

    public Medlemsskap() {
        // TBC
    }

    public List<Medlemsskapsperiode> getMedlemsskapsperiode() {
        return medlemsskapsperiode;
    }


    public boolean harMedlemskap() {
        var norskeMedlemsskapsperioder = medlemsskapsperiode.stream()
                .filter(periode -> periode.getLandskode() == Landskode.NOR)
                .collect(Collectors.toList());
        return !norskeMedlemsskapsperioder.isEmpty();
    }
}
