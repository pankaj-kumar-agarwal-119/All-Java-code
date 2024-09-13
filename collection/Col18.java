
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Col18 {
    public static void main(String args[]){

        //logic start
        Comparator<Integer> com = new Comparator<Integer>(){
          public int compare(Integer i,Integer j){
             if(i%10 > j%10){
                return 1;
             }
             else{
                return -1;
             }
          }
        };

        //logic end

        List<Integer> x1 = new ArrayList<Integer>();
        x1.add(111);
        x1.add(12);
        x1.add(121);
        x1.add(15);
        System.out.println("List is : "+x1);
        Collections.sort(x1,com);
        System.out.println("List is : "+x1);
    }
}