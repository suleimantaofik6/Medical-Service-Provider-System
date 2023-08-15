package it.unicas.products.action.Services;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.products.dao.ServeciesManagementDAO;
import it.unicas.products.pojo.Servecies;

public class UpdateServices extends ActionSupport {

    private int id;
    private String name;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "UpdateServices{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String execute() {
        String statusCode = "";
        Servecies servecies = new Servecies(id, name, price);
        int recordUpdated = ServeciesManagementDAO.updateService(servecies);
        if (recordUpdated == 1) {
            statusCode = "success";
        } else {
            statusCode = "error";
        }
        return statusCode;
    }
}
