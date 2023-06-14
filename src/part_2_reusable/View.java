package part_2_reusable;

import part_2_reusable.records.Currency;
import part_2_reusable.records.Product;

import java.util.List;

public class View {
    public View(List<Product> products) {
        System.out.println("Part 2: Reusable 🟢");
        generateTable(products);
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

    public void generateTable(List<Product> products) {
        String header = "| Product         | Image | Description                                        | Price     |%n";
        String border = "+-----------------+-------+----------------------------------------------------+-----------+%n";
        String rowFormat = "| %-15s | %-5s | %-50s | %-10s |%n";

        System.out.format(border);
        System.out.format(header);
        System.out.format(border);

        for (Product item : products) {
            String product = item.name();
            String image = item.image();
            String description = item.description();
            int price = item.price();

            System.out.format(rowFormat, product, image, description, price);
            System.out.format(border);
        }
    }
}
