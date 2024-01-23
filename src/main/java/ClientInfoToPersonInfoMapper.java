import ru.fixedfox.data.clientinfo.ClientInfo;
import ru.fixedfox.data.personinfo.PersonInfo;

import java.util.function.Function;

public class ClientInfoToPersonInfoMapper {

    Function<ClientInfo, PersonInfo> map = (input) -> {
        var output = new PersonInfo();
        output.findPersonInfo.personName.firstName = input.clientFindInfo.dul.firstName;
        output.findPersonInfo.personName.lastName = input.clientFindInfo.dul.lastName;
        output.findPersonInfo.personName.middleName = input.clientFindInfo.dul.secondName;
        output.findPersonInfo.identityCard.idNum = input.clientFindInfo.dul.number;
        output.findPersonInfo.identityCard.idSeries = input.clientFindInfo.dul.series;
        output.findPersonInfo.identityCard.idType = input.clientFindInfo.dul.documentType;
        output.findPersonInfo.partyId = input.clientFindInfo.partyId;
         return output;
    };
}
