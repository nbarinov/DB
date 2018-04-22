package services;

import beans.AutocompaniesBean;
import ConnectionToDB.SingletoneConnection;
import dao.AutocompaniesDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AutocompaniesService implements AutocompaniesDAO {

    @Override
    public ArrayList<AutocompaniesBean> getAll() {
        ArrayList<AutocompaniesBean> list = new ArrayList<>();
        try(Connection connection = SingletoneConnection.getDataSource().getConnection()){
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM autocompanies");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                AutocompaniesBean tb = new AutocompaniesBean();
                tb.setAutocompanyID(rs.getInt("autocompany_id"));
                tb.setTitle(rs.getString("title"));
                tb.setContactNumber(rs.getShort("contact_number"));
                tb.setPhoneNumber(rs.getString("phone_number"));
                list.add(tb);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return list;
    }
}
