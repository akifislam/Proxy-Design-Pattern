
/*
    This is a demonstration of Proxy Pattern.
    When a client orders a product, first it will be searched on the local/district/proxy warehouse.
    If the product exists there, it will be served from proxy warehouse.

    Otherwise, the product will be delivered from global warehouse.
    Besides, 2 new copy of the same product will be delivered to proxy warehouse for further use.

 */
public class ProxyPatternDemo {
    public static void main(String[] args) {

        DistrictProxyWarehouse districtwarehouse = new DistrictProxyWarehouse();

        // 1st Order of Macbook Air - Delivered from Global Warehouse
        // 2 copy of Macbook Air sent to Proxy Warehouse considering that people may buy it in future again.
        districtwarehouse.deliverProduct("Macbook Air");

        // 2nd Order of Macbook Air - Delivered from Proxy Warehouse
        districtwarehouse.deliverProduct("Macbook Air");

        // 3rd Order of Macbook Air - Delivered from Proxy Warehouse.
        // No more Macbook Air available on Proxy Warehouse.
        districtwarehouse.deliverProduct("Macbook Air");

        // 4th Order of Macbook Air - Delivered from Global Warehouse.
        // 2 copy of Macbook Air sent to Proxy Warehouse considering that people may buy it in future again.
        districtwarehouse.deliverProduct("Macbook Air");

        // 5th Order of Macbook Air - Delivered from Proxy Warehouse
        districtwarehouse.deliverProduct("Macbook Air");


    }
}