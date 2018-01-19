package bad.clients;

public class FileIntegrationClient implements IntegrationClient<String,String> {



    public String call(String request) {
        return "File integration response.";
    }
}
