package part_2_reusable;

public class Project {
    public Project() {
        Model model = new Model();
        View view = new View(model.getInventory(), model.getCurrencies(), model.getSelectedCurrency());
        Controller controller = new Controller(model, view);

        controller.requestInput();
    }
}
