package ru.fixedfox.data.clientinfo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "dul")
public class Dul {
    public int documentType;
    public String firstName;
    public String lastName;
    public String secondName;
    public int number;
    public int series;
}
