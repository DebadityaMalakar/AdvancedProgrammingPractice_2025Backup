public class ProceduralBanking {
    public static void main(String[] args) {
        double[] savingsBalances = {1500.50, 3200.75, 890.00, 2700.30};
        double total = calculateTotalBalance(savingsBalances);
        System.out.println("Total Savings Balance: ₹" + total);
    }

    public static double calculateTotalBalance(double[] balances) {
        double total = 0;
        for (double balance : balances) {
            total += balance;
        }
        return total;
    }
}