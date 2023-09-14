package week01.exercise06;

import java.text.DecimalFormat;

public class PaymentChange {

    private double cost;
    private double payment;
    private double change;

    public void displayChange(double cost, double payment) {
        double change = payment - cost;

        System.out.println("------------------------");
        if (change < 0) {
            System.out.println("Valor insuficiente. São necessários: R$ " + change);
        } else {
            System.out.println("Valor do Troco: R$ " + String.format("%.2f", (Math.abs(change))));
            String[] cashAndCoins = getCashAndCoins(change);
            printChange(cashAndCoins);
        }
    }

    public static String[] getCashAndCoins(double change) {
        double[] cash = {100, 50, 20, 10, 5, 2};
        double[] coin = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < cash.length; i++) {
            int amount = (int) (change / cash[i]);
            change -= amount * cash[i];

            if (amount > 0) {
                stringBuilder.append(amount).append(" nota(s): R$ ").append(String.format("%.2f", (cash[i]))).append("\n");
            }
        }

        for (int i = 0; i < coin.length; i++) {
            int amount = (int) (change / coin[i]);
            change -= amount * coin[i];

            if (amount > 0) {
                stringBuilder.append(amount).append(" moeda(s): R$ ").append(String.format("%.2f", (coin[i]))).append("\n");
            }
        }
        return stringBuilder.toString().split("\n");
    }

    public static void printChange(String[] cashAndCoins) {
        System.out.println("------------------------");
        for (String money : cashAndCoins) {
            System.out.println(money);
        }
        System.out.println("------------------------");
    }
}