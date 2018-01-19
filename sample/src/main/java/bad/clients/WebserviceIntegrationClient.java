package bad.clients;

public class WebserviceIntegrationClient implements IntegrationClient<String, String> {

    public String call(String request) {
        return "Webservice Integration Response";
    }
}
