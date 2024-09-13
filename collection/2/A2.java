import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

class A2 {
    public static void main(String args[]){
        Collection<Integer> x1 = new TreeSet<Integer>();
        x1.add(11);
        x1.add(121);
        x1.add(15);
        System.out.println(x1);
        for(int n:x1){
        System.out.println(n);
        }

    }
}