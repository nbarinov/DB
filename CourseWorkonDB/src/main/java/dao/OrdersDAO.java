package dao;

import beans.OrdersBean;

import java.util.ArrayList;

public interface OrdersDAO {
    ArrayList<OrdersBean> getAll();
}
