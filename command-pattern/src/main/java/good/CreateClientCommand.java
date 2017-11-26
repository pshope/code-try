package good;

import bad.clients.FileIntegrationClient;
import bad.clients.IntegrationClient;
import bad.clients.MessageQueueIntegrationClient;
import bad.clients.WebserviceIntegrationClient;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.isNull;

public class CreateClientCommand {
    private static Map<String, Command> CLIENTS = new HashMap<>();

    static {
        CLIENTS.put("FILE", FileIntegrationClient::new);

    }

    static {
        CLIENTS.put("QUEUE", MessageQueueIntegrationClient::new);

    }

    static {
        CLIENTS.put("WEBSERVICE", WebserviceIntegrationClient::new);

    }


    public IntegrationClient createClient(String clientType) {
        Command command = CLIENTS.get(clientType);
        if (isNull(command)) {
            throw new IllegalArgumentException("Invalid client type");
        }
        return command.create();
    }


}