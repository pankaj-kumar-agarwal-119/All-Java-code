
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Student {
    int age;
    String name;

    Student(int age,String name){
      this.age = age;
      this.name = name;
    }

    public String toString(){
        return this.name+" , "+this.age;
    }
}

class Col19 {
    public static void main(String args[]){

        //logic start
        Comparator<Student> com = new Comparator<Student>(){
          public int compare(Student i,Student j){
             if(i.age > j.age){
                return 1;
             }
             else{
                return -1;
             }
          }
        };

        //logic end

        List<Student> students = new ArrayList<>();
        students.add(new Student(22,"Sohan"));
        students.add(new Student(21,"Mohan"));
        students.add(new Student(23,"Rohan"));
        Collections.sort(students,com);
        System.out.println(students);

        for(Student s : students){
            System.out.println(s);
        }
    }
}