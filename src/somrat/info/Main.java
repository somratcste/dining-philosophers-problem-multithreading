package somrat.info;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = null;
        Philosopher[] philosophers = null;
        Chopstick[] chopsticks = null;

        try {
            philosophers = new Philosopher[Constants.NUMBER_OF_PHILOSPHERS];
            chopsticks = new Chopstick[Constants.NUMBER_OF_CHOPSTICKS];

            for (int i = 0; i < Constants.NUMBER_OF_CHOPSTICKS; ++i) {
                chopsticks[i] = new Chopstick(i);
            }

            executorService = Executors.newFixedThreadPool(Constants.NUMBER_OF_PHILOSPHERS);

            for (int i = 0; i < Constants.NUMBER_OF_PHILOSPHERS; ++i) {
                // chopsticks[(i+1) % Constants.NUMBER_OF_PHILOSPHERS] because the 4 th philosopher need chopstick 4 and 0
                // last philosopher 4 -> 4+1 -> 5%5 = 0
                philosophers[i] = new Philosopher(i, chopsticks[i], chopsticks[(i+1) % Constants.NUMBER_OF_PHILOSPHERS]);
                executorService.execute(philosophers[i]);
            }

            Thread.sleep(Constants.SIMULATION_RUNNING_TIME);

            for (Philosopher philosopher: philosophers) {
                // helps to run method going to break infinite while loop
                philosopher.setFull(true);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
            while (!executorService.isTerminated()) {
                // we are waiting 1 sec then try again until terminate the all service
                Thread.sleep(1000);
            }
            for (Philosopher philosopher: philosophers) {
                System.out.println(philosopher + " eat " + philosopher.getEatingCounter() + " times!");
            }
        }
    }
}
