public class ToysSet {

    private Toy toy;
    private int quantity;

    public ToysSet(Toy toy, int quantity) {
        setToy(toy);
        setQuantity(quantity);
    }

    public Toy getToy() {
        return toy;
    }

    public void setToy(Toy toy) {
        this.toy = toy;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("Количество предметов не может быть меньше 0");
            this.quantity = 0;
            return;
        }
        this.quantity = quantity;
    }

    public void decreaseQuantity() {
        this.quantity--;
    }

    public void addItem() {

    }
}
