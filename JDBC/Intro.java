//to execute statments from MySQL using Java, we use JDBC


import java.sql.*;

public class Demo {
  public staic void main(String[] args) throws SQLException{

    String query = "select * from customers";

    try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/w3schools?user=root&password=[yourPass]")) {

      PreparedStatement preparedstatement = connection.prepareStatement(query);
      ResultSet resultset = preparestatement.executeQuery();

      while(resultset.next()) {
        System.out.println(resultset.getInt(1) + " " + resultset.getString(2)); // where 1 and 2 are colums
          }
      }  
  }
}


// if we dont want to use this, we can use cmd to directly access mySQL workbench

/* STEPS"

- mysql -u root -p[password]
- use [tablename];
- select * from customers;
*/
