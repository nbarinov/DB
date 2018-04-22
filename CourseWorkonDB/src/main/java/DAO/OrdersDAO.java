package DAO;

import Beans.OrdersBean;

import java.util.ArrayList;

public interface OrdersDAO {
    ArrayList<OrdersBean> getAll();
}
