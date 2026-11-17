
import java.util.LinkedList;
import java.util.Queue;

// AbstractClassQueue
abstract class AbstractClassQueue
{
    abstract void displayQueue(Queue<String> queue);
}

// SubClassQueue
class SubClassQueue extends AbstractClassQueue
{
    Queue<String> queue = new LinkedList<>();

    public void addItems()
    {
        queue.add("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");
    }

    @Override
    public void displayQueue(Queue<String> queue)
    {
        System.out.println("Queue: " + queue);
        System.out.println("Peek (front item): " + queue.peek());
        System.out.println("Element (front item): " + queue.element());

        System.out.println("Removed (poll): " + queue.poll());
        System.out.println("Removed (remove): " + queue.remove());

        System.out.println("Queue after removals: " + queue);
        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println("Queue size: " + queue.size());
    }
}

// MainQueue
public class MainQueue
{
    public static void main(String[] args)
    {
        SubClassQueue obj = new SubClassQueue();

        obj.addItems();
        obj.displayQueue(obj.queue);
    }
}
