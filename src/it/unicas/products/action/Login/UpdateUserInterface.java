package it.unicas.products.action.Login;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.products.dao.UsersManagementDAO;
import it.unicas.products.pojo.Users;

public class UpdateUserInterface extends ActionSupport {

    private int idlogin_info;
    private String user_name;
    private String password;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;

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
        Users users = UsersManagementDAO.getUsersById(idlogin_info);
        idlogin_info = users.getIdlogin_info();
        user_name = users.getUser_name();
        password = users.getPassword();
        type=users.getType();
        return "success";
    }

}
