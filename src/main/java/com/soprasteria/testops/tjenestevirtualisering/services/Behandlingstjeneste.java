package com.soprasteria.testops.tjenestevirtualisering.services;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soprasteria.testops.tjenestevirtualisering.domene.Behandler;
import com.soprasteria.testops.tjenestevirtualisering.modell.Fødselsnummer;

@RestController
public class Behandlingstjeneste {


    @PostMapping
    public Status startBehandling(Fødselsnummer fnr) {

        var status = Behandler.startBehandling(fnr);

        // mer?

        return status;
    }

    // Oppgave: Foreldrepenger

    // Brukerreise:
    //  1) Fyll inn fnr og trykk søk
    //  2) Svar: Godkjent eller ikke godkjent


    // Løsningsresien:
    //  1) Sjekk inngangsvilkår
    //  2) Beregn utbetaling
    //  3) Sjekk om det er et barn
}
