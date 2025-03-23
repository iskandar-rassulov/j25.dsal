import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QueueLearn {

    private static final Queue<String> queue = new ArrayDeque<>();

    public static void main(String[] args){
        pizzaOrder();
    }

    private static void pizzaOrder(){
        int temp = 0;

        while(temp < 5){
            Scanner scan = new Scanner(System.in);
            System.out.print("Input id of the customer: ");
            updateOfQueue(scan.next());
            temp++;
        }

        temp = 0;
        while(temp < 3){
            deleteFromQueue();
            temp++;
        }


    }

    private static void updateOfQueue(String num){
        queue.add(num);
        System.out.println(queue);
    }

    private static void deleteFromQueue(){
        System.out.println("Number " + queue.poll() + " is done!");
        System.out.println(queue);
    }
}
