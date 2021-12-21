package liskovForClass;

public class LiskovRunner {

    public static void main(String[] args) {
        final Transaction transaction = new Transaction();
        final StockTransaction stockTransaction = new StockTransaction();

        runLiskovForClass(stockTransaction);
        runLiskovForClass(transaction);
    }


    public static void runLiskovForClass(Transaction elementExtendTransaction){
        elementExtendTransaction.buy("Stock",33,50);
        elementExtendTransaction.sell("Stock",11,10);
    }
}
