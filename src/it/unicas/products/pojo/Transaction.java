package it.unicas.products.pojo;

public class Transaction {
    private int id;
    private int FK_Doctor;
    private String FK_Patient;
    private int Fk_Service;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFK_Doctor() {
        return FK_Doctor;
    }

    public void setFK_Doctor(int FK_Doctor) {
        this.FK_Doctor = FK_Doctor;
    }

    public String getFK_Patient() {
        return FK_Patient;
    }

    public void setFK_Patient(String FK_Patient) {
        this.FK_Patient = FK_Patient;
    }

    public int getFk_Service() {
        return Fk_Service;
    }

    public void setFk_Service(int fk_Service) {
        Fk_Service = fk_Service;
    }



    public Transaction(int id, int FK_Doctor, String FK_Patient, int fk_Service) {
        this.id = id;
        this.FK_Doctor = FK_Doctor;
        this.FK_Patient = FK_Patient;
        Fk_Service = fk_Service;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", FK_Doctor=" + FK_Doctor +
                ", FK_Patient='" + FK_Patient + '\'' +
                ", Fk_Service=" + Fk_Service +
                '}';
    }
}
