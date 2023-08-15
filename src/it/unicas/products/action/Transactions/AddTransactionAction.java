package it.unicas.products.action.Transactions;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.products.dao.TransactionsManagementDAO;
import it.unicas.products.pojo.Transaction;

public class AddTransactionAction extends ActionSupport {
    private int id;
    private int FK_Doctor;
    private String FK_Patient;
    private int Fk_Service;

    public void setId(int id) {
        this.id = id;
    }

    public int getFK_Doctor() {
        return FK_Doctor;
    }

    public void setFK_Doctor(int FK_Doctor) {
        this.FK_Doctor = FK_Doctor;
    }

    public String getFK_Patient() {
        return FK_Patient;
    }

    public void setFK_Patient(String FK_Patient) {
        this.FK_Patient = FK_Patient;
    }

    public int getFk_Service() {
        return Fk_Service;
    }

    public void setFk_Service(int fk_Service) {
        Fk_Service = fk_Service;
    }


    public int getId() {
        return id;
    }

    public String execute() {
        String statusCode = "";
        Transaction transaction = new Transaction(1,FK_Doctor,FK_Patient,Fk_Service);
        System.out.println(this.toString());
        int recordAdded = TransactionsManagementDAO.addTransaction(transaction);
        if (recordAdded == 1) {
            statusCode = SUCCESS;
        } else {
            statusCode = ERROR;
        }
        return statusCode;
    }

    @Override
    public String toString() {
        return "AddTransactionAction{" +
                "id=" + id +
                ", FK_Doctor=" + FK_Doctor +
                ", FK_Patient='" + FK_Patient + '\'' +
                ", Fk_Service=" + Fk_Service +
                '}';
    }

    private String patientId;
    private String doctorId;

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }
}
