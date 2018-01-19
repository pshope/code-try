package samples;

import java.util.Date;

public class OldPayment {
    private String id;
    private String debtor;
    private String creditor;
    private Date paymentDay;

    public OldPayment() {
    }

    public OldPayment(String id, String debtor, String creditor, Date paymentDay) {
        this.id = id;
        this.debtor = debtor;
        this.creditor = creditor;
        this.paymentDay = paymentDay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDebtor() {
        return debtor;
    }

    public void setDebtor(String debtor) {
        this.debtor = debtor;
    }

    public String getCreditor() {
        return creditor;
    }

    public void setCreditor(String creditor) {
        this.creditor = creditor;
    }

    public Date getPaymentDay() {
        return paymentDay;
    }

    public void setPaymentDay(Date paymentDay) {
        this.paymentDay = paymentDay;
    }

    @Override
    public String toString() {
        return "OldPayment{" +
                "id='" + id + '\'' +
                ", debtor='" + debtor + '\'' +
                ", creditor='" + creditor + '\'' +
                ", paymentDay=" + paymentDay +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OldPayment that = (OldPayment) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (debtor != null ? !debtor.equals(that.debtor) : that.debtor != null) return false;
        if (creditor != null ? !creditor.equals(that.creditor) : that.creditor != null) return false;
        return paymentDay != null ? paymentDay.equals(that.paymentDay) : that.paymentDay == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (debtor != null ? debtor.hashCode() : 0);
        result = 31 * result + (creditor != null ? creditor.hashCode() : 0);
        result = 31 * result + (paymentDay != null ? paymentDay.hashCode() : 0);
        return result;
    }
}
