package QueueDS;

public class App {

    public static void main(String[] args) {
        QueueClass<Integer> queue = new QueueClass<>(5);

        queue.enqueue(5);
        queue.enqueue(1);
        queue.enqueue(53);
        queue.enqueue(7);
        queue.enqueue(511);

        while (!queue.isEmpty())
        {
            System.out.println(queue.dequeue());
        }

    }
}
