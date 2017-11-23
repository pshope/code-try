package bad;

import bad.clients.IntegrationClient;
import bad.factories.IntegrationClientFactory;
import bad.factories.IntegrationType;

public class BadMain {
    public static void main(String[] args) {

        IntegrationClientFactory clientFactory = new IntegrationClientFactory();
        IntegrationClient fileClient = clientFactory.create(IntegrationType.FILE);
        System.out.println(fileClient.call("request"));
        IntegrationClient webClient = clientFactory.create(IntegrationType.WEBSERVICE);
        System.out.println(webClient.call("request"));
        IntegrationClient queueClient = clientFactory.create(IntegrationType.QUEUE);
        System.out.println(queueClient.call("request"));
    }
}
