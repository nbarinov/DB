package DAO;

import Beans.WorkersBean;
import ConnectionToDB.SingletoneConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class WorkersService implements WorkersDAO{

    @Override
    public ArrayList<WorkersBean> getAll() {
        ArrayList<WorkersBean> list = new ArrayList<>();
        try (Connection connection = SingletoneConnection.getDataSource().getConnection()) {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM workers");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                WorkersBean wb = new WorkersBean();
                wb.setWorkerId(rs.getInt("worker_id"));
                wb.setSurname(rs.getString("surname"));
                wb.setName(rs.getString("name"));
                wb.setFathername(rs.getString("fathername"));
                wb.setPostition(rs.getString("postition"));
                wb.setExperience(rs.getShort("experience"));
                wb.setCity(rs.getString("city"));
                wb.setStreet(rs.getString("street"));
                wb.setRoomNumber(rs.getShort("room_number"));
                wb.setPhoneNumber(rs.getString("phone_number"));
                list.add(wb);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
}
