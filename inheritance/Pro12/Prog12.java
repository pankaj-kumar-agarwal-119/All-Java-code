interface MyMath{
    static int add(int a,int b){
        return a+b;
    }
}
class prog12{
    public static void main(String args[]){
        int ans = MyMath.add(2,3);
        System.out.println("The sum is : "+ans);
    }
}