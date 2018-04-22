package services;

import beans.BusMarksBean;
import ConnectionToDB.SingletoneConnection;
import dao.BusMarksDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BusMarksService implements BusMarksDAO {
    @Override
    public ArrayList<BusMarksBean> getAll() {
        ArrayList<BusMarksBean> list = new ArrayList<>();
        try (Connection connection = SingletoneConnection.getDataSource().getConnection()) {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM bus_marks");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BusMarksBean bmb = new BusMarksBean();
                bmb.setMarkID(rs.getInt("mark_id"));
                bmb.setFabricator(rs.getString("fabricator"));
                bmb.setNumFloors(rs.getShort("num_floors"));
                bmb.setSeatsNumber(rs.getShort("num_floors"));
                bmb.setFuelID(rs.getInt("fuel_id"));
                bmb.setOilID(rs.getInt("oil_id"));
                list.add(bmb);
            }
        } catch (SQLException e) {
            System.out.println("Ошибка: " + e);
        }
        return list;
    }
}
