package it.unicas.products.dao;

import it.unicas.products.dbutil.DBUtil;
import it.unicas.products.pojo.Doctors;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DoctorstManagementDAO {

    public static int addDoctor(Doctors doctors) {
        int status = 0;
        try
        {
            Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO doctors VALUES(?,?,?,?,?)");
            ps.setInt(1, doctors.getIdDoctor());
            ps.setString(2, doctors.getNameDoctor());
            ps.setString(3,doctors.getMajorDoctor());
            ps.setString(4, doctors.getAddressDoctor());
            ps.setInt(5, doctors.getPhoneDoctor());
            status = ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return status;
    }


    public static List<Doctors> getAllDoctors(String nameDoctor) {
        List<Doctors> doctorList = new ArrayList<Doctors>();
        String whereClause = "";
        if((nameDoctor == null || nameDoctor.equals(""))) {
            whereClause = "";
        }
        else {
            whereClause = " WHERE ";
        }
        int count = 0;
        if(nameDoctor != null && !nameDoctor.equals("")) {
            count ++;
            if(count != 1) {
                whereClause += " AND ";
            }
            whereClause += "nameDoctor = "+"'"+nameDoctor+"'";
        }
        try
        {
            Connection conn = DBUtil.getConnection();
            Statement st= conn.createStatement();
            System.out.println("SELECT * FROM doctors21131"+whereClause);
            ResultSet rs= st.executeQuery("SELECT * FROM doctors"+whereClause);
            while(rs.next())
            {
                Doctors doctors = new Doctors(rs.getInt("idDoctor"),rs.getString("nameDoctor"),
                        rs.getString("majorDoctor"),rs.getString("addressDoctor")
                        ,rs.getInt("phoneDoctor"));
                doctorList.add(doctors);
            }
            DBUtil.closeConnection(conn);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return doctorList;
    }


    public static int deleteDoctors(int idDoctor) {
        int status = 0;
        try
        {
            Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM doctors where idDoctor = ?");
            ps.setInt(1, idDoctor);
            status = ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return status;
    }

    public static Doctors getDoctorById(int idDoctor) {
        Doctors doctors = null;
        try
        {
            Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM doctors WHERE idDoctor = ?");
            ps.setInt(1, idDoctor);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                doctors = new Doctors(rs.getInt("idDoctor"),rs.getString("nameDoctor"),rs.getString("majorDoctor"),rs.getString("addressDoctor"),rs.getInt("phoneDoctor"));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return doctors;
    }



    public static int updateDoctors(Doctors doctors) {
        int status = 0;
        try
        {
            Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement("UPDATE doctors SET nameDoctor=?, majorDoctor=?, addressDoctor=?" +
                    ",phoneDoctor=? WHERE idDoctor=?");
            ps.setString(1, doctors.getNameDoctor());
            ps.setString(2, doctors.getMajorDoctor());
            ps.setString(3, doctors.getAddressDoctor());
            ps.setInt(4, doctors.getPhoneDoctor());
            ps.setInt(5, doctors.getIdDoctor());

            status = ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return status;
    }


}
