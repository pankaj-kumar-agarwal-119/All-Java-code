class Prog22{
public static void main(String[] args){
    int[] marks = {92,88,99,70,91};
    int MAX_MARK = marks[0];
    for(int i=0;i<marks.length;i++){
     if(marks[i]>MAX_MARK){
       MAX_MARK = marks[i];
      }
    }
    System.out.println("The max mark is : "+MAX_MARK);
}
}