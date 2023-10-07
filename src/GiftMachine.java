public interface GiftMachine {

    void initGiftMachine();
    Toy getGift(int id)throws IllegalStateException;
}
