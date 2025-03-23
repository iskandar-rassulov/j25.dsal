import java.util.Stack;

public class StackLearn {

    private static Stack<String> mugiwaras = new Stack<>();

    public static void main(String[] args){
        add("Zoro");
        add("Nami");
        add("Usopp");
        add("Sanji");
        System.out.println(mugiwaras);

        delete();
        System.out.println(mugiwaras);

        delete();
        System.out.println(mugiwaras);

        delete();
        System.out.println(mugiwaras);
    }

    public static void add(String name){
        mugiwaras.push(name);
        System.out.println(name + " will be with Luffy. Let's goo!!!");
    }

    public static void delete(){
        System.out.println("Oh we lost " + mugiwaras.pop());
    }
}
