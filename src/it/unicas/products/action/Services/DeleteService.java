package it.unicas.products.action.Services;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.products.dao.ServeciesManagementDAO;

public class DeleteService extends ActionSupport {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DeleteService{" +
                "id=" + id +
                '}';
    }

    public String execute() {
        String statusCode = "";
        int recordDeleted = ServeciesManagementDAO.deleteService(id);
        if (recordDeleted == 1) {
            statusCode = "success";
        } else {
            statusCode = "error";
        }
        return statusCode;
    }

}
