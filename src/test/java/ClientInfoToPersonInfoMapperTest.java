import org.junit.jupiter.api.Test;
import ru.fixedfox.data.clientinfo.ClientInfo;
import ru.fixedfox.data.personinfo.PersonInfo;

import static org.junit.jupiter.api.Assertions.*;

class ClientInfoToPersonInfoMapperTest {

    @Test
    void map_right_work() {
        var input = new ClientInfo();
        input.clientFindInfo.dul.documentType = 1;
        input.clientFindInfo.dul.number = 2;
        input.clientFindInfo.dul.series = 3;
        input.clientFindInfo.dul.firstName = "a";
        input.clientFindInfo.dul.lastName = "b";
        input.clientFindInfo.dul.secondName= "c";
        input.clientFindInfo.partyId = 4;

        var outputExpectation = new PersonInfo();
        outputExpectation.findPersonInfo.personName.firstName = "a";
        outputExpectation.findPersonInfo.personName.lastName = "b";
        outputExpectation.findPersonInfo.personName.middleName = "c";
        outputExpectation.findPersonInfo.identityCard.idType= 1;
        outputExpectation.findPersonInfo.identityCard.idNum = 2;
        outputExpectation.findPersonInfo.identityCard.idSeries = 3;
        outputExpectation.findPersonInfo.partyId = 4;

        assertEquals(new ClientInfoToPersonInfoMapper()
                .map.apply(input),
                outputExpectation);
    }
}