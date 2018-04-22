package services;

import beans.OrdersBean;
import ConnectionToDB.SingletoneConnection;
import dao.OrdersDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrdersService implements OrdersDAO {

    @Override
    public ArrayList<OrdersBean> getAll() {
        ArrayList<OrdersBean> list = new ArrayList<>();
        try (Connection connection = SingletoneConnection.getDataSource().getConnection()) {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM orders");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                OrdersBean ob = new OrdersBean();
                ob.setOrderID(rs.getInt("order_id"));
                ob.setWorkerID(rs.getInt("worker_id"));
                ob.setOrderDate(rs.getDate("order_date"));
                ob.setCost(rs.getDouble("cost"));
                list.add(ob);
            }
        } catch (SQLException e) {
            System.out.println("Ошибка " + e);
        }
        return list;
    }
}
