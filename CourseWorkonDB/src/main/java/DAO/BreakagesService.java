package DAO;

import Beans.BreakagesBean;
import ConnectionToDB.SingletoneConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BreakagesService implements BreakagesDAO{

    @Override
    public ArrayList<BreakagesBean> getAll() {
        ArrayList<BreakagesBean> list = new ArrayList<>();
        try(Connection connection = SingletoneConnection.getDataSource().getConnection()){
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM breakages");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                BreakagesBean tb = new BreakagesBean();
                tb.setBreakageID(rs.getInt("breakage_id"));
                tb.setBreakDate(rs.getDate("break_date"));
                tb.setBreakType(rs.getString("break_type"));
                tb.setBusID(rs.getInt("bus_id"));
                list.add(tb);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return list;
    }
}
