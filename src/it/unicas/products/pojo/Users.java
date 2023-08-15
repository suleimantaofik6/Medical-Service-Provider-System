package it.unicas.products.pojo;

public class Users {

    private int idlogin_info;
    private String user_name;
    private String password;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type ;

    @Override
    public String toString() {
        return "Users{" +
                "idlogin_info=" + idlogin_info +
                ", user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    public void setIdlogin_info(int idlogin_info) {
        this.idlogin_info = idlogin_info;
    }


    public Users(int idlogin_info, String user_name, String password, String type) {
        this.idlogin_info = idlogin_info;
        this.user_name = user_name;
        this.password = password;
        this.type = type;
    }

    public Users(){
        // TODO Auto-generated constructor stub
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdlogin_info() {
        return idlogin_info;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getPassword() {
        return password;
    }
}
