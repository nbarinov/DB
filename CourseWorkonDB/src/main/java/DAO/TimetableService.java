package DAO;

import Beans.TimetablesBean;
import ConnectionToDB.SingletoneConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TimetableService implements TimetableDAO {

    @Override
    public ArrayList<TimetablesBean> getAll() {
        ArrayList<TimetablesBean> list = new ArrayList<>();
        try(Connection connection = SingletoneConnection.getDataSource().getConnection()){
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM timetables");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                TimetablesBean tb = new TimetablesBean();
                tb.setTimetableID(rs.getInt("timetable_id"));
                tb.setRouteID(rs.getInt("route_id"));
                tb.setDepartureTime(rs.getTime("departure"));
                tb.setArrivalTime(rs.getTime("arrival"));
                tb.setTravellTime(rs.getTime("travell_time"));
                tb.setPeriod(rs.getString("period"));
                list.add(tb);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return list;
    }
}
