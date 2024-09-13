
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Student implements Comparable<Student> {
    int age;
    String name;
    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        } else {
            return -1;
        }
    }
    public String toString() {
        return this.name + "," + this.age;
    }
}

class Col21 {
    public static void main(String args[]) {
        List<Student> x1 = new ArrayList<Student>();
        x1.add(new Student(23,"Rohan"));
        x1.add(new Student(21,"Mohan"));
        x1.add(new Student(22,"Sohan"));
        Collections.sort(x1);
        System.out.println(x1);
        for(Student ob : x1){
            System.out.println(ob);
        }
    }
}
