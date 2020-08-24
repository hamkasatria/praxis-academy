
import java.util.List;

public class VendingMachine {
    public long selectItemAndGetPrice(Item item);
    public void insertCoin(Coin coin);
    public List<coin> refund();
    public Bucket<Item, List<Coin>> collectItemAndChaged();
    public void reset();  
}