package part_2_reusable;

import part_2_reusable.records.Currency;
import part_2_reusable.records.Product;
import part_2_reusable.utilities.CurrencyConverter;
import part_2_reusable.utilities.Table;

import java.util.ArrayList;
import java.util.List;

public class View {
    public View(List<Product> products, List<Currency> currencies, Currency selectedCurrency) {
        System.out.println("Part 2: Reusable 🟢");
        update(products, currencies, selectedCurrency);
    }

    // Methods
    public void showError() {
        System.out.println("Invalid number ⚠️");
    }

    public void update(List<Product> products, List<Currency> currencies, Currency selectedCurrency) {
        drawTableProducts(products, selectedCurrency);
        drawTableCurrencies(currencies);
        System.out.print("Choose an currency and then press enter: ");
    }

    private void drawTableCurrencies(List<Currency> currencies) {
        List<Integer> columnsWidth = List.of(1, 15, 10);
        List<String> headers = List.of("#", "Name", "Symbol");
        List<List<String>> rows = new ArrayList<>();

        for(Currency item: currencies) {
            String option = String.valueOf(item.id());
            String name = item.name();
            String symbol = item.symbol();

            List<String> newRow = List.of(option, name, symbol);
            rows.add(newRow);
        }

        new Table(columnsWidth, headers, rows);
    }

    private void drawTableProducts(List<Product> products, Currency selectedCurrency) {
        List<Integer> columnsWidth = List.of(15, 5, 50, 15);
        List<String> headers = List.of("Name", "Image", "Description", "Price");
        List<List<String>> rows = new ArrayList<>();

        for (Product item : products) {
            String product = item.name();
            String image = item.image();
            String description = item.description();
            String price = CurrencyConverter.convert(item.price(), selectedCurrency);

            List<String> newRow = List.of(product, image, description, price);
            rows.add(newRow);
        }

        new Table(columnsWidth, headers, rows);
    }
}