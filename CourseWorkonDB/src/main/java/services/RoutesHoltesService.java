package services;

import beans.RoutesHaltesBean;
import ConnectionToDB.SingletoneConnection;
import dao.RoutesHaltesDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RoutesHoltesService implements RoutesHaltesDAO {
    @Override
    public ArrayList<RoutesHaltesBean> getAll() {
        ArrayList<RoutesHaltesBean> list = new ArrayList<>();
        try (Connection connection = SingletoneConnection.getDataSource().getConnection()) {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM routes_haltes");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                RoutesHaltesBean rhb = new RoutesHaltesBean();
                rhb.setRouteID(rs.getInt("route_id"));
                rhb.setHaltID(rs.getInt("halt_id"));
                list.add(rhb);
            }
        } catch (SQLException e) {
            System.out.println("Ошибка " + e);
        }
        return list;
    }
}
