package somrat.info;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Chopstick {
    private int id;
    private Lock lock;

    public Chopstick(int id) {
        this.id = id;
        this.lock = new ReentrantLock();
    }

    public boolean pickUp(Philosopher philosopher, State state) throws InterruptedException {

        // this is where we simulate deadlock situations
        if (lock.tryLock(10, TimeUnit.MILLISECONDS)) {
            System.out.println(philosopher + " pick up " + state.toString() + " " + this);
            return true;
        }
        return false;
    }

    public void putDown(Philosopher philosopher) {
        lock.unlock();
        System.out.println(philosopher + " put down " + this);
    }

    @Override
    public String toString() {
        return "Chopstick: " + id;
    }
}
