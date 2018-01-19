package good;

import bad.clients.IntegrationClient;

public class SupplierTest {



    public static void main(String[] args) {
        ClientSupplier supplier = new ClientSupplier();
        System.out.println(supplier.supplyClient("FILE").call(""));
        System.out.println(supplier.supplyClient("QUEUE").call(""));
        System.out.println(supplier.supplyClient("WEBSERVICE").call(""));
        System.out.println(supplier.supplyClient("INVALID").call(""));
    }
}
