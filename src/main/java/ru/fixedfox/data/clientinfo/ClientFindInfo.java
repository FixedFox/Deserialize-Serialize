package ru.fixedfox.data.clientinfo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "clientFindInfo")
public class ClientFindInfo {
    public Dul dul;
    public int partyId;

    public ClientFindInfo() {
        this.dul = new Dul();
    }
}
