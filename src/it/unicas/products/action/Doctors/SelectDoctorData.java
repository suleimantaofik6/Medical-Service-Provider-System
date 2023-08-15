package it.unicas.products.action.Doctors;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.products.dao.DoctorstManagementDAO;
import it.unicas.products.pojo.Doctors;

import java.util.List;

public class SelectDoctorData extends ActionSupport {
    private List<Doctors> doctors;
    private String doctorName;
    private String patientId;

    public void initializeProducts() {
        System.out.println("****** Filter Data ******");
        System.out.println(doctorName);
        doctors = DoctorstManagementDAO.getAllDoctors(doctorName);
    }

    public String execute() {
        initializeProducts();
        return "success";
    }



    public void setDoctors(List<Doctors> doctors) {
        this.doctors = doctors;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public List<Doctors> getDoctors() {
        return doctors;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
}
