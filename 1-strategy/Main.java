public class Main {
    public static void main(String[] args) {
        PaymentContext pc = new PaymentContext();

        // pay using credit card
        pc.setPaymentStrategy(new CreditCardPayment("as", "asbc"));
        pc.executePayment(1234567);
    }
}