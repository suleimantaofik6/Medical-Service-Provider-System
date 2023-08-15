package it.unicas.products.action.Doctors;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.products.dao.DoctorstManagementDAO;
import it.unicas.products.dao.PatientManagementDAO;
import it.unicas.products.pojo.Doctors;

public class UpdateDoctors extends ActionSupport {

    private int idDoctor;
    private String nameDoctor;
    private String majorDoctor;
    private String addressDoctor;
    private int phoneDoctor;

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public void setMajorDoctor(String majorDoctor) {
        this.majorDoctor = majorDoctor;
    }

    public void setAddressDoctor(String addressDoctor) {
        this.addressDoctor = addressDoctor;
    }

    public void setPhoneDoctor(int phoneDoctor) {
        this.phoneDoctor = phoneDoctor;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public String getNameDoctor() {
        return nameDoctor;
    }

    public String getMajorDoctor() {
        return majorDoctor;
    }

    public String getAddressDoctor() {
        return addressDoctor;
    }

    public int getPhoneDoctor() {
        return phoneDoctor;
    }

    public String execute() {
        String statusCode = "";
        Doctors doctors = new Doctors(idDoctor, nameDoctor,majorDoctor, addressDoctor,phoneDoctor);
        int recordUpdated = DoctorstManagementDAO.updateDoctors(doctors);
        if (recordUpdated == 1) {
            statusCode = "success";
        } else {
            statusCode = "error";
        }
        return statusCode;
    }
}
