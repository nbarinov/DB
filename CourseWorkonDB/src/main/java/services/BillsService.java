package services;

import beans.BillsBean;
import ConnectionToDB.SingletoneConnection;
import dao.BillsDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BillsService implements BillsDAO {

    @Override
    public ArrayList<BillsBean> getAll() {
        ArrayList<BillsBean> list = new ArrayList<>();
        try(Connection connection = SingletoneConnection.getDataSource().getConnection()){
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM bills");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                BillsBean tb = new BillsBean();
                tb.setBillID(rs.getInt("bill_id"));
                tb.setPurchaseDate(rs.getDate("purchase_date"));
                tb.setCost(rs.getDouble("cost"));
                tb.setOrderID(rs.getInt("order_id"));
                list.add(tb);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return list;
    }
}
