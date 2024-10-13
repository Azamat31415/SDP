package chain_of_responsibility;

public class DispatchHandler extends Handler {
    @Override
    public void handleRequest(ClientRequest request) {
        if (checkDispatch(request)) {
            System.out.println("Dispatch successful.");
        } else {
            System.out.println("Dispatch failed.");
        }
    }

    private boolean checkDispatch(ClientRequest request) {
        return true;
    }
}