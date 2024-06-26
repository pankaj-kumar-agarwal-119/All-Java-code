class Prog23{
    static void displayMatricValues(int[][] matrixRef){
      System.out.println("Copied matrix length : "+matrixRef.length);
      for(int i=0;i<matrixRef.length;i++){
        for(int j=0;j<matrixRef[i].length;j++){
           System.out.print(matrixRef[i][j]+" ");
        }
        System.out.println();
    }
    }
    public static void main(String args[]){
        int[][] boardValues = {
     {1,2,3},
     {4,5,6},
     {9,8,7}
        };
        //lets create the new array to be copied
        int[][] copiedMatrix = new int[boardValues.length][boardValues[0].length];

        int MAX_VALUE = boardValues[0][0];
        int MIN_VALUE = boardValues[0][0];
        int sum = 0;
        int product = 1;

        for(int i=0;i<boardValues.length;i++){
            for(int j=0;j<boardValues[i].length;j++){
                //here logic goes on 
                if(boardValues[i][j]>MAX_VALUE){
                    MAX_VALUE = boardValues[i][j];
                }
                if(boardValues[i][j]<MIN_VALUE){
                    MIN_VALUE = boardValues[i][j];
                }
                product=product*boardValues[i][j];
                sum= sum+boardValues[i][j];

                copiedMatrix[i][j] = boardValues[i][j];
                //end
            }
        }
       
        System.out.println("The sum of all board values : "+sum);
        System.out.println("The product of all board values : "+product);
        System.out.println("The max of all board values : "+MAX_VALUE);
        System.out.println("The min of all board values : "+MIN_VALUE);
        displayMatricValues(copiedMatrix);
    }
}