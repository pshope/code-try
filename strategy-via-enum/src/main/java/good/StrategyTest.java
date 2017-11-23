package good;

public class StrategyTest {
    public static void main(String[] args) {
        System.out.println(RefactoredIntegrationType.FILE.createClient().call("request"));
        System.out.println(RefactoredIntegrationType.WEBSERVICE.createClient().call("request"));
        System.out.println(RefactoredIntegrationType.QUEUE.createClient().call("request"));

    }
}
