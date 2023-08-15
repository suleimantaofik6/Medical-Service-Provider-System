package it.unicas.products.action.Doctors;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.products.dao.DoctorstManagementDAO;
import it.unicas.products.dao.PatientManagementDAO;
import it.unicas.products.pojo.Doctors;

public class UpdateDoctorsInterface extends ActionSupport {

    private int idDoctor;
    private String nameDoctor;
    private String majorDoctor;
    private String addressDoctor;
    private int phoneDoctor;

    public int getIdDoctor() {
        return idDoctor;
    }

    public String getNameDoctor() {
        return nameDoctor;
    }

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
        Doctors doctors = DoctorstManagementDAO.getDoctorById(idDoctor);
        idDoctor = doctors.getIdDoctor();
        nameDoctor = doctors.getNameDoctor();
        majorDoctor = doctors.getMajorDoctor();
        addressDoctor = doctors.getAddressDoctor();
        phoneDoctor = doctors.getPhoneDoctor();
        return "success";
    }
}
