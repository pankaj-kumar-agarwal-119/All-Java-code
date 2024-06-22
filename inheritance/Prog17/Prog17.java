interface Human{}

class Doctor implements Human{

}

class Engineer implements Human{

}

class Lawyer implements Human{

}

class Politician {

}

class Prog17{
    public static void main(String args[]){
        Doctor ob1 = new Doctor();
        System.out.println(ob1 instanceof Human);
        System.out.println(new Engineer() instanceof Human);
        System.out.println(new Politician() instanceof Human);
    }
}