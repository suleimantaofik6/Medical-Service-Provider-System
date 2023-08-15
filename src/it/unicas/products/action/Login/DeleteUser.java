package it.unicas.products.action.Login;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.products.dao.DoctorstManagementDAO;
import it.unicas.products.dao.UsersManagementDAO;

public class DeleteUser extends ActionSupport {

    private int idlogin_info;

    public int getIdlogin_info() {
        return idlogin_info;
    }

    public void setIdlogin_info(int idlogin_info) {
        this.idlogin_info = idlogin_info;
    }
    public String execute() {
        String statusCode = "";
        int recordDeleted = UsersManagementDAO.deleteUsers(idlogin_info);
        if (recordDeleted == 1) {
            statusCode = "success";
        } else {
            statusCode = "error";
        }
        return statusCode;
    }
}
