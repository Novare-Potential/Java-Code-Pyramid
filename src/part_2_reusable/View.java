package part_2_reusable;

import part_2_reusable.records.Currency;
import part_2_reusable.records.Product;

import java.util.List;

public class View {
    public View(List<Product> inventory, List<Currency> currencies, Currency selectedCurrency) {
        System.out.println("Part 2: Reusable 🟢");
        generateTable(inventory);
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

    private void generateTable(List<Product> inventory) {
        String header = "| Product         | Image | Description                                        | Price |%n";
        String border = "+-----------------+-------+----------------------------------------------------+-------+%n";
        String tableFormat = "| %-15s | %-5s | %-50s | %-5d |%n";

        System.out.format(border);
        System.out.format(header);
        System.out.format(border);

        for (Product item : inventory) {
            String product = item.product();
            String image = item.image();
            String description = item.description();
            int price = item.price();

            System.out.format(tableFormat, product, image, description, price);
            System.out.format(border);
        }
    }
}
