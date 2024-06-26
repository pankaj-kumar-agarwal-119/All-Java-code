import java.util.Arrays;

class Prog24{
    static void printArray(int[] arrRef){
        for(int i=0;i<arrRef.length;i++){
            System.out.print(arrRef[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int[] arr = {5,4,9,2,17};
        //sort start
        Arrays.sort(arr);
        printArray(arr);
        //sort end
     System.out.println("*****************************************************");

       //sort from one index to another
       int[] arr2 = {5,4,9,2,17};
       Arrays.sort(arr2,2,4);
       printArray(arr2);

       //compare method : equals() method
       int[] arr3 = {5,4,9,2,17};
       int[] arr4 = {5,4,9,2,17};
       boolean compareStt = Arrays.equals(arr3,arr4);
       System.out.println("The 2 arrays comparision status : "+compareStt);
    }
}