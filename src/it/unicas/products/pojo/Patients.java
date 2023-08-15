package it.unicas.products.pojo;

public class Patients {

    private String patientId;
    private String patientName;
    private int patiantAge;
    private String patientGender;
    private int patientPhone;

    public Patients() {
        // TODO Auto-generated constructor stub
    }

    public Patients(String patientId, String patientName, int patiantAge, String patientGender,
                    int patientPhone) {
        super();
        this.patientId = patientId;
        this.patientName = patientName;
        this.patiantAge = patiantAge;
        this.patientGender = patientGender;
        this.patientPhone = patientPhone;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatiantAge() {
        return patiantAge;
    }

    public void setPatiantAge(int patiantAge) {
        this.patiantAge = patiantAge;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public int getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(int patientPhone) {
        this.patientPhone = patientPhone;
    }

    @Override
    public String toString() {
        return "patients{" +
                "patientId='" + patientId + '\'' +
                ", patientName='" + patientName + '\'' +
                ", patiantAge=" + patiantAge +
                ", patientGender='" + patientGender + '\'' +
                ", patientPhone=" + patientPhone +
                '}';
    }
}
