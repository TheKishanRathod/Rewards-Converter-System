public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor accepting cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        // Convert cash value to miles using the conversion rate
        this.milesValue = cashValue / 0.0035;
    }

    // Constructor accepting miles value
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            // Convert miles to cash using the conversion rate
            this.cashValue = milesValue * 0.0035;
        }
    }

    // Get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Get miles value
    public double getMilesValue() {
        return milesValue;
    }
}
