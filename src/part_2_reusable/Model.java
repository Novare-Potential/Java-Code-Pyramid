package part_2_reusable;

import part_2_reusable.records.Currency;
import part_2_reusable.records.Product;

import java.util.List;

public class Model {
    // Properties
    private final List<Product> products = List.of(
            new Product(0,"Flashlight", "🔦", "A really great flashlight", 100, "usd"),
            new Product(1,"Tin can", "🥫", "Pretty much what you would expect from a tin can", 32, "usd"),
            new Product(2,"Cardboard Box", "📦", "It holds things", 5, "usd")
    );
    private final List<Currency> currencies = List.of(
            new Currency(1,"usd", "$", 1.00),
            new Currency(2, "rupee", "₹", 66.78),
            new Currency(3, "yuan", "元", 6.87),
            new Currency(4, "swedish krona", "SEK", 9.81),
            new Currency( 5,"sucres", "S./", 25000.00)
    );

    private Currency selectedCurrency = currencies.get(0);

    // Methods
    public List<Product> getProducts() {
        return products;
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public Currency getSelectedCurrency() {
        return selectedCurrency;
    }

    public void setSelectedCurrency(Currency selectedCurrency) {
        this.selectedCurrency = selectedCurrency;
    }
}
