package DAO;

import Beans.StationsBean;
import ConnectionToDB.SingletoneConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StationsService implements StationsDAO{

    @Override
    public ArrayList<StationsBean> getAll() {
        ArrayList<StationsBean> list = new ArrayList<>();
        try(Connection connection = SingletoneConnection.getDataSource().getConnection()){
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM stations");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                StationsBean tb = new StationsBean();
                tb.setStationID(rs.getInt("station_id"));
                tb.setCity(rs.getString("city"));
                tb.setStreet(rs.getString("street"));
                tb.setPhoneNumber(rs.getString("phone_numer"));
                list.add(tb);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return list;
    }
}
