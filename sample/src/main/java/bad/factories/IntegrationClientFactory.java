package bad.factories;

import bad.clients.FileIntegrationClient;
import bad.clients.IntegrationClient;
import bad.clients.MessageQueueIntegrationClient;
import bad.clients.WebserviceIntegrationClient;

public class IntegrationClientFactory {
    public IntegrationClient create(IntegrationType integrationType) {
        switch (integrationType) {
            case FILE:
                return new FileIntegrationClient();
            case WEBSERVICE:
                return new WebserviceIntegrationClient();
            case QUEUE:
                return new MessageQueueIntegrationClient();
            default:
                throw new IllegalArgumentException();
        }
    }
}
