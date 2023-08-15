package it.unicas.products.action.patients;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.products.dao.PatientManagementDAO;
import it.unicas.products.dao.ProductManagementDAO;
import it.unicas.products.pojo.Patients;

public class UpdatePatient extends ActionSupport {

    private String patientName;
    private int patiantAge;
    private String patientGender;
    private int patientPhone;
    private String patientId;

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

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

    public String execute() {
        String statusCode = "";
        Patients patients = new Patients(patientId, patientName, patiantAge, patientGender,patientPhone);
        int recordUpdated = PatientManagementDAO.updatePatient(patients);
        if (recordUpdated == 1) {
            statusCode = "success";
        } else {
            statusCode = "error";
        }
        return statusCode;
    }
}
