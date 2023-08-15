package it.unicas.products.action.Login;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.products.dao.DoctorstManagementDAO;
import it.unicas.products.dao.UsersManagementDAO;
import it.unicas.products.pojo.Users;

import java.util.List;

public class SelectUsersData extends ActionSupport {

    private String user_name;
    private List<Users> users;

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void initializeProducts() {
        System.out.println("****** Filter Data ******");
        System.out.println(user_name);
        users = UsersManagementDAO.getAllUsers(user_name);
    }

    public String execute() {
        initializeProducts();
        return "success";
    }

}
