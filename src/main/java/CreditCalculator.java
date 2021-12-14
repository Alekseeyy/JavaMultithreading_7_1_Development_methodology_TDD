public class CreditCalculator {

    public int monthlyPayment(int sum, int period, double rate) {
        return totalAmount(sum, period, rate) / period;
    }

    public int totalAmount(int sum, int period, double rate) {
        double percentages = (rate / 100) * (period / 12);
        return (int) (sum * percentages) + sum;
    }

    public int creditOverpayment(int sum, int period, double rate) {
        return totalAmount(sum, period, rate) - sum;
    }
}
