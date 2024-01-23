package ru.fixedfox.data.clientinfo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "clientInfo")
public class ClientInfo {
    public ClientFindInfo clientFindInfo;

    public ClientInfo() {
        this.clientFindInfo = new ClientFindInfo();
    }
}
