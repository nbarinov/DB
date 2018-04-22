package services;

import beans.BusJourneysBean;
import ConnectionToDB.SingletoneConnection;
import dao.BusJourneyDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BusJourneyService implements BusJourneyDAO {
    @Override
    public ArrayList<BusJourneysBean> getAll() {
        ArrayList<BusJourneysBean> list = new ArrayList<>();
        try (Connection connection = SingletoneConnection.getDataSource().getConnection()) {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM bus_journeys");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BusJourneysBean bjb = new BusJourneysBean();
                bjb.setJourneyID(rs.getInt("journey_id"));
                bjb.setTimetableID(rs.getInt("timetable_id"));
                bjb.setWaybillID(rs.getInt("waybill_id"));
                bjb.setBusID(rs.getInt("bus_id"));
                bjb.setPlatformNumber(rs.getShort("platform_number"));
                list.add(bjb);
            }
        } catch (SQLException e) {
            System.out.println("Ошибка: " + e);
        }
        return list;
    }
}
