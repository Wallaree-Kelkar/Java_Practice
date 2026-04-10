abstract class Payment {
    private String tid;
    private double amt;

    Payment(String tid, double amt) {
        this.tid = tid;
        this.amt = amt;
    }

    public String getTid() {
        return tid;
    }

    public double getAmt() {
        return amt;
    }

    abstract double processPayment();
}

class CreditCardPayment extends Payment {
    CreditCardPayment(String tid, double amt) {
        super(tid, amt);
    }

    double processPayment() {
        return getAmt() * 1.02;
    }
}

class UPIPayment extends Payment {
    private String uid;

    UPIPayment(String tid, double amt, String uid) {
        super(tid, amt);
        this.uid = uid;
    }

    double processPayment() {
        if (uid == null || uid.isEmpty()) {
            System.out.println("Invalid UPI ID");
            return 0;
        }
        return getAmt();
    }
}

class PaymentProcessor {
    double process(Payment p) {
        return p.processPayment();
    }
}

public class SmartPay {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment("TXN1", 1000);
        Payment p2 = new UPIPayment("TXN2", 1000, "user@upi");

        Payment[] arr = {p1, p2};

        PaymentProcessor pp = new PaymentProcessor();
        double total = 0;

        for (Payment p : arr) {
            double res = pp.process(p);
            System.out.println(res);
            total += res;
        }

        System.out.println("Total: " + total);
    }
}
