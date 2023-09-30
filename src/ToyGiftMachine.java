import java.util.List;

public class ToyGiftMachine implements GiftMachine {

    List<ToysSet> toysSet;

    public void initGiftMachine() {
        this.initGiftMachine(null);
    }

    public void initGiftMachine(List<ToysSet> toysSet) {
        this.toysSet = toysSet;
    }

    public Toy getGift(int id) throws IllegalStateException {
        if (id > 0) {
            for (ToysSet toyItem: toysSet) {
                if (toyItem.getToy().getId() == id && toyItem.getQuantity() > 0) {
                    toyItem.decreaseQuantity();
                    return toyItem.getToy();
                }
            }
        }
        return null;
    }
}
