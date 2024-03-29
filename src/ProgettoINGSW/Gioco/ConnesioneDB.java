
package ProgettoINGSW.Gioco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Classe per connetterci al database (MySQL) di nome progettoingsw
public class ConnesioneDB {
    
    public static Connection getConnection(){ 
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //carichiamo i driver necessari per potersi collegare al database
            //Otteniamo una conessione passando url, username e la password
            con = DriverManager.getConnection("jdbc:mysql://localhost/progettoingsw", "root", "");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }
    
}

