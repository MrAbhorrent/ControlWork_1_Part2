public class Toy {

    private int id;
    private String name;
    private int quantity;
    private float dropRate;

    public Toy(int id, String name, int quantity, float dropRate) {
        this.id = id;
        setName(name);
        setQuantity(quantity);
        setDropRate(dropRate);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDropRate() {
        return dropRate;
    }

    public void setDropRate(float dropRate) {
        this.dropRate = dropRate;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + ", Имя: " + this.name + ", Шанс выпадения: " + this.dropRate;
    }
}
