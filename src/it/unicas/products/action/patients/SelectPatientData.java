package it.unicas.products.action.patients;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.products.dao.PatientManagementDAO;
import it.unicas.products.pojo.Patients;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class SelectPatientData extends ActionSupport {
    private List<Patients> patients;
    private String patientName;

    public void initializeProducts() {
        System.out.println("****** Filter Data ******");
        System.out.println(patientName);
        patients = PatientManagementDAO.getAllPatients(patientName);
    }

    public String execute() {
        initializeProducts();
        return "success";
    }

    public void setPatients(List<Patients> patients) {
        this.patients = patients;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public List<Patients> getPatients() {
        return patients;
    }

    public String getPatientName() {
        return patientName;
    }
}
