package it.unicas.products.pojo;

public class MedicalRecordes {

    private int id;
    private int patientId;
    private String patientName;
    private int idDoctor;
    private String nameDoctor;
    private int  serviceId;
    private String serviceName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getNameDoctor() {
        return nameDoctor;
    }

    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String toString() {
        return "MedicalRecordes{" +
                "id=" + id +
                ", patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                ", idDoctor=" + idDoctor +
                ", nameDoctor='" + nameDoctor + '\'' +
                ", serviceId=" + serviceId +
                ", serviceName='" + serviceName + '\'' +
                '}';
    }

    public MedicalRecordes(int id, int patientId, String patientName, int idDoctor, String nameDoctor, int serviceId, String serviceName) {
        this.id=id;
        this.patientId = patientId;
        this.patientName = patientName;
        this.idDoctor = idDoctor;
        this.nameDoctor = nameDoctor;
        this.serviceId = serviceId;
        this.serviceName = serviceName;
    }

    public MedicalRecordes() {
    }
}
