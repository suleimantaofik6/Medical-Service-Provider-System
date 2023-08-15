package it.unicas.products.action.patients;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.products.dao.PatientManagementDAO;
import it.unicas.products.pojo.Patients;

import java.util.Objects;

public class AddAction extends ActionSupport {

    private String patientId;
    private String patientName;
    private int patiantAge;
    private String patientGender;
    private int patientPhone;

    public String execute() {
        String statusCode = "";
        if(patiantAge!=0 && !Objects.equals(patientGender, "") && !Objects.equals(patientId, "") && !Objects.equals(patientName, "")
        &&patientPhone!=0) {

            Patients patients = new Patients(patientId, patientName, patiantAge, patientGender, patientPhone);
            int recordAdded = PatientManagementDAO.addPatient(patients);
            if (recordAdded == 1) {
                statusCode = SUCCESS;
            }
            else {
                statusCode = ERROR;
            }
        }
        else {
            statusCode = INPUT;
        }
        return statusCode;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatiantAge() {
        return patiantAge;
    }

    public void setPatiantAge(int patiantAge) {
        this.patiantAge = patiantAge;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public int getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(int patientPhone) {
        this.patientPhone = patientPhone;
    }

    @Override
    public String toString() {
        return "AddAction{" +
                "patientId='" + patientId + '\'' +
                ", patientName='" + patientName + '\'' +
                ", patiantAge=" + patiantAge +
                ", patientGender='" + patientGender + '\'' +
                ", patientPhone=" + patientPhone +
                '}';
    }
}
