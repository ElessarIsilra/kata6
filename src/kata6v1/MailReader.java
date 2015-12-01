package kata6v1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MailReader {
    public static ArrayList <Person> read() throws ClassNotFoundException, SQLException {
        ArrayList <Person> people = new ArrayList<>();
        Class.forName("org.sqlite.JDBC");
        Connection cn = DriverManager.getConnection("jdbc:sqlite:KATA.sDB");
        Statement st = cn.createStatement();
        ResultSet rs= st.executeQuery("SELECT * FROM people");
        while(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String genero = rs.getString("genero");
            String mail = rs.getString("mail");
            float peso = rs.getFloat("peso");
            people.add(new Person(id,name,mail,peso,genero));
        }
        
        return people;
    }
    
}
