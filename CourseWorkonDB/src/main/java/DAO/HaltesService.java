package DAO;

import Beans.HaltesBean;
import ConnectionToDB.SingletoneConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class HaltesService implements HaltesDAO {

    @Override
    public ArrayList<HaltesBean> getAll() {
        ArrayList<HaltesBean> list = new ArrayList<>();
        try(Connection connection = SingletoneConnection.getDataSource().getConnection()){
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM haltes");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                HaltesBean tb = new HaltesBean();
                tb.setHaltID(rs.getInt("halt_id"));
                tb.setHaltName(rs.getString("halt_name"));
                list.add(tb);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return list;
    }
}
