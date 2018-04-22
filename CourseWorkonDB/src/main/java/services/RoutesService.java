package services;

import beans.RoutesBean;
import ConnectionToDB.SingletoneConnection;
import dao.RoutesDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RoutesService implements RoutesDAO {

    @Override
    public ArrayList<RoutesBean> getAll() {
        ArrayList<RoutesBean> list = new ArrayList<>();
        try(Connection connection = SingletoneConnection.getDataSource().getConnection()){
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM routes");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                RoutesBean tb = new RoutesBean();
                tb.setRouteID(rs.getInt("route_id"));
                tb.setIdDepPoint(rs.getInt("dep_point"));
                tb.setIdArrPoint(rs.getInt("arr_point"));
                tb.setExtension(rs.getShort("extension"));
                list.add(tb);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return list;
    }
}
