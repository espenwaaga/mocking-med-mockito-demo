package com.soprasteria.testops.tjenestevirtualisering.registere;

import java.util.HashMap;
import java.util.Map;

import com.soprasteria.testops.tjenestevirtualisering.modell.Fødselsnummer;
import com.soprasteria.testops.tjenestevirtualisering.modell.Person;

public final class PersonRegister {

    private static final Map<Fødselsnummer, Person> personer = new HashMap<>();
    private static PersonRegister instance;

    private PersonRegister() {
    }

    public static PersonRegister getInstance() {
        if(instance == null) {
            instance = new PersonRegister();
        }
        return instance;
    }

    public Map<Fødselsnummer, Person> getPersoner() {
        return personer;
    }
}
