class Prog20{
    public static void main(String args[]){
        int[] myArray;//declaration
        myArray = new int[10];//initialize
        System.out.println(myArray);

        //declaration + Initialization + int array
        int[] myArr2 = new int[5];
        System.out.println(myArr2);
        System.out.println("The first element of array is : "+myArr2[0]);

        //declaration + Initialization + double array
        double[] myArr3 = new double[2];
        System.out.println(myArr3);
        System.out.println("The first element of array is : "+myArr3[0]);

        //Inline initialization
        int[] myArr4 = {1,2,4,5,6};
        System.out.println("The first element of array is : "+myArr4[0]);

        //Storing String array
        String[] names = {"Mohan","Sohan","Rohan"};
        System.out.println("First name : "+names[0]);
        System.out.println("Second name : "+names[1]);
        System.out.println("Third name : "+names[2]);

        //accessng the elements of array through the for loop
        for(int i=0;i<names.length;i++){
            System.out.println("==> "+names[i]);
        }
        //Find the sum of all the elements of array in int array
        int[] myArr6 = {1,2,3,4,5};
        int sum=0;
        for(int i=0;i<myArr6.length;i++){
          sum += myArr6[i];
        }
        System.out.println("The sum is : "+sum);

    }
}