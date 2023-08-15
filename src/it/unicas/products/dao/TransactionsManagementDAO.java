package it.unicas.products.dao;

import it.unicas.products.dbutil.DBUtil;
import it.unicas.products.pojo.MedicalRecordes;
import it.unicas.products.pojo.Transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TransactionsManagementDAO {

    public static int addTransaction(Transaction transaction) {
        int status = 0;
        try
        {
            Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO `products`.`transaction`\n" +
                    "(`FK_Doctor`, `FK_Patient`, `Fk_Service`)\n" +
                    "VALUES\n" +
                    "(?,?,?)");
            ps.setInt(1, transaction.getFK_Doctor());
            ps.setString(2, transaction.getFK_Patient());
            ps.setInt(3, transaction.getFk_Service());
            status = ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return status;
    }


    public static List<MedicalRecordes> getAllMedicalRecordes(int idPatient) {
        List<MedicalRecordes> medicalRecordesList = new ArrayList<MedicalRecordes>();

        try {
            Connection conn = DBUtil.getConnection();
            Statement st = conn.createStatement();
            System.out.println("SELECT * FROM MedicalRecorde");
            PreparedStatement ps = conn.prepareStatement("SELECT transaction.id, patients.patientId, patients.patientName, doctors.idDoctor, doctors.nameDoctor, servecies.id, servecies.name\n" +
                    "FROM products.transaction\n" +
                    "INNER JOIN patients ON patients.patientId = transaction.FK_Patient\n" +
                    "INNER JOIN doctors ON doctors.idDoctor = transaction.FK_Doctor\n" +
                    "INNER JOIN servecies ON servecies.id = transaction.FK_Service\n" +
                    "WHERE patients.patientId =?;");
            ps.setInt(1, idPatient);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MedicalRecordes medicalRecordes = new MedicalRecordes(rs.getInt("id"),rs.getInt("patientId"), rs.getString("patientName"),
                        rs.getInt("idDoctor"), rs.getString("nameDoctor"),
                        rs.getInt("id"), rs.getString("name"));
                medicalRecordesList.add(medicalRecordes);
            }
            DBUtil.closeConnection(conn);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return medicalRecordesList;
    }

    public static int deleteTransection(int id) {
        int status = 0;
        try {
            Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM transaction where id = ?");
            ps.setInt(1, id);
            status = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

}
