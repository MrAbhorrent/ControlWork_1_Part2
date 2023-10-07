import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    private static final int MAX_TOYS_QUANTITY = 10;
    private static final int NUMBER_TOYS = 6;

    private static final String[] toysNames = {
            "кораблик", "кукла", "пистолетик", "рогатка", "машинка", "конструктор"
    };
    private static final int[] iDs = { 111, 2222, 333, 444, 55555, 6666};
    private static final int[] chanceDrop = { 45, 14, 5, 40, 2, 1};



    public static void main(String[] args) {

        // Создаем массив для розыгрыша
        List<Toy> toyList = createToysList(NUMBER_TOYS, MAX_TOYS_QUANTITY);
        Controller controller = new Controller();
        controller.run(toyList);
    }

    private static List<Toy> createToysList(int number_toys, int max_quantity) {
        if (max_quantity == 0) {
            return null;
        }
        Random random = new Random();
        List<Toy> list = new ArrayList<>();
        int values;
        for (int i = 0; i < number_toys; i++) {
            values = random.nextInt(MAX_TOYS_QUANTITY) + 1;
            list.add(new Toy(iDs[i], toysNames[i], values, chanceDrop[i]));
        }
        return list;
    }
}
