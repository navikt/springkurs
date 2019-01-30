package no.nav.mikrotps.api;


import no.nav.mikrotps.domain.PersonInfo;
import no.nav.mikrotps.services.PersonService;
import org.springframework.stereotype.Controller;

@Controller
public class PersonRessurs {

    // TODO initaliser i Spring
    private PersonService personService;

    public PersonInfo hentPersonInfo(String id) {
        return personService.hentPersonInfo(id);
    }

}
