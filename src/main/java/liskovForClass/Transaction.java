package liskovForClass;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Transaction {

    public void buy(String stock, int quantity, float price) {
        // implement buy logic here
    }

    ;

    public void sell(String stock, int quantity, float price) {
        // implement sell logic here
    }

    ;
}


class StockTransaction extends Transaction {

    private final Map<String, Stock> stockProperties = new HashMap<>();

    @Override
    public void buy(String stockKey, int quantity, float price) {
        if (stockProperties.containsKey(stockKey)) {
            final Stock stock = stockProperties.get(stockKey);
            stockProperties.compute(stockKey, (k, v) ->
                    new Stock(stock.getQuantity() - quantity, stock.getPrice() - price, stock.getName()));
            System.out.println("Transaction proceed.");
        }
        System.out.println("Transaction not proceed, no stock found.");
    }

    @Override
    public void sell(String stock, int quantity, float price) {
        // implement Stock-specific sell logic here
    }

    public Map<String, Stock> getStockProperties() {
        return Collections.unmodifiableMap(stockProperties);
    }
}
