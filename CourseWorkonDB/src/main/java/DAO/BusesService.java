package DAO;

import Beans.BusesBean;
import ConnectionToDB.SingletoneConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BusesService implements BusesDAO {

    @Override
    public ArrayList<BusesBean> getAll() {
        ArrayList<BusesBean> list = new ArrayList<>();
        try(Connection connection = SingletoneConnection.getDataSource().getConnection()){
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM buses");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                BusesBean tb = new BusesBean();
                tb.setBusID(rs.getInt("bus_id"));
                tb.setStateNumber(rs.getString("state_number"));
                tb.setRun(rs.getShort("run"));
                tb.setTecService(rs.getDate("tec_service"));
                tb.setMarkID(rs.getInt("mark_id"));
                tb.setAutocompanyID(rs.getInt("autocompany_id"));
                list.add(tb);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return list;
    }
}
