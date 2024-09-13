

import java.util.HashSet;
class Col12 {
    public static void main(String args[]){
        HashSet<Integer> ob1 = new HashSet<Integer>();
        ob1.add(100);
        ob1.add(11);
        ob1.add(112);
        ob1.add(16);
        ob1.add(11);
        System.out.println(ob1);
        for(int n : ob1){
            System.out.println(n);
        }
}
}