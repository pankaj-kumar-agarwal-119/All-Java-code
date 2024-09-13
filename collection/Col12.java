
import java.util.ArrayList;
import java.util.List;
class Col12 {
    public static void main(String args[]){
        List<Integer> ob1 = new ArrayList<Integer>();
        ob1.add(11);
        ob1.add(112);
        ob1.add(16);
        System.out.println("2nd index value : "+ob1.get(2));//get()
        System.out.println("2nd index value : "+ob1.indexOf(16));//indexOf()
        System.out.println(ob1);
        for(int n : ob1){
            System.out.println(n);
        }
}
}