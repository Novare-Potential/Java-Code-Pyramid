package part_2_reusable;

import part_2_reusable.records.Currency;
import part_2_reusable.records.Product;
import part_2_reusable.utilities.CurrencyConverter;
import part_2_reusable.utilities.Table;

import java.util.List;

public class View {
    public View(List<Product> products, Currency selectedCurrency) {
        System.out.println("Part 2: Reusable 🟢");
        generateTable(products, selectedCurrency);
        showPrompt();
    }

    // Methods
    public void showError() {
        System.out.println("Invalid number ⚠️");
    }

    public void showPrompt() {
        System.out.print("Choose an currency and then press enter: ");
    }

    public void generateTable(List<Product> products, Currency selectedCurrency) {
        List<Integer> columnsWidth = List.of(5, 5, 15, 5);
        List<String> headers = List.of("Name", "Image", "Description", "Price");
        List<List<String>> rows = List.of();
        /*
            rows = [
                row [flashlight, 🔦, 100],
                row [box, 📦, 20],
                row [can, 🥫, 50]
            ]
         */

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
