


import java.util.Set;
import java.util.TreeSet;
class Col14 {
    public static void main(String args[]){
        Set<Integer> ob1 = new TreeSet<Integer>();
        ob1.add(11);
        ob1.add(112);
        ob1.add(16);
        ob1.add(14);
        ob1.add(14);
        ob1.add(14);
        System.out.println(ob1);
        for(int n : ob1){
            System.out.println(n);
        }
}
}