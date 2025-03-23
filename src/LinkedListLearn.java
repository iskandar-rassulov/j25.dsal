import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListLearn {

    static Scanner scan = new Scanner(System.in);
    static LinkedList<String> linky = new LinkedList<>();

    public static void main(String[] args){
        for(int i = 0; i < 5; i++){addLastElement();}

        deleteOnValue();

    }

    public static void addLastElement(){
        System.out.print("Input: ");
        linky.add(scan.next());
        System.out.println(linky);
    }

    private static void deleteOnValue(){
        System.out.print("Type who you want to delete: ");
        String val = scan.next();

        linky.removeIf(s -> s.equals(val));
        System.out.println(linky);
    }


}
