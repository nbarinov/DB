package DAO;

import Beans.WaybillsBean;
import ConnectionToDB.SingletoneConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class WaybillsService implements WaybillsDAO{

    @Override
    public ArrayList<WaybillsBean> getAll() {
        ArrayList<WaybillsBean> list = new ArrayList<>();
        try(Connection connection = SingletoneConnection.getDataSource().getConnection()){
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM waybills");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                WaybillsBean tb = new WaybillsBean();
                tb.setWaybillID(rs.getInt("waybill_id"));
                tb.setAutocompanyID(rs.getInt("autocompany_id"));
                tb.setRouteID(rs.getInt("route_id"));
                tb.setWorkerID(rs.getInt("worker_id"));
                tb.setBusID(rs.getInt("bus_id"));
                tb.setDepartureTime(rs.getTime("departure_time"));
                tb.setArrivalTime(rs.getTime("arrival_time"));
                tb.setMedView(rs.getDate("med_view"));
                tb.setFuelAmount(rs.getShort("fuel_amount"));
                list.add(tb);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return list;
    }
}
