import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class jdbcDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","Balajyothi@1991");
            String smt="INSERT INTO empdetails (empcode, empname, empage, esalary) VALUES\n" +
                    "(101, 'Jenny', 25, 10000),\n" +
                    "(102, 'Jacky', 30, 20000),\n" +
                    "(103, 'Joe', 20, 40000),\n" +
                    "(104, 'John', 40, 80000),\n" +
                    "(105, 'Shameer', 25, 90000);";
            Statement statement = con.createStatement();
            int result= statement.executeUpdate(smt);

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}