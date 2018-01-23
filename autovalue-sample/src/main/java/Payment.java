import com.google.auto.value.AutoValue;


import java.util.Date;

@AutoValue
abstract class Payment {


    static Builder builder() {
        return new AutoValue_Payment.Builder();
    }

    abstract String id();

    abstract String debtor();

    abstract String creditor();

    abstract Date paymentDay();

    abstract String description();

    @AutoValue.Builder
    abstract static class Builder {
        abstract Builder id(String id);

        abstract Builder debtor(String debtor);

        abstract Builder creditor(String creditor);

        abstract Builder paymentDay(Date paymentDate);

        abstract Builder description(String description);

        abstract Payment build();
    }
}
