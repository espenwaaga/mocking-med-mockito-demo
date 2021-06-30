package com.soprasteria.testops.tjenestevirtualisering.domene;

import com.soprasteria.testops.tjenestevirtualisering.modell.Fødselsnummer;
import com.soprasteria.testops.tjenestevirtualisering.registere.PersonRegister;
import com.soprasteria.testops.tjenestevirtualisering.services.Status;

public class Behandler {

    private static final PersonRegister personRegister = PersonRegister.getInstance();

    public static Status startBehandling(Fødselsnummer fnr) {
        var person = personRegister.hentPerson(fnr);

        var inngangsvilkårOppfylt = Inngangsvilkår.erInngangsvilkårOppfylt(person);
        var beregnetInntekt = Beregning.hentBeregnetInntekt(person);
        Relasjon.hentRelasjoner(person);


        if (inngangsvilkårOppfylt && beregnetInntekt > 0) {
            return Status.GODKJENT;
        }
        return Status.AVSLÅTT;
    }
}
