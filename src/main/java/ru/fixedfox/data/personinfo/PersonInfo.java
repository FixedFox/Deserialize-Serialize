package ru.fixedfox.data.personinfo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class PersonInfo {
    @JsonProperty("FindPersonInfo")
    public FindPersonInfo findPersonInfo;

    public PersonInfo() {
        this.findPersonInfo = new FindPersonInfo();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonInfo)) return false;
        PersonInfo that = (PersonInfo) o;
        return Objects.equals(findPersonInfo, that.findPersonInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(findPersonInfo);
    }
}
