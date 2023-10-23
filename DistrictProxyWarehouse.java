import java.util.HashMap;
import java.util.Map;

public class DistrictProxyWarehouse implements  Warehouse {

    public DistrictProxyWarehouse() {
        productList = new HashMap<>();
    }

    private GlobalWarehouse globalWarehouse;
    private Map<String,Integer> productList;

    public void getFromGlobalWarehouse(String productName){
        if (globalWarehouse == null){
            globalWarehouse = new GlobalWarehouse();
        }
        globalWarehouse.deliverProduct(productName);
        productList.put(productName,2);
    }
    @Override
    public void deliverProduct(String productName) {
        if (!productList.containsKey(productName)){
            getFromGlobalWarehouse(productName);
        }
        else if(productList.get(productName)<1){
            getFromGlobalWarehouse(productName);
        }

        else{
            System.out.println("Product delivered from District (Proxy) Warehouse.");
            int current_quantity = productList.get(productName);
            productList.put(productName,current_quantity-1);
            System.out.println(productList.get(productName) + " stock left of " + productName + "\n");
        }
    }
}
