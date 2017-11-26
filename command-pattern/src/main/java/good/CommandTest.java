package good;

import bad.clients.IntegrationClient;

public class CommandTest {
    public static void main(String[] args) {
        CreateClientCommand createClientCommand = new CreateClientCommand();
        System.out.println(createClientCommand.createClient("FILE")
                .call(""));
        System.out.println(createClientCommand.createClient("QUEUE")
                .call(""));
        System.out.println(createClientCommand.createClient("WEBSERVICE")
                .call(""));
        System.out.println(createClientCommand.createClient("Invalid")
                .call(""));
    }
}
