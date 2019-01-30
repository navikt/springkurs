package no.nav.mikrotps.services;

import no.nav.mikrotps.domain.PersonInfo;

public class PersonService {

    //TODO Hent fra property
    private String geografiskTilknytning;

    public PersonInfo hentPersonInfo(String id) {
        return new PersonInfo(id, geografiskTilknytning);
    }
}
