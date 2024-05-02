import java.sql.Connection;
 import java.sql.SQLException;
 import java.sql.DriverManager;
 import java.sql.Statement;
 import java.sql.ResultSet;
 public class SelectOracle
 {
 public static void main(String args[]) throws SQLException
 {
 System.out.println("Step 1: ");
 oracle.jdbc.driver.OracleDriver obj = new oracle.jdbc.driver.OracleDriver();
 // Class.forName(oracle.jdbc.driver.OracleDriver);
 System.out.println("Driver loaded successfully");
 
  System.out.println("Step 2: ");
  String url="jdbc:oracle:thin:@localhost:1521:XE",uname="SYSTEM" , 
password="Atharva007";
  Connection connection = DriverManager.getConnection(url,uname,password);
  if(connection!=null)
   System.out.println("Connection Established Successfully");
  else
   System.out.println("Connection Not Established Successfully");
 
   
  System.out.println("Step 3: ");
  Statement st = connection.createStatement();
  System.out.println("Statement Referenced   ");
 
  System.out.println("Step 4: ");
  System.out.println("Step 5: ");
  String qry = "select * from Student";
  ResultSet rs = st.executeQuery(qry);
  System.out.println("rs: "+rs);
   
  System.out.println("Step 6: ");
  System.out.println("Id\tName\taddress");
  while(rs.next())
  {
   int x = rs.getInt(1);
   String y = rs.getString("Name");
   String s = rs.getString(3);
   System.out.println(x+"\t"+y+"\t"+s);
  }    
     
  System.out.println("Step 7: ");
  rs.close();
  st.close();
  connection.close();
 } 
}