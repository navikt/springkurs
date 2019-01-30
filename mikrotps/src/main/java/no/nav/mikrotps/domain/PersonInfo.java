package no.nav.mikrotps.domain;

import java.util.Objects;

public class PersonInfo {
    private final String id;
    private final String geografiskTilknytning;

    public PersonInfo(String id, String geografiskTilknytning) {
        this.id = id;
        this.geografiskTilknytning = geografiskTilknytning;
    }

    public String getId() {
        return id;
    }

    public String getGeografiskTilknytning() {
        return geografiskTilknytning;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonInfo that = (PersonInfo) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(geografiskTilknytning, that.geografiskTilknytning);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, geografiskTilknytning);
    }
}
