package good;

import bad.clients.FileIntegrationClient;
import bad.clients.IntegrationClient;
import bad.clients.MessageQueueIntegrationClient;
import bad.clients.WebserviceIntegrationClient;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import static java.util.Objects.isNull;

public class ClientSupplier {

    private static Map<String, Supplier<IntegrationClient>> SUPPLIER;

    static {
        final Map<String, Supplier<IntegrationClient>> clients = new HashMap<>();
        clients.put("FILE", FileIntegrationClient::new);
        clients.put("QUEUE", MessageQueueIntegrationClient::new);
        clients.put("WEBSERVICE", WebserviceIntegrationClient::new);
        SUPPLIER = Collections.unmodifiableMap(clients);
    }

    public IntegrationClient supplyClient(String clientType) {

        Supplier<IntegrationClient> client = SUPPLIER.get(clientType);
        if (isNull(client)) {
            throw new IllegalArgumentException("Invalid client type");
        }

        return client.get();
    }

}
