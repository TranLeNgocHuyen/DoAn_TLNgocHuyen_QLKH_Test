package DLA;
import DTO.AccountDTO;
import Utils.ConnectionUtils;
import Utils.MySQLConnUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
public class AccountDLA 
{
    static ConnectionUtils dbUtils;
    static Connection con;
    static PreparedStatement preparedStatement=null;
    static ResultSet resultset=null;
    /*public static void tesConnect()throws SQLException, ClassNotFoundException{
       con=dbUtils.getMyConnection();
    }*/
    public static ResultSet Login(String Username, String Password)
    {
        con= dbUtils.getMyConnection();
        String sql="SELECT * FROM qlkh_test.into WHERE Username=? and Password=?";
        try {
           preparedStatement=con.prepareStatement(sql);
           preparedStatement.setString(1,Username);
           preparedStatement.setString(2,Password);
           return preparedStatement.executeQuery();
        }
        catch(Exception e){
            return resultset=null;
        }
    }
}
