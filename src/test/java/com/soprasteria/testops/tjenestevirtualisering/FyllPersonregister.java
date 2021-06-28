package com.soprasteria.testops.tjenestevirtualisering;

import java.time.LocalDate;
import java.util.List;

import com.soprasteria.testops.tjenestevirtualisering.modell.Fødselsnummer;
import com.soprasteria.testops.tjenestevirtualisering.modell.Kjønn;
import com.soprasteria.testops.tjenestevirtualisering.modell.Navn;
import com.soprasteria.testops.tjenestevirtualisering.modell.Person;
import com.soprasteria.testops.tjenestevirtualisering.modell.arbeidsforhold.Arbeidsforhold;
import com.soprasteria.testops.tjenestevirtualisering.modell.medlemsskap.Landskode;
import com.soprasteria.testops.tjenestevirtualisering.modell.medlemsskap.Medlemsskap;
import com.soprasteria.testops.tjenestevirtualisering.modell.medlemsskap.Medlemsskapsperiode;
import com.soprasteria.testops.tjenestevirtualisering.registere.PersonRegister;

public final class FyllPersonregister {

    public static void registerPersoner() {
        var personregister = PersonRegister.getInstance();
        var personer = personregister.getPersoner();

        var person1 = new Person(
                new Navn("Ola", "", "Nordmann"),
                Kjønn.MANN,
                new Fødselsnummer("111111 12345"),
                medlemsskapNorsk(),
                new Arbeidsforhold(false));
        var person2 = new Person(
                new Navn("Birgitte", "", "Beslutter"),
                Kjønn.KVINNE,
                new Fødselsnummer("999999 99999"),
                medlemsskapUtenland(),
                new Arbeidsforhold(true));

        personer.put(person1.getFødselsnummer(), person1);
        personer.put(person2.getFødselsnummer(), person2);


    }

    private static Medlemsskap medlemsskapNorsk() {
        var medlemsskap = new Medlemsskap();
        medlemsskap.getMedlemsskapsperiode().add(new Medlemsskapsperiode(Landskode.NOR, LocalDate.now().minusYears(10), LocalDate.now()));
        return medlemsskap;
    }

    private static Medlemsskap medlemsskapUtenland() {
        var medlemsskap = new Medlemsskap();
        medlemsskap.getMedlemsskapsperiode().add(new Medlemsskapsperiode(Landskode.USA, LocalDate.now().minusYears(10), LocalDate.now()));
        return medlemsskap;
    }
}
