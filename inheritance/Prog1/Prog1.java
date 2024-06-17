class Book {
    private String title;
    private String author;
    private String publisher;
    private double price;
    private int yearPublished;

    //Constructor
    Book(String title,String author,String publisher,double price,int yearPublished){
    this.title = title;
    this.author = author;
    this.publisher = publisher;
    this.price = price;
    this.yearPublished = yearPublished;
    }


    public void displayDetails(){
        System.out.println(this.title+","+this.author+","+this.publisher+","+this.price+","+this.yearPublished);
    }
}
class Novel extends Book{
    private String genre;
    Novel(String title,String author,String publisher,double price,int yearPublished,String genre){
    super(title,author,publisher,price,yearPublished);
    this.genre = genre;
    }

    @Override //java annotation for method overriding
    public void displayDetailsNovel(){
        super.displayDetails();
        System.out.println(this.genre);
    }
}

class Prog1 {
    public static void main(String args[]){
        Novel ob1 = new Novel("Let us C","Yashwant kanetkar","BmP Publication",200,1992,"Study");
        ob1.displayDetails();
    }
}