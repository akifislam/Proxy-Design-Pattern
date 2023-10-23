import java.util.ArrayList;
import java.util.Map;

public class GlobalWarehouse implements Warehouse {
    @Override
    public void deliverProduct(String productName) {
        System.out.println("The " + productName + " is immediately delivered from Global Warehouse.");
        System.out.println("2 " + productName + " added to stock from Global Warehouse" +"\n");
    }

}
