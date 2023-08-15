package it.unicas.products.action.Transactions;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.products.dao.TransactionsManagementDAO;

public class deleteTransection extends ActionSupport {

    private int patientId;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String execute() {
        String statusCode = "";
        int recordDeleted = TransactionsManagementDAO.deleteTransection(id);
        if (recordDeleted == 1) {
            statusCode = "success";
        } else {
            statusCode = "error";
        }
        return statusCode;
    }
}
