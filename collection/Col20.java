
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class Col20 {

    public static void main(String args[]){
        List<Integer> x1 = new ArrayList<Integer>();
        x1.add(11);
        x1.add(2);
        x1.add(34);
        x1.add(32);
        Collections.sort(x1);
        System.out.println(x1);
    }
}