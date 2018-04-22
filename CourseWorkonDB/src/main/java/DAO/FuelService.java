package DAO;

import Beans.FuelBean;
import ConnectionToDB.SingletoneConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FuelService implements FuelDAO {

    @Override
    public ArrayList<FuelBean> getAll() {
        ArrayList<FuelBean> list = new ArrayList<>();
        try(Connection connection = SingletoneConnection.getDataSource().getConnection()){
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM fuel");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                FuelBean tb = new FuelBean();
                tb.setFuelID(rs.getInt("fuel_id"));
                tb.setFuelMark(rs.getString("fuel_mark"));
                tb.setSeason(rs.getString("season"));
                list.add(tb);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return list;
    }
}
