import java.util.LinkedList;
import java.util.Stack;

public class ex1 {
    public static void main(String[] args) {
        LinkedList<String> my_list = new LinkedList<>();
        my_list.add("q");
        my_list.add("w");
        my_list.add("e");
        //my_list.
        System.out.println(my_list);
        Stack<String> tempStack = new Stack<>();
        tempStack.addAll(my_list);
        my_list.clear();
        System.out.println(tempStack);
        while (!tempStack.empty()){
            my_list.add(tempStack.pop());
        }
        System.out.println(my_list);
        }
    }

