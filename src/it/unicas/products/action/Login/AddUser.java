package it.unicas.products.action.Login;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.products.dao.ProductManagementDAO;
import it.unicas.products.dao.UsersManagementDAO;
import it.unicas.products.pojo.Users;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AddUser extends ActionSupport {

    private int idlogin_info;
    private String user_name;
    private String password;
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

    public String execute() {
        String statusCode = "";
        if(idlogin_info!=0 ||user_name!=""||password!=""||type!="") {
            Users users = new Users(idlogin_info, user_name, password,type);
            System.out.println(this.toString());
            int recordAdded = UsersManagementDAO.addUser(users);
            if (recordAdded == 1) {
                statusCode = SUCCESS;
            } else {
                statusCode = ERROR;
            }
        }
        else {
            statusCode=INPUT;
        }
        return statusCode;
    }
}
