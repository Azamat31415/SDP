package template;

public class TaxiOrder {
    public static void main(String[] args) {
        OrderProcess orderProcess = new StandardOrderProcess();
        orderProcess.processOrder();
    }
}
