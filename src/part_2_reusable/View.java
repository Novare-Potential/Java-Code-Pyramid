package part_2_reusable;

import part_2_reusable.records.Currency;
import part_2_reusable.records.Product;
import part_2_reusable.utilities.CurrencyConverter;

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
        String header = "| Product         | Image | Description                                        | Price |%n";
        String rowFormat = "| %-15s | %-5s | %-50s | %-5s |%n";
        String borderFormat = "+-----------------+-------+----------------------------------------------------+-------+%n";

        System.out.format(borderFormat);
        System.out.format(header);
        System.out.format(borderFormat);

        for (Product item : products) {
            String product = item.product();
            String image = item.image();
            String description = item.description();
            String price = CurrencyConverter.convert(item.price(), selectedCurrency);

            System.out.format(rowFormat, product, image, description, price);
            System.out.format(borderFormat);
        }
    }
}
