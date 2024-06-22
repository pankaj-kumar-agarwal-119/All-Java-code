interface Constants{
    int MAX_VALUE = 100;//public + final + static
}
class Test implements Constants{
    void printMaxvalue(){
        System.out.println("Max value : "+MAX_VALUE);
    }
}
class Prog13{
public static void main(String args[]){
    Test t1 = new Test();
    t1.printMaxvalue();
}
}