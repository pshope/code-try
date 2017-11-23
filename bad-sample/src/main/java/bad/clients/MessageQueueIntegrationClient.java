package bad.clients;

public class MessageQueueIntegrationClient implements IntegrationClient<String,String> {

    public String call(String request) {
        return "Message Queue Integration Response";
    }
}
