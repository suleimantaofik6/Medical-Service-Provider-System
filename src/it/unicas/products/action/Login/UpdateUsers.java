package it.unicas.products.action.Login;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.products.dao.UsersManagementDAO;
import it.unicas.products.pojo.Users;

public class UpdateUsers extends ActionSupport {

    private int idlogin_info;
    private String user_name;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIdlogin_info() {
        return idlogin_info;
    }

    public void setIdlogin_info(int idlogin_info) {
        this.idlogin_info = idlogin_info;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public String execute() {
        String statusCode = "";
        Users users = new Users(idlogin_info, user_name,password,type);
        int recordUpdated = UsersManagementDAO.updateUsers(users);
        if (recordUpdated == 1) {
            statusCode = "success";
        } else {
            statusCode = "error";
        }
        return statusCode;
    }
}
