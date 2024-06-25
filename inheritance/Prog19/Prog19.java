interface Store {
    String STORE_NAME = "SuperMart";
    String STORE_ADDRESS = "Koramangala 123 block";
    void purchaseItem(String itemId);//abstract method
    default void printReceipt(String transactionId){
        System.out.println("Transaction ID : "+transactionId);
        System.out.println("Thank you for shopping at : "+STORE_NAME);
    }
    static boolean validateItemId(String itemId){
     return true;
    }
    interface TransactionDetails {
        //all below are abstract methods
        String getTransactionId();
        String getItemPurchased();
        double getAmount();
    }
}
interface Product {
   String getProductId();
   String getProductName();
   double getPrice();
}
interface Customer {
String getCustomerId();
String getCustomerName();
}

interface Purchasable extends Store,Product {
void addTocart(String productId);
void checkout();
}
class OnlineStore implements Purchasable,Customer{
    private String customerid;
    private String customerName;
    private String productId;
    private String productName;
    private double price;
    OnlineStore(String customerid,String customerName){
     this.customerid = customerid;
     this.customerName = customerName;
    }
    @Override
    public void purchaseItem(String itemId){
        if(!Store.validateItemId(itemId)){
            System.out.println("Invalid item ID");
            return;
        }
        else{
            System.out.println(customerName+" purchase item with id : "+itemId);
        }
    }
    @Override
    public String getCustomerId(){
        return this.customerid;
    }
    @Override
    public String getCustomerName(){
        return this.customerName;
    }
    @Override
    public String getProductId(){
        return this.productId;
    }
    @Override
    public String getProductName(){
        return this.productName;
    }
    @Override
    public double getPrice(){
        return this.price;
    }
    @Override
    public void addTocart(String productId){
     this.productId = productId;
     this.productName = "Sample product";
     this.price = 100.0;
     System.out.println(productName+" Added to the cart.");
    }
    @Override
    public void checkout(){
        if(productId==null){
            System.out.println("No item in cart to checkout");
            return;
        }
        else{
            purchaseItem(this.productId);
            System.out.println("Checked out with product:"+this.productName+" for $"+this.price);
            printReceipt("TXN"+System.currentTimeMillis());
        }
    }
    class OnlineStoreTransactionDetails implements Store.TransactionDetails{
        private String transactionId;
        private String itemPurchased;
        private double amount;
        OnlineStoreTransactionDetails(String transactionId,String itemPurchased,double amount){
        this.transactionId = transactionId;
        this.itemPurchased = itemPurchased;
        this.amount = amount;
        }
        @Override
        public String getTransactionId(){
            return transactionId;
        }
        @Override
        public String getItemPurchased(){
            return itemPurchased;
        }
        @Override
        public double getAmount(){
            return amount;
        }
    }
    public Store.TransactionDetails getTransactionDetails(){
        return new OnlineStoreTransactionDetails("TXN123",productName,price);
    }


}
class Prog19 {
public static void main(String args[]){
    OnlineStore store = new OnlineStore("CUST123","Mohan");
    store.addTocart("ITEM-001");
    Store.TransactionDetails details = store.getTransactionDetails();
    System.out.println("Transaction ID : "+details.getTransactionId());
    System.out.println("Item purchased : "+details.getItemPurchased());
    System.out.println("Amount : "+details.getAmount());
}
}