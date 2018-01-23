import java.util.Date;

public class Main {


    public static void main(String[] args) {
        System.out.println("AutoValue Started >>>>>>>> ");
        Payment payment = Payment.builder()
                .id("82879988")
                .creditor("")
                .debtor("")
                .paymentDay(new Date())
                .description(null)
                .build();
        System.out.format("Payment %s created: ", payment.id());
    }
}
