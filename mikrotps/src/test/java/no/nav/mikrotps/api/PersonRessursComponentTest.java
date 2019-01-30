package no.nav.mikrotps.api;

import no.nav.mikrotps.config.ApplicationConfig;
import no.nav.mikrotps.domain.PersonInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Komponenttest av mikrotps - test at endepunktet (controlleren, for enkelhets skyld)
 * gir riktig svar
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class PersonRessursComponentTest {

    public static final String PERSON_ID = "1234567810";

    // TODO initialiser denne med Spring
    PersonRessurs personRessurs;

    @Test
    public void geografiskTilknytningErSatt() {
        String id = "1234567810";
        PersonInfo personInfo = personRessurs.hentPersonInfo(id);
        assertEquals(id, personInfo.getId());
        assertNotNull(personInfo.getGeografiskTilknytning());
    }

    @Test
    public void geografiskTilknytningErHardkodetTil0330() {
        PersonInfo personInfo = personRessurs.hentPersonInfo(PERSON_ID);
        assertEquals("0330", personInfo.getGeografiskTilknytning());
    }

}