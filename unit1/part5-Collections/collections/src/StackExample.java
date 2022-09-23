import java.util.Stack;

public class StackExample {
    public static void main(String[] args){

        Stack<String> names = new Stack<>();

        //methods
        // names.add("Adam");  works
        names.push("Adam");
        names.push("Cory");
        names.push("Marco");
        names.push("Daniel");
        names.push("Anna");

        System.out.println(names.size());
        // System.out.println(names.peek());   returns last item
        // System.out.println(names.pop());   returns and removes last item

        while(!names.isEmpty()) {
            System.out.println(names.pop());
        }
    }
}
