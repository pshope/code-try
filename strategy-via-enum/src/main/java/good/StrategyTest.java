package good;

import bad.clients.IntegrationClient;

public class StrategyTest {
    public static void main(String[] args) {
        IntegrationClient fileClient = RefactoredIntegrationType.FILE.createClient();
        IntegrationClient webserviceClient = RefactoredIntegrationType.WEBSERVICE.createClient();
        IntegrationClient queueClient = RefactoredIntegrationType.QUEUE.createClient();

        System.out.println(fileClient.call("request"));
        System.out.println(webserviceClient.call("request"));
        System.out.println(queueClient.call("request"));

    }
}
