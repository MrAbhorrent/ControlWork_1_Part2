public class Toy {

    private int id;
    private String name;
    private float dropRate;

    public Toy(int id, String name, float dropRate) {
        this.id = id;
        setName(name);
        setDropRate(dropRate);
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
