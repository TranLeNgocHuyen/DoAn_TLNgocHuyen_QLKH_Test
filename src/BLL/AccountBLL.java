package BLL;
import DLA.AccountDLA;
import java.sql.SQLException;
public class AccountBLL 
{
    AccountDLA accountDLA;
    public void Login(String Username,String Password) throws SQLException, ClassNotFoundException
    {
        accountDLA.Login(Username,Password);
    }
	
}
