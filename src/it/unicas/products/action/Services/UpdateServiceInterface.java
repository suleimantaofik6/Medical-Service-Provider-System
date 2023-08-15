package it.unicas.products.action.Services;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.products.dao.ServeciesManagementDAO;
import it.unicas.products.pojo.Servecies;

public class UpdateServiceInterface extends ActionSupport {
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
        return "UpdateServiceInterface{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String execute() {
        Servecies servecies = ServeciesManagementDAO.getServiceById(id);
        id = servecies.getId();
        name = servecies.getName();
        price = servecies.getPrice();
        return "success";
    }
}
