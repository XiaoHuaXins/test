package Service;

import Dao.LoninDao;
import entity.Lonin;

import java.sql.SQLException;

public class AddService {
    public boolean add(Lonin lonin) throws SQLException {
        LoninDao loninDao = new LoninDao();
       if(loninDao.query(lonin)){
           System.out.println(loninDao.query(lonin));
          return loninDao.insert(lonin);
       }
       else return false;
    }
}
