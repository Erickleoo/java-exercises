package util;

public class CurrencyConverter {

    public static final double IOF_PERCENT  = 6.0;

    public static double calculateTotalInReais(double price, double dollarsBought) {
        double base = price * dollarsBought;
        return  base + (base * IOF_PERCENT  / 100);
    }
}
