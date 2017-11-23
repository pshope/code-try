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
        final Map<String, Command> clients = new HashMap<>();
        CLIENTS.put("FILE", new Command() {
            @Override
            public IntegrationClient create() {
                return new FileIntegrationClient();
            }
        });

    }

    static {
        final Map<String, Command> clients = new HashMap<>();
        CLIENTS.put("QUEUE", new Command() {
            @Override
            public IntegrationClient create() {
                return new MessageQueueIntegrationClient();
            }
        });

    }

    static {
        final Map<String, Command> clients = new HashMap<>();
        CLIENTS.put("WEBSERVICE", new Command() {
            @Override
            public IntegrationClient create() {
                return new WebserviceIntegrationClient();
            }
        });

    }


    public IntegrationClient createClient(String clientType) {
        Command command = CLIENTS.get(clientType);
        if (isNull(command)) {
            throw new IllegalArgumentException("Invalid client type");
        }
        return command.create();
    }


}