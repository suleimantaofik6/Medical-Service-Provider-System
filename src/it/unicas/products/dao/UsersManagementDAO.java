package it.unicas.products.dao;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.products.dbutil.DBUtil;
import it.unicas.products.pojo.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsersManagementDAO {

    public static int addUser(Users users) {
        int status = 0;
        try {
            Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO login_info VALUES(?,?,?,?)");
            ps.setInt(1, users.getIdlogin_info());
            ps.setString(2, users.getUser_name());
            ps.setString(3, users.getPassword());
            ps.setString(4, users.getType());
            status = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }


    public static List<Users> getAllUsers(String nameUser) {
        List<Users> usersList = new ArrayList<Users>();
        String whereClause = "";
        if ((nameUser == null || nameUser.equals(""))) {
            whereClause = "";
        } else {
            whereClause = " WHERE ";
        }
        int count = 0;
        if (nameUser != null && !nameUser.equals("")) {
            count++;
            if (count != 1) {
                whereClause += " AND ";
            }
            whereClause += "user_name = " + "'" + nameUser + "'";
        }
        try {
            Connection conn = DBUtil.getConnection();
            Statement st = conn.createStatement();
            System.out.println("SELECT * FROM login_info" + whereClause);
            ResultSet rs = st.executeQuery("SELECT * FROM login_info" + whereClause);
            while (rs.next()) {
                Users users = new Users(rs.getInt("idlogin_info"), rs.getString("user_name"),
                        rs.getString("password"),rs.getString("type"));
                usersList.add(users);
            }
            DBUtil.closeConnection(conn);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return usersList;
    }


    public static int deleteUsers(int idUser) {
        int status = 0;
        try {
            Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM login_info where idlogin_info = ?");
            ps.setInt(1, idUser);
            status = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    public static Users getUsersById(int idUser) {
        Users users = null;
        try {
            Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM login_info WHERE idlogin_info = ?");
            ps.setInt(1, idUser);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                users = new Users(rs.getInt("idlogin_info"), rs.getString("user_name"),
                        rs.getString("password"),rs.getString("type"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return users;
    }



    public static int updateUsers(Users users) {
        int status = 0;
        try
        {
            Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement("UPDATE login_info SET user_name=?, password=? , type=? WHERE idlogin_info=?");
            ps.setString(1, users.getUser_name());
            ps.setString(2, users.getPassword());
            ps.setString(3, users.getType());
            ps.setInt(4, users.getIdlogin_info());


            status = ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return status;
    }
}