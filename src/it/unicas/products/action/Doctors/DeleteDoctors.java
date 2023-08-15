package it.unicas.products.action.Doctors;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.products.dao.DoctorstManagementDAO;

public class DeleteDoctors extends ActionSupport {

    private int idDoctor;

    public String execute() {
        String statusCode = "";
        int recordDeleted = DoctorstManagementDAO.deleteDoctors(idDoctor);
        if (recordDeleted == 1) {
            statusCode = "success";
        } else {
            statusCode = "error";
        }
        return statusCode;
    }


    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }
}
