
import java.util.LinkedList;
import java.util.List;

/*
 * A LinkedList implements List,Deque. It provides better performance then ArrayList when it comes to adding and removing elements from middle of list
 * 
 */
class Col2 {
    public static void main(String args[]){
        List<String> animals = new LinkedList<String>();
        animals.add("Dog");
        animals.add("cat");
        animals.add("rabbit");
        for(String animal : animals){
            System.out.println("=> "+animal);
        }
    }
}