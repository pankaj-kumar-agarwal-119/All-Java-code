
import java.util.HashMap;
import java.util.Map;
class Col17 {
    public static void main(String args[]) {
        Map<String,Integer> students = new HashMap<>();
        students.put("Mohan", 21);
        students.put("Sohan", 22);
        students.put("Rohan", 23);
        students.put("Sohan", 24);
        System.out.println("The keys : "+students.keySet());
        for(String key : students.keySet()){
            System.out.println(key + " : "+students.get(key));
        }
    }
}
