package good;

import bad.clients.FileIntegrationClient;
import bad.clients.IntegrationClient;
import bad.clients.MessageQueueIntegrationClient;
import bad.clients.WebserviceIntegrationClient;

public enum RefactoredIntegrationType {

    FILE {
        public IntegrationClient createClient() {
            return new FileIntegrationClient();
        }
    },
    WEBSERVICE {
        @Override
        public IntegrationClient createClient() {
            return new WebserviceIntegrationClient();
        }
    },
    QUEUE {
        @Override
        public IntegrationClient createClient() {
            return new MessageQueueIntegrationClient();
        }
    };

    public abstract IntegrationClient createClient();
}
