package it.unicas.products.dao;

import it.unicas.products.dbutil.DBUtil;
import it.unicas.products.pojo.Patients;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PatientManagementDAO {

    public static int addPatient(Patients patients) {
        int status = 0;
        try
        {
            Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO patients VALUES(?,?,?,?,?)");
            ps.setString(1, patients.getPatientId());
            ps.setString(2, patients.getPatientName());
            ps.setInt(3,patients.getPatiantAge());
            ps.setString(4, patients.getPatientGender());
            ps.setInt(5, patients.getPatientPhone());
            status = ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return status;
    }


    public static List<Patients> getAllPatients(String PatientName) {
        List<Patients> patientList = new ArrayList<Patients>();
        String whereClause = "";
        if((PatientName == null || PatientName.equals(""))) {
            whereClause = "";
        }
        else {
            whereClause = " WHERE ";
        }
        int count = 0;
        if(PatientName != null && !PatientName.equals("")) {
            count ++;
            if(count != 1) {
                whereClause += " AND ";
            }
            whereClause += "patientName = "+"'"+PatientName+"'";
        }
        try
        {
            Connection conn = DBUtil.getConnection();
            Statement st= conn.createStatement();
            System.out.println("SELECT * FROM patients"+whereClause);
            ResultSet rs= st.executeQuery("SELECT * FROM patients"+whereClause);
            while(rs.next())
            {
                Patients patients = new Patients(rs.getString("patientId"),rs.getString("patientName"),
                        rs.getInt("patiantAge"),rs.getString("patientGender")
                ,rs.getInt("patientPhone"));
                patientList.add(patients);
            }
            DBUtil.closeConnection(conn);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return patientList;
    }


    public static int deletePatient(String patientId) {
        int status = 0;
        try
        {
            Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM patients where patientId = ?");
            ps.setString(1, patientId);
            status = ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return status;
    }


    public static int updatePatient(Patients patients) {
        int status = 0;
        try
        {
            Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement("UPDATE patients SET patientName=?, patiantAge=?, patientGender=?" +
                    ",patientPhone=? WHERE patientId=?");
            ps.setString(1, patients.getPatientName());
            ps.setInt(2, patients.getPatiantAge());
            ps.setString(3, patients.getPatientGender());
            ps.setInt(4, patients.getPatientPhone());
            ps.setString(5, patients.getPatientId());

            status = ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return status;
    }



    public static Patients getPatientById(String patientId) {
        Patients patients = null;
        try
        {
            Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM patients WHERE patientId = ?");
            ps.setString(1, patientId);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                patients = new Patients(rs.getString("patientId"),rs.getString("patientName"),rs.getInt("patiantAge"),rs.getString("patientGender"),rs.getInt("patientPhone"));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return patients;
    }
}
