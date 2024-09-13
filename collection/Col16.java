
import java.util.HashMap;
import java.util.Map;
class Col16 {
    public static void main(String args[]) {
        Map<String,Integer> students = new HashMap<>();
        students.put("Mohan", 21);
        students.put("Sohan", 22);
        students.put("Rohan", 23);
        students.put("Sohan", 24);
        System.out.println(students);
        System.out.println("Age of sohan : "+students.get("Sohan"));
        //If we want to get the list of keys
        System.out.println("The keys : "+students.keySet());
    }
}
