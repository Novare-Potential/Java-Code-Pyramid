package part_2_reusable_bad;

import part_2_reusable_bad.records.Currency;
import part_2_reusable_bad.records.Product;

import java.util.List;

public class View {
    String header = "| Product         | Image | Description                                        | Price |%n";
    String border = "+-----------------+-------+----------------------------------------------------+-------+%n";

    public View(List<Product> inventory, List<Currency> currencies, Currency selectedCurrency) {
        generateHeaders();
        generateRows(inventory);
        showPrompt();
    }

    private void generateHeaders() {
        System.out.println("1 Readable Good ✅");
        System.out.format(border);
        System.out.format(header);
        System.out.format(border);
    }

    // Methods
    public void showError() {
        System.out.println("Invalid number ❌");
    }

    public void showPrompt() {
        System.out.println("Choose a currency between 1-5"); // Refactor, hard coded
        System.out.print("Choose an option and then press enter: ");
    }


    private void generateRows(List<Product> inventory) {
        String tableFormat = "| %-15s | %-5s | %-50s | %-5d |%n";

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
