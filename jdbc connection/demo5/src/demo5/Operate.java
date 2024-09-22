package demo5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class Operate {

	public static void main(String[] args) throws Exception {
		try {		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/firstproject";
		String uname = "root";
		String pass = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");//load the driver
        Connection con = DriverManager.getConnection(url,uname,pass);//establish connection
        System.out.println("The connection is : "+con);//print the connection
        
        Statement st = con.createStatement();//create statement
        //take input from user
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int next=0;
        do {
        System.out.println("Enter the id : ");
        int id = Integer.parseInt(reader.readLine());
        System.out.println("Enter scooter name : ");
        String productName = reader.readLine();
        System.out.println("Enter the scooter price : ");
        int price = Integer.parseInt(reader.readLine());
        String query = "insert into products values ("+id+",'"+productName+"',"+price+")";
        
        int count = st.executeUpdate(query);
        System.out.println("rows effected : "+count);
        
        System.out.println("Do you want to add more ?");
        next = Integer.parseInt(reader.readLine());
        System.out.println("The next read is : "+next);
        }while(next==1);
        st.close();
        con.close();
		}
		catch(Exception e) {
			System.out.println("The exception is : "+e);
		}
        
	}

}
