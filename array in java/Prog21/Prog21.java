class Prog21{
    public static void main(String args[]){
        int[][] matrix = {
            {1,2,3},//0th index
            {4,5,6},//1st index
            {7,8,9}//2nd index
        };
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}