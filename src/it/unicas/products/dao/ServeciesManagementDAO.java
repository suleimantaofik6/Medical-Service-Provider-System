package it.unicas.products.dao;

import it.unicas.products.dbutil.DBUtil;
import it.unicas.products.pojo.Servecies;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ServeciesManagementDAO {

    public static int addServecie(Servecies servecies) {
        int status = 0;
        try {
            Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO servecies VALUES(?,?,?)");
            ps.setInt(1, servecies.getId());
            ps.setString(2, servecies.getName());
            ps.setInt(3, servecies.getPrice());
            status = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    public static List<Servecies> getAllServices(String nameService) {
        List<Servecies> servicesList = new ArrayList<Servecies>();
        String whereClause = "";
        if ((nameService == null || nameService.equals(""))) {
            whereClause = "";
        } else {
            whereClause = " WHERE ";
        }
        int count = 0;
        if (nameService != null && !nameService.equals("")) {
            count++;
            if (count != 1) {
                whereClause += " AND ";
            }
            whereClause += "name = " + "'" + nameService + "'";
        }
        try {
            Connection conn = DBUtil.getConnection();
            Statement st = conn.createStatement();
            System.out.println("SELECT * FROM servecies" + whereClause);
            ResultSet rs = st.executeQuery("SELECT * FROM servecies" + whereClause);
            while (rs.next()) {
                Servecies servecies = new Servecies(rs.getInt("id"), rs.getString("name"),
                        rs.getInt("price"));
                servicesList.add(servecies);
            }
            DBUtil.closeConnection(conn);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return servicesList;
    }


    public static int deleteService(int id) {
        int status = 0;
        try {
            Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM servecies where id = ?");
            ps.setInt(1, id);
            status = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    public static Servecies getServiceById(int idService) {
        Servecies servecies = null;
        try {
            Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM servecies WHERE id = ?");
            ps.setInt(1, idService);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                servecies = new Servecies(rs.getInt("id"), rs.getString("name"),
                        rs.getInt("price"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return servecies;
    }

    public static int updateService(Servecies servecies) {
        int status = 0;
        try
        {
            Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement("UPDATE servecies SET name=?, price=?  WHERE id=?");
            ps.setString(1, servecies.getName());
            ps.setInt(2, servecies.getPrice());
            ps.setInt(3, servecies.getId());
            status = ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return status;
    }
}
