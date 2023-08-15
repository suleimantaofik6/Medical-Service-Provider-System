package it.unicas.products.pojo;

public class Doctors {
    private int idDoctor;
    private String nameDoctor;
    private String majorDoctor;
    private String addressDoctor;
    private int phoneDoctor;

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public void setMajorDoctor(String majorDoctor) {
        this.majorDoctor = majorDoctor;
    }

    public void setAddressDoctor(String addressDoctor) {
        this.addressDoctor = addressDoctor;
    }

    public void setPhoneDoctor(int phoneDoctor) {
        this.phoneDoctor = phoneDoctor;
    }

    public String getNameDoctor() {
        return nameDoctor;
    }

    public String getMajorDoctor() {
        return majorDoctor;
    }

    public String getAddressDoctor() {
        return addressDoctor;
    }

    public int getPhoneDoctor() {
        return phoneDoctor;
    }

    @Override
    public String toString() {
        return "Doctors{" +
                "idDoctor=" + idDoctor +
                ", nameDoctor='" + nameDoctor + '\'' +
                ", majorDoctor='" + majorDoctor + '\'' +
                ", addressDoctor='" + addressDoctor + '\'' +
                ", phoneDoctor=" + phoneDoctor +
                '}';
    }

    public Doctors(int idDoctor, String nameDoctor, String majorDoctor, String addressDoctor, int phoneDoctor) {
        this.idDoctor = idDoctor;
        this.nameDoctor = nameDoctor;
        this.majorDoctor = majorDoctor;
        this.addressDoctor = addressDoctor;
        this.phoneDoctor = phoneDoctor;
    }

    public Doctors() {
            // TODO Auto-generated constructor stub
        }
}
