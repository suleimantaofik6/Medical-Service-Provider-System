package it.unicas.products.action.Services;

import com.opensymphony.xwork2.ActionSupport;
import it.unicas.products.dao.PatientManagementDAO;
import it.unicas.products.dao.ServeciesManagementDAO;
import it.unicas.products.pojo.Servecies;

import java.util.Objects;

public class AddService extends ActionSupport {


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
        return "AddService{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String execute() {
        String statusCode = "";
        if(id!=0 && !Objects.equals(name, "") && price!=0) {

            Servecies servecies = new Servecies(id, name, price);
            int recordAdded = ServeciesManagementDAO.addServecie(servecies);
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

}
