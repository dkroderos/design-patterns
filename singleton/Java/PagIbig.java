import java.util.LinkedList;
import java.util.Queue;

public class PagIbig {
    private static PagIbig instance;
    private Queue<Integer> queue;
    private int currentNumber;

    private PagIbig() {
        queue = new LinkedList<Integer>();
    }

    public static synchronized PagIbig getInstance() {
        if (instance == null) {
            instance = new PagIbig();
        }

        return instance;
    }

    public void getQueueNumber() {
        queue.offer(currentNumber);

        System.out.println("Your queue number is : " + currentNumber);
        currentNumber++;
    }

    public void displayCurrentQueuedNumber() {
        if (queue.isEmpty()) {
            System.out.println("No one is currently queued!");
        } else {
            System.out.println("Current queued number is: " + queue.peek());
        }
    }
}
