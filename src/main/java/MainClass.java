import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import ru.fixedfox.data.clientinfo.ClientInfo;

import java.io.File;
import java.io.IOException;

public class MainClass {

    private static final String inputFilePath = "/ClientInfo.xml";
    private static final String outputFilePath = "result/PersonaInfo.json";

    public static void main(String[] args) throws IOException {
        var xmlMapper = new XmlMapper();
        var objectMapper = new ObjectMapper();

        var xml = MainClass.class.getResourceAsStream(inputFilePath);
        var json = new File(outputFilePath);

        var clientInfo = xmlMapper.readValue(xml, ClientInfo.class);
        if (xml != null) {
            xml.close();
        }

        var personInfo = new ClientInfoToPersonInfoMapper()
                .map.apply(clientInfo);
        objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        objectMapper.writeValue(json, personInfo);
    }
}
