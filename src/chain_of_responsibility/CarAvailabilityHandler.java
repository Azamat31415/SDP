package chain_of_responsibility;

public class CarAvailabilityHandler extends Handler {
    @Override
    public void handleRequest(ClientRequest request) {
        if (checkAvailability(request)) {
            if (nextHandler != null) nextHandler.handleRequest(request);
        } else {
            System.out.println("No cars available.");
        }
    }

    private boolean checkAvailability(ClientRequest request) {
        return true;
    }
}
