package services;

import beans.RepairsBean;
import ConnectionToDB.SingletoneConnection;
import dao.RepairsDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RepairsService implements RepairsDAO {

    @Override
    public ArrayList<RepairsBean> getAll() {
        ArrayList<RepairsBean> list = new ArrayList<>();
        try(Connection connection = SingletoneConnection.getDataSource().getConnection()){
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM repais");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                RepairsBean tb = new RepairsBean();
                tb.setRepairID(rs.getInt("repair_id"));
                tb.setBreakageID(rs.getInt("breakage_id"));
                tb.setStartDate(rs.getDate("start_date"));
                tb.setEndDate(rs.getDate("end_date"));
                tb.setRepName(rs.getString("rep_name"));
                tb.setRepSurname(rs.getString("rep_surname"));
                tb.setRepFname(rs.getString("rep_fname "));
                tb.setRepCost(rs.getShort("rep_cost"));
                list.add(tb);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return list;
    }
}
