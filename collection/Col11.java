
import java.util.ArrayList;
import java.util.Collection;
class Col11 {
    public static void main(String args[]){
        Collection ob1 = new ArrayList();
        ob1.add(11);
        ob1.add(12);
        ob1.add(16);
        // ob1.add("bringal");
        System.out.println(ob1);
        // for(int n : ob1){
        //     System.out.println(n);
        // }
        for(Object n : ob1){
           int num = (Integer)n;
           System.out.println("==> "+num);
        }
}
}