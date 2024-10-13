package chain_of_responsibility;

public class ClientRequest {
    private String location;
    private double balance;

    public ClientRequest(String location, double balance) {
        this.location = location;
        this.balance = balance;
    }

    public String getLocation() {
        return location;
    }

    public double getBalance() {
        return balance;
    }
}