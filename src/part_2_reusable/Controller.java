package part_2_reusable;

import java.util.Scanner;

public class Controller {
    // Properties
    private final Model model;
    private final View view;
    private final Scanner scanner;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    // Methods
    public void requestInput() {
        String input = scanner.nextLine();

        try {
            int selectedOption = Integer.parseInt(input.trim());

            model.setSelectedCurrency(model.getCurrencies().get(selectedOption - 1));
        }
        catch (NumberFormatException | IndexOutOfBoundsException exception) {
            view.showError();
        }

        view.update(model.getProducts(), model.getCurrencies(), model.getSelectedCurrency());
        requestInput();
    }
}