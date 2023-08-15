package it.unicas.products.action.patients;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.products.dao.PatientManagementDAO;
import it.unicas.products.dao.ProductManagementDAO;
import it.unicas.products.pojo.Patients;

public class UpdatePatientInterface extends ActionSupport {



    private String patientName;
    private int patiantAge;
    private String patientGender;
    private int patientPhone;

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setPatiantAge(int patiantAge) {
        this.patiantAge = patiantAge;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public void setPatientPhone(int patientPhone) {
        this.patientPhone = patientPhone;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    private String patientId;

    public String getPatientName() {
        return patientName;
    }

    public int getPatiantAge() {
        return patiantAge;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public int getPatientPhone() {
        return patientPhone;
    }

    public String getPatientId() {
        return patientId;
    }

    public String execute() {
        Patients patients = PatientManagementDAO.getPatientById(patientId);
        patientId = patients.getPatientId();
        patientName = patients.getPatientName();
        patiantAge = patients.getPatiantAge();
        patientGender = patients.getPatientGender();
        patientPhone = patients.getPatientPhone();
        return "success";
    }
}
