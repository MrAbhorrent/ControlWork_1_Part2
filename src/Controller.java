import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Controller {

    ToyGiftMachine toyGiftMachine;
    View view;
    List<Toy> toyList;


    public void run(List<Toy> toyList) {
        this.toyList = toyList;
        view = new View();
        view.MainMenu();
        init();
        printListToy(this.toyList);
        raffleToys();
    }

    private void init() {
        toyGiftMachine = new ToyGiftMachine();
        toyGiftMachine.initGiftMachine(toyList);
    }

    private void printListToy(List<Toy> toyList) {
        int count = 1;
        StringBuilder stringBuilder = new StringBuilder("\n");
        for (Toy toy: toyList) {
            stringBuilder.append(String.format("%d - %s%n", count++, toy.toString()));
        }
        view.printStr("Список игрушек", stringBuilder.toString());
    }

    public void raffleToys() {
        List<Toy> prizeToy = new ArrayList<>();

        for (Toy toyItem : toyList) {
            int quantity = toyItem.getQuantity();
            int frequency = toyItem.getDropRate();

            for (int i = 0; i < quantity * frequency / 100; i++) {
                prizeToy.add(toyItem);
            }
            toyItem.setQuantity(quantity - quantity * frequency / 100);
        }

        if (!prizeToy.isEmpty()) {
            Toy prizeToyItem = prizeToy.get(0);
            prizeToy.remove(0);
            writeToFile(prizeToyItem);
        }
    }

    private void writeToFile(Toy toyItem) {
        try (FileWriter writer = new FileWriter("prize_toys.txt")) {
            writer.write(toyItem.getId() + " ==> ");
            writer.write(toyItem.getName() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
