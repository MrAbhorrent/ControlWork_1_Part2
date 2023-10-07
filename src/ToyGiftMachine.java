import java.util.List;

public class ToyGiftMachine implements GiftMachine {

    List<Toy> toysSet;

    public void initGiftMachine() {
        this.initGiftMachine(null);
    }

    public void initGiftMachine(List<Toy> toysSet) {
        this.toysSet = toysSet;
    }

    public Toy getGift(int id) throws IllegalStateException {
        if (id > 0) {
            for (Toy toyItem : toysSet) {
                if (toyItem.getId() == id) {
                     if (toyItem.decreaseQuantity()) {
                         return toyItem;
                     }
                }
            }
        }
        return null;
    }
}
