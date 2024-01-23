package ru.fixedfox.data.personinfo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class FindPersonInfo {
    @JsonProperty("PersonName")
    public PersonName personName;
    @JsonProperty("IdentityCard")
    public IdentityCard identityCard;
    @JsonProperty("PartyId")
    public int partyId;

    public FindPersonInfo() {
        this.personName = new PersonName();
        this.identityCard = new IdentityCard();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FindPersonInfo)) return false;
        FindPersonInfo that = (FindPersonInfo) o;
        return partyId == that.partyId && Objects.equals(personName, that.personName) && Objects.equals(identityCard, that.identityCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personName, identityCard, partyId);
    }
}
