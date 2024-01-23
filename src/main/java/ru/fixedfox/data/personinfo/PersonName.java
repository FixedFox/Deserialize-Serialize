package ru.fixedfox.data.personinfo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class PersonName {
    @JsonProperty("LastName")
    public String lastName;

    @JsonProperty("FirstName")
    public String firstName;

    @JsonProperty("MiddleName")
    public String middleName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonName)) return false;
        PersonName that = (PersonName) o;
        return Objects.equals(lastName, that.lastName) && Objects.equals(firstName, that.firstName) && Objects.equals(middleName, that.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, middleName);
    }
}
