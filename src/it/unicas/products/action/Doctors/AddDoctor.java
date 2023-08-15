package it.unicas.products.action.Doctors;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.products.dao.DoctorstManagementDAO;
import it.unicas.products.dao.PatientManagementDAO;
import it.unicas.products.pojo.Doctors;

import java.util.Objects;

public class AddDoctor extends ActionSupport {

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

    public String getMajorDoctor() {
        return majorDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }


    public String execute() {
        String statusCode = "";
        if(idDoctor!=0 && !Objects.equals(nameDoctor, "") && !Objects.equals(addressDoctor, "") && !Objects.equals(majorDoctor, "")
                &&phoneDoctor!=0) {

            Doctors doctors = new Doctors(idDoctor, nameDoctor, majorDoctor, addressDoctor, phoneDoctor);
            int recordAdded = DoctorstManagementDAO.addDoctor(doctors);
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

    @Override
    public String toString() {
        return "AddDoctor{" +
                "idDoctor=" + idDoctor +
                ", nameDoctor='" + nameDoctor + '\'' +
                ", majorDoctor='" + majorDoctor + '\'' +
                ", addressDoctor='" + addressDoctor + '\'' +
                ", phoneDoctor=" + phoneDoctor +
                '}';
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

    public String getAddressDoctor() {
        return addressDoctor;
    }

    public int getPhoneDoctor() {
        return phoneDoctor;
    }
}
