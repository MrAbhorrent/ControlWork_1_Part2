import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    private static final int MAX_TOYS = 10;
    private static final String[] toysNames = {
            "кораблик", "кукла", "пистолетик", "рогатка", "машинка", "конструктор"
    };

    public static void main(String[] args) {

        // Создаем массив для розыгрыша
        List<Toy> toyList = createToysList(MAX_TOYS);
    }

    private static List<Toy> createToysList(int max_quantity) {
        if (max_quantity == 0) {
            return null;
        }
        int id = 0;
        Random random = new Random();

        List<Toy> list = new ArrayList<>();
        for (int i = 0; i < max_quantity; i++) {

        }
        return list;
    }
}
