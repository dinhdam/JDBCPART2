import com.daoImpl.PersonDaoImpl;
import com.until.ConnectionConfiguration;

import java.sql.Connection;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
//        Connection connection = null;
//        try{
//            connection = ConnectionConfiguration.getConnection();
//            if(connection != null){
//                System.out.println(" Connection established");
//
//            }
//
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        } finally {
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//
//        }
        PersonDaoImpl pdi = new PersonDaoImpl();
        pdi.creatPersonTable();

    }
}
