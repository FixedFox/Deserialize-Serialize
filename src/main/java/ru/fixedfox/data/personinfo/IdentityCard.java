package ru.fixedfox.data.personinfo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class IdentityCard {
    @JsonProperty("IdType")
    public int idType;
    @JsonProperty("IdSeries")
    public int idSeries;
    @JsonProperty("IdNum")
    public int idNum;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IdentityCard)) return false;
        IdentityCard that = (IdentityCard) o;
        return idType == that.idType && idSeries == that.idSeries && idNum == that.idNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idType, idSeries, idNum);
    }
}
