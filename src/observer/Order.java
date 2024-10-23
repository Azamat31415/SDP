package observer;

public class Order implements Subject {
    private Observer observer;
    private String status;

    public void setStatus(String status) {
        this.status = status;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer observer) {
        if (this.observer == null) {
            this.observer = observer;
            System.out.println("Observer added.");
        } else {
            System.out.println("An observer is already subscribed.");
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (this.observer == observer) {
            this.observer = null;
            System.out.println("Observer removed.");
        } else {
            System.out.println("No such observer is subscribed.");
        }
    }

    @Override
    public void notifyObserver() {
        if (this.observer != null) {
            observer.update(status);
        }
    }
}
