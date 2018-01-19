package samples;

import lombok.*;

import java.util.Date;

@Data
@Builder
public class PaymentWithLombok {

    @NonNull
    @Getter
    @Setter(AccessLevel.PRIVATE)
    private String id;
    private String debtor;
    private String creditor;
    private Date paymentDay;

}
