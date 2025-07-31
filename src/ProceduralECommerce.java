public class ProceduralECommerce {
    public static void main(String[] args) {
        double[] orderPrices = {499.99, 1299.50, 349.00, 999.99}; // today's orders
        double total = calculateTotal(orderPrices);
        System.out.println("Total Order Value (Today): ₹" + total);
    }

    public static double calculateTotal(double[] prices) {
        double sum = 0;
        for (double price : prices) {
            sum += price;
        }
        return sum;
    }
}