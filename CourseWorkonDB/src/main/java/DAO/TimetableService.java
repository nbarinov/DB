package DAO;

import Beans.TimetablesBean;
import ConnectionToDB.SingletoneConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class TimetableService implements TimetableDAO {

    @Override
    public ArrayList<TimetablesBean> getAll() {
        ArrayList<TimetablesBean> list = new ArrayList<>();
        try(Connection connection = SingletoneConnection.getDataSource().getConnection()){
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM timetables");
        }catch (SQLException e){
            System.out.println(e);
        }
        return null;
    }
}
