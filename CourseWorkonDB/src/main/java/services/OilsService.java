package services;

import beans.OilsBean;
import ConnectionToDB.SingletoneConnection;
import dao.OilsDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OilsService implements OilsDAO {

    @Override
    public ArrayList<OilsBean> getAll() {
        ArrayList<OilsBean> list = new ArrayList<>();
        try(Connection connection = SingletoneConnection.getDataSource().getConnection()){
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM oils");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                OilsBean tb = new OilsBean();
                tb.setOilID(rs.getInt("oil_id"));
                tb.setOilMark(rs.getString("oil_mark"));
                tb.setSeason(rs.getString("season"));
                list.add(tb);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return list;
    }
}
