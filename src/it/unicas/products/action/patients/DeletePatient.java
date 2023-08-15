package it.unicas.products.action.patients;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.products.dao.PatientManagementDAO;
import it.unicas.products.dao.ProductManagementDAO;

public class DeletePatient extends ActionSupport {
    private String patientId;

    public String execute() {
        String statusCode = "";
        int recordDeleted = PatientManagementDAO.deletePatient(patientId);
        if (recordDeleted == 1) {
            statusCode = "success";
        } else {
            statusCode = "error";
        }
        return statusCode;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientId() {
        return patientId;
    }
}
