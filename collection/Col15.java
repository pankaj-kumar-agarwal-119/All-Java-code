import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

class Col15 {
    public static void main(String args[]) {
        Collection<Integer> ob1 = new TreeSet<Integer>();
        ob1.add(11);
        ob1.add(112);
        ob1.add(16);
        ob1.add(14);
        ob1.add(14);
        ob1.add(14);
        Iterator<Integer> values = ob1.iterator();
        //hasNext() ,next()
        while (values.hasNext()) {
            System.out.println("=> " + values.next());
        }
    }
}
