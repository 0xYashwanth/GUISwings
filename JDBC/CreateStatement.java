import java.sql.*;    
public class CreateStatement {
    public static void main(String[] args) throws Exception{
        
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
            Statement stmt=con.createStatement();
            String str="create table emp(id number,name string)";
            stmt.executeUpdate(str);
            ResultSet rs=stmt.executeQuery("select * from emp");
            while(rs.next()){
                System.out.println(rs.getInt(1)+""+rs.getString(2));
            }
            con.close();


        
    }
}