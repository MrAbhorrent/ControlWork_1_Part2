public class Toy {

    private int id;
    private String name;
    private int quantity;
    private int dropRate;

    /**
     *
     * @param id - iD игрушки
     * @param name - Наименование игрушки
     * @param quantity - Количество
     * @param dropRate - Частота выпадения игрушки (вес в % от 100)
     */
    public Toy(int id, String name, int quantity, int dropRate) {
        setId(id);
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

    public boolean decreaseQuantity() {
        if ( this.quantity > 0 ) {
            this.quantity--;
            return true;
        }
        return false;
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
        if (!name.isEmpty()) {
            this.name = name;
            return;
        }
        this.name = "Игрушка";
    }

    public int getDropRate() {
        return dropRate;
    }

    public void setDropRate(int dropRate) {
        this.dropRate = dropRate;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + ", Имя: " + this.name + ", Шанс выпадения: " + this.dropRate;
    }
}
