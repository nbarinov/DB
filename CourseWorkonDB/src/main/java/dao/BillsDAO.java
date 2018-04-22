package dao;

import beans.BillsBean;

import java.util.ArrayList;

public interface BillsDAO {

    ArrayList<BillsBean> getAll();
}