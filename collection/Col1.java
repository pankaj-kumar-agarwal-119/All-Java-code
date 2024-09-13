
import java.util.ArrayList;
import java.util.List;

class Col1 {
    public static void main(String args[]){
        List<Integer> x1 = new ArrayList<Integer>();
        x1.add(11);
        x1.add(12);
        x1.add(15);
        System.out.println(x1.get(2));
        System.out.println("==> "+x1.indexOf(12));

        System.out.println("--------------------------------------");
        //what if we want to print all data individually
        for(int n:x1){
        System.out.println(n);
        }

        //Add String also
        List<String> x2 = new ArrayList<>();
        x2.add("Apple");
        x2.add("Banana");
        x2.add("Cherry");
        System.out.println("The fruits : "+x2);

    }
}