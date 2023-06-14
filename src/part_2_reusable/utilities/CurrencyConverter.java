package part_2_reusable.utilities;

import part_2_reusable.records.Currency;

public class CurrencyConverter {
    public static String convert(double amount, Currency newCurrency) {
        String newSymbol = newCurrency.symbol();
        double newPrice = amount * newCurrency.exchangeRate();

        return newSymbol + newPrice;
    }
}
