package it.unicas.products.action.Services;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.products.dao.ServeciesManagementDAO;
import it.unicas.products.pojo.Servecies;

import java.util.List;

public class SelectServicesData extends ActionSupport {

    private String name;
    private String patientId;
    private String doctorId;


    public List<Servecies> getServecies() {
        return servecies;
    }

    public void setServecies(List<Servecies> servecies) {
        this.servecies = servecies;
    }

    private List<Servecies> servecies;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SelectServicesdata{" +
                "name='" + name + '\'' +
                '}';
    }

    public void initializeProducts() {
        System.out.println("****** Filter Data ******");
        System.out.println(name);
        servecies = ServeciesManagementDAO.getAllServices(name);
    }

    public String execute() {
        initializeProducts();
        return "success";
    }

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
