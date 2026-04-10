import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class CreateDB {
 public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/Student";
        String user = "root";
        String password = "Wall@SYSEM4";  // your mysql password

        try {

            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(url, user, password);

            System.out.println("Connected to MySQL Database!");

            // Create Statement
            Statement stmt = con.createStatement();

            // Execute Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            // INSERT
            // INSERT
String insertQuery = "INSERT INTO student (sid, sname, adr) VALUES (?,?,?)";
PreparedStatement ps1 = con.prepareStatement(insertQuery);

ps1.setInt(1, 102);          // sid → int
ps1.setString(2, "Amit");    // sname → string
ps1.setString(3, "DL");      // adr → string (IMPORTANT CHANGE)

ps1.executeUpdate();

System.out.println("Updated Table after INSERT query:");

rs = stmt.executeQuery("SELECT * FROM student");

while (rs.next()) { 
    int id = rs.getInt("sid"); 
    String name = rs.getString("sname"); 
    String adr = rs.getString("adr"); 

    System.out.println(id + " " + name + " " + adr);
}

// UPDATE
String updateQuery = "UPDATE student SET adr=? WHERE sid=?";
PreparedStatement ps2 = con.prepareStatement(updateQuery);

ps2.setString(1, "Mumbai");   // adr → string
ps2.setInt(2, 102);           // sid → int

ps2.executeUpdate();

System.out.println("Updated Table after UPDATE query:");

rs = stmt.executeQuery("SELECT * FROM student");

while (rs.next()) { 
    int id = rs.getInt("sid"); 
    String name = rs.getString("sname"); 
    String adr = rs.getString("adr"); 

    System.out.println(id + " " + name + " " + adr);
}


// DELETE
String deleteQuery = "DELETE FROM student WHERE sid=?";
PreparedStatement ps3 = con.prepareStatement(deleteQuery);

ps3.setInt(1, 102);   // sid → int

ps3.executeUpdate();

System.out.println("Updated Table after DELETE query:");

rs = stmt.executeQuery("SELECT * FROM student");

while (rs.next()) { 
    int id = rs.getInt("sid"); 
    String name = rs.getString("sname"); 
    String adr = rs.getString("adr"); 

    System.out.println(id + " " + name + " " + adr);
}

//con.close();
System.out.println("CRUD operations done!");


            // Display Data
            while (rs.next()) {
                int sid = rs.getInt("sid");
                String sname = rs.getString("sname");
                String adr = rs.getString("adr");

                System.out.println(sid + " " + sname + " " + adr);
            }


            // calling stored procedure
            CallableStatement cs = con.prepareCall("{call insertion(?,?,?)}");
            cs.setInt(1,18);
            cs.setString(2,"G");
            cs.setString(3,"Z");

            cs.execute();
            System.out.println("stored procedure executed successfully");



            //calling stored procedure
            CallableStatement cst = con.prepareCall("{call updating(?,?)}");
            cst.setInt(1, 2);         // sid
            cst.setString(2, "Pune"); 
            System.out.println("updated successfully");
            cst.execute();


            // calling procedure for deletion
            CallableStatement cstt = con.prepareCall("{call deleting(?)}");
            cstt.setInt(1,10);
            cstt.execute();
            System.out.println("deleted successfully!");

            // Close Connection
            con.close();


        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}

