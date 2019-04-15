package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static Connection conn;
    private static String url = "Cot-CIS3365-03.cougarnet.uh.edu";
    private static String user = "mason";
    private static String pass = "mason1234";

    public static Connection connect() throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        }
        catch(ClassNotFoundException cnfe){
            System.err.println("Error:" +cnfe.getMessage());
        }
        catch(InstantiationException ie){
            System.err.println("Error:"+ie.getMessage());
        }
        catch(IllegalAccessException iae){
            System.err.println("Error:"+iae.getMessage());
        }
        conn = DriverManager.getConnection(url,user,pass);
        return conn;

    }

    public static Connection getConnection() throws SQLException, ClassNotFoundException{
     if(conn !=null && !conn.isClosed())
         return conn;
     connect();
     return conn;
    }


//    public static void ClearDatabaseInfo() {
//    }

    public static com.mysql.jdbc.Connection GetConnection() {
        try{
            String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
            //String url = getUrl();
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, user, pass);
            //conn.setNetworkTimeout(null, 120);
            System.out.println("Connection successfully created!");

            DBConnection.user = user;
            DBConnection.pass = pass;
            return (com.mysql.jdbc.Connection) conn; //Successfully connected to the database
        }
        catch(Exception e)
        {
            //Error on connecting to the database
            System.out.println("Failed to create connection!");
            String m = "Error: "+e;
            System.out.println(m);
            return null;
        }
    }
//
//        if((!pass.isEmpty()||pass!=null)&&(!user.isEmpty()||user!=null)){
//            return GetConnection(user, pass);
//        }
//        return null;

    }

