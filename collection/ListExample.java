import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String args[]){
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        System.out.println("Fruit is : "+fruits.get(0));
    }
}