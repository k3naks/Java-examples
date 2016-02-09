package threads;

/**
 * Created by yshybeka on 2/5/2016.
 */
public class Task implements Runnable {
    private Testing t;
    private int threadNumber;

    private enum Nested {
        BIG, SMALL;

        public void access() {

        }
    }

    public Task(int threadNumber, Testing t) {
        this.threadNumber = threadNumber;
        this.t = t;
    }

    @Override
    public void run() {
        while (t.counter < 100) {
            int before = t.counter;
            System.out.println("Thread num " + threadNumber + " counter before is " + before);
            t.counter++;
            System.out.println("Thread num " + threadNumber + " counter after is " + t.counter + " difference "+ (t.counter-before));
        }
    }
}
