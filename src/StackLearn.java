import java.util.Scanner;
import java.util.Stack;

public class StackLearn {

    private static final Stack<String> textarea = new Stack<>();

    public static void main(String[] args){
        textTyper();
    }

    public static void textTyper(){
        Scanner scan = new Scanner(System.in);
        int temp = 0;

        while(temp == 0){
            String s = scan.next();

            if(s.equals("delete")){
                textarea.pop();
            }else if(s.equals("end")){
                temp = 1;
            }
            else{
                textarea.push(s);
            }

            System.out.println(textarea);
        }

    }

}
