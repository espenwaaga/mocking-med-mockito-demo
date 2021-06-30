package com.soprasteria.testops.tjenestevirtualisering.domene;

import com.soprasteria.testops.tjenestevirtualisering.modell.Person;

public class Inngangsvilkår {


    public static boolean erInngangsvilkårOppfylt(Person person) {

        var godkjentMedlemskap = sjekkMedlemskap(person);
        // sjekkFødsel()?
        // opptjening()?

        return godkjentMedlemskap;
    }

    private static boolean sjekkMedlemskap(Person person) {
        return person.getMedlemsskap().harMedlemskap();
    }
}
