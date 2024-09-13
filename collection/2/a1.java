
import java.util.ArrayList;
import java.util.Collection;

class A1 {
    public static void main(String args[]){
        Collection<Integer> a11 = new ArrayList<Integer>();
        a11.add(11);
        a11.add(12);
        a11.add(13);
        a11.add(14);
        System.out.println(a11);
        System.out.println("-----------------------");
        for(int n:a11){
            System.out.println(n);
        }
    }
}