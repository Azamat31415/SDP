package chain_of_responsibility;

public class ClientBalanceHandler extends Handler {
    @Override
    public void handleRequest(ClientRequest request) {
        if (checkBalance(request)) {
            if (nextHandler != null) nextHandler.handleRequest(request);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    private boolean checkBalance(ClientRequest request) {
        return request.getBalance() >= 20.0;
    }
}
