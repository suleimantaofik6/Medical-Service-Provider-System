package it.unicas.products.action.Transactions;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.products.dao.TransactionsManagementDAO;
import it.unicas.products.pojo.MedicalRecordes;

import java.util.List;

public class SelectTransection extends ActionSupport {

    private int patientId;
    private String patientName;
    private int idDoctor;
    private String nameDoctor;
    private int  serviceId;
    private String serviceName;
    private List<MedicalRecordes> medicalRecorde;

    public void initializeProducts() {
        System.out.println("****** Filter Data ******");
        System.out.println(patientId);
        medicalRecorde = TransactionsManagementDAO.getAllMedicalRecordes(patientId);
        System.out.println(medicalRecorde);
    }

    public String execute() {
        initializeProducts();
        return "success";
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getNameDoctor() {
        return nameDoctor;
    }

    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public List<MedicalRecordes> getMedicalRecorde() {
        return medicalRecorde;
    }

    public void setMedicalRecorde(List<MedicalRecordes> medicalRecorde) {
        this.medicalRecorde = medicalRecorde;
    }
}
