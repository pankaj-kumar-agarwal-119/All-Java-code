package demo5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class JdbcProg2 {
	/*
	 * 
	 * execute query , execute update takes a lot of enclosing double quotes that might be hectic sometimes
	 * So we will use preparedStatement(). Here we will use wild characters
	 */

	public static void main(String[] args) throws Exception {
		try {		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/firstproject";
		String uname = "root";
		String pass = "root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");//load the driver
        Connection con = DriverManager.getConnection(url,uname,pass);//establish connection
        System.out.println("The connection is : "+con);
        Statement st = con.createStatement();
        int flag = 1;
        //insert values
        
        do {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter id : ");
        int produt_id = Integer.parseInt(reader.readLine());
        System.out.println("Enter Product Name : ");
        String product_name = reader.readLine();
        System.out.println("Enter Price : ");
        int product_price = Integer.parseInt(reader.readLine());
//        String updateQuery = "insert into my_products values ("+produt_id+",'"+product_name+"',"+product_price+")";
        String updateQuery = "insert into my_products values(?,?,?)";
        PreparedStatement pst = con.prepareStatement(updateQuery) ;//create prepared statement object
        pst.setInt(1,produt_id);
        pst.setString(2, product_name);
        pst.setInt(3, product_price);
        int count = pst.executeUpdate();
        pst.close();
        if(count>0) {
        	String query = "select * from my_products";
        	ResultSet rs = st.executeQuery(query);
            while(rs.next()){
            System.out.println("=> "+rs.getInt(1)+ " "+rs.getString(2) + " "+ rs.getInt(3));
            }
        }
        
        System.out.println("Do you want to continue (yes/no) : ");
        flag = Integer.parseInt(reader.readLine());
        System.out.println("Your selected option is : "+flag);
        }while(flag != 0);
        //end
        
        st.close();
        con.close();
		}
		catch(Exception e) {
			System.out.println("The exception is : "+e);
		}
        
	}

}
