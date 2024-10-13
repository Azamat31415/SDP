package iterator;

import java.util.List;
import java.util.Iterator;

public class DriverIterator implements Iterator<Driver> {
    private List<Driver> drivers;
    private int position = 0;

    public DriverIterator(List<Driver> drivers) {
        this.drivers = drivers;
    }

    @Override
    public boolean hasNext() {
        return position < drivers.size();
    }

    @Override
    public Driver next() {
        return drivers.get(position++);
    }
}