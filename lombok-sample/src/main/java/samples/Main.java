package samples;

import lombok.Cleanup;
import lombok.SneakyThrows;

import java.io.ByteArrayOutputStream;
import java.util.Date;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        OldPayment oldPayment = new OldPayment();
        oldPayment.setCreditor("3838283923823");
        System.out.println(oldPayment.getCreditor());
        oldPayment.setDebtor(null);
        System.out.println(oldPayment.getDebtor());

        PaymentWithLombok paymentWithLombok = new PaymentWithLombok("id",
                "dr", "cr", new Date());
        System.out.println(paymentWithLombok.getId());
        @Cleanup ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(new byte[]{'a' });
        System.out.println(PaymentWithLombok.builder()
                .id("")
        .creditor("333333333")
        .debtor("444444444")
        .paymentDay(new Date())
        .build().toString());


        PaymentWithLombok.builder().id(null)
                .creditor("sa")
                .debtor("sa").build();


    }
}
