package part_2_reusable;

import part_2_reusable.records.Currency;
import part_2_reusable.records.Product;
import part_2_reusable.utilities.CurrencyConverter;
import part_2_reusable.utilities.Table;

import java.util.ArrayList;
import java.util.List;

public class View {
    public View(List<Product> products, Currency selectedCurrency) {
        System.out.println("Part 2: Reusable 🟢");
        generateTable(products, selectedCurrency);
        showPrompt();
    }

    // Methods
    public void showError() {
        System.out.println("Invalid number ❌");
    }

    public void showPrompt() {
        System.out.println("Choose a currency between 1-5");
        System.out.print("Choose an option and then press enter: ");
    }

    public void generateTable(List<Product> products, Currency selectedCurrency) {
        List<Integer> columnsWidth = List.of(15, 5, 50, 15);
        List<String> headers = List.of("Name", "Image", "Description", "Price");
        List<List<String>> rows = new ArrayList<>();

        for (Product item : products) {
            String product = item.name();
            String image = item.image();
            String description = item.description();
            String newPrice = CurrencyConverter.convert(item.price(), selectedCurrency);

            List<String> row = List.of(product, image, description, newPrice);
            rows.add(row);
        }

        new Table(columnsWidth, headers, rows);
    }
}
