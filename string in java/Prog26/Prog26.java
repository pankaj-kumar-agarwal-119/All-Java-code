class Prog26{
    public static void main(String[] args){
        //First way of creating array is STring literal
        //length() method is returning the size of string
        String str1 = "Hello World!";
        System.out.println("The length of string is : "+str1.length());

        //charAt(index) : will return character at particular index
        System.out.println("The character at 2nd index : "+str1.charAt(2));

        //substring(int beginIndex,int endIndex)
        System.out.println("The sub string is : "+str1.substring(1,5));
    }
}