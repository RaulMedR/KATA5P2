package kata5p2.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import kata5p2.model.Mail;

public class MailListReaderBD {
    public static List<Mail> read(){
        List<Mail> list = new ArrayList<>();
        Connection conn = connect();
        
        String sql = "SELECT Mail FROM EMAIL";
        
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)){
            while(rs.next()){
                list.add(new Mail(rs.getString("Mail")));
            }
            
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        
        return list;
        

    }

    private static Connection connect() {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:KATA5.db";
            conn = DriverManager.getConnection(url);
            
        
        } catch (SQLException e){
            System.out.println(e.getMessage());
        } 
        return conn;
    }
}
